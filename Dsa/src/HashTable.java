//for good hash table we have to
//minimize collision distribute key evenly-we have to used link list for that
//all info provided by key
//to keep high load factor; load factor=no of elements in hash table/hash table size;
//array bucket taken of size 10 and we can store multiple values at one index. so over all our load factor is going to be high.


//class hash table which contains array,array size,and link-list size;
public class HashTable {
	private HashNode[] buckets;
	private int numofBuckets;
	private int size;
	//default size of array=10
	public HashTable() {
		this(10);
	}
	public HashTable(int capacity) {
		this.numofBuckets=capacity;
		this.buckets=new HashNode[numofBuckets];
		this.size=0;
		
	}
	//link-list class named HashNode which will contain key value and next.=>(key,value)-->null;
	private class HashNode{
		private int key;
		private String value;
		private HashNode next;
		
		public HashNode(int key,String value) {
			this.key=key;
			this.value=value;
			this.next=null;
		}
		
	}
	//gives index of array
	public int hashFunction(int key) {
		return key%numofBuckets;
	}
	
	public void put(int key,String value) {
		//key and value is must
		if(key==0||value==null) {
			System.out.println("enter a valid key and value");
			return;
		}
		//store at first
		int index=hashFunction(key);
		HashNode head=buckets[index];
		while(head!=null) {
			if(head.key==key) {
				head.value=value;
				return;
			}
			//move head to the last
			head=head.next;
		}
		size++;
		//again move head to first for entering value at 1st position
		head=buckets[index];
		HashNode newNode=new HashNode(key,value);
		newNode.next=head;
		buckets[index]=newNode;
}
		
	public void print() {
		for(int i=0;i<buckets.length;i++) {
			HashNode head=buckets[i];
			for(int j=0;j<size;j++) {
				if(head!=null) {
				
	
					System.out.println(j+"th"+" values at index "+i+" = "+head.value+" key= "+head.key);
					head=head.next;
			}
		}
	}
	}
	public void findValue(int key) {
			HashNode h=buckets[hashFunction(key)];
//			for(int j=0;j<size;j++) {
//				if(h!=null&&h.key==key) {
//				
//	
//					System.out.println("found key= "+h.key+" value= "+h.value);
//					return;
//			}
//				
//				else {
//					System.out.println("enter correct key");
//				}
//				h=h.next;
//		}
			while(h!=null) {
				if(h.key==key) {
				
	
					System.out.println("found key= "+h.key+" value= "+h.value);
					
			}
				h=h.next;
		}
	}
	public static void main(String[] args) {
HashTable ht=new HashTable(10);
ht.put(11, "a");
ht.put(12, "b");
ht.put(13, "c");
ht.put(14, "c");
ht.put(15, "d");
ht.put(16, "e");
ht.put(17, "f");
ht.put(18, "g");
ht.put(21, "b");
ht.put(41, "c");
ht.put(101, "jojo");
ht.print();
ht.findValue(101);
ht.findValue(11);
ht.findValue(21);

	}

}
