import java.util.*;
public class Bst {
private TreeNode root;
	public class TreeNode{
		private TreeNode left;
		private TreeNode right;
		private int data;
		public TreeNode(int data) {
			this.data=data;
			this.left=null;
			this.right=null;
		}
		
	}
	public void insert(int data) {
		root=insert(root,data);
	}
	public TreeNode insert(TreeNode root,int data) {
		if(root==null) {
			root=new TreeNode(data);
			return root;
		}
		if(data<root.data) {
			root.left=insert(root.left,data);
		}
		else {
			root.right=insert(root.right,data);
		}
		return root;
	}
	public void inOrder() {
		inOrder(root);
	}
	public void inOrder(TreeNode root) {
		if(root==null) {
			return;
		}
		inOrder(root.left);
		System.out.print(root.data+" ");
		inOrder(root.right);
	}
	public static void main(String args[]) {
		Bst bs=new Bst();
		bs.insert(10);
		bs.insert(20);
		bs.insert(5);
		bs.insert(15);
		bs.inOrder();
	}
}
