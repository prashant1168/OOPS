import java.util.*;
public class BinaryTree {
	private TreeNode root;
	
	
	public class TreeNode{
		private int data;
		private TreeNode left;
		private TreeNode right;
	
	public TreeNode(int data) {
		this.data=data;
		this.left=null;
		this.right=null;
	}
	}
	public void makeTree() {
		TreeNode n1=new TreeNode(50);
		TreeNode n2=new TreeNode(30);
		TreeNode n3=new TreeNode(100);
		TreeNode n4=new TreeNode(20);
		TreeNode n5=new TreeNode(40);
		TreeNode n6=new TreeNode(80);
		TreeNode n7=new TreeNode(200);
		TreeNode n8=new TreeNode(10);
		TreeNode n9=new TreeNode(15);
		TreeNode n10=new TreeNode(75);
		TreeNode n11=new TreeNode(120);
		root=n1;
		n1.left=n2;
		n1.right=n3;
		n2.left=n4;
		n2.right=n5;
		n3.left=n6;
		n3.right=n7;
		n4.left=n8;
		n4.right=n9;
		n6.left=n10;
		n6.right=n11;
	}
	public void preOrderTree(TreeNode root) {
		if(root==null) {
			//System.out.println("null");
			return;
		}
		System.out.println(root.data+" ");
		preOrderTree(root.left);
		preOrderTree(root.right);
	}
	public void preOrderTreeS(TreeNode root) {
		if(root==null) {
			//System.out.println("null");
			return;
		}
		Stack<TreeNode> st=new Stack<>();
		st.push(root);
		while(!st.isEmpty()) {
			TreeNode temp=st.pop();
			System.out.println(temp.data+" ");
			if(temp.right!=null) {
				st.push(temp.right);
			}
			if(temp.left!=null) {
				st.push(temp.left);
			}
		}
		
		
	}
	public void postOrderTree(TreeNode root) {
		if(root==null) {
			return;
		}
		postOrderTree(root.left);
		postOrderTree(root.right);
		System.out.println(root.data+" ");
		
	}
	public void inOrderTree(TreeNode root) {
		if(root==null) {
			return;
		}
		
		inOrderTree(root.left);
		System.out.println(root.data+" ");
		inOrderTree(root.right);
		
	}

	public static void main(String[] args) {
		BinaryTree bt=new BinaryTree();
		bt.makeTree();
		bt.preOrderTreeS(bt.root);
		//bt.postOrderTree(bt.root);
		

	}

}
