package dsa.bigo.basic.examples;


public class BinarySearchTree {
	private Node root = null;
	public BinarySearchTree(){
	    this.root = null;
	  }
	  public void insert(int value){
		  Node nn = new Node(value);
		  
		  if(this.root==null) {
			  this.root=nn;
			  System.out.println("root value : "+root.getValue());
		  }else {
			  Node pn = this.root;
			  traverseNodesforInsert( value,  pn,  nn) ; 
		  }
		  
	    //Code here
	  }
	  
	  public void traverseNodesforInsert(int value, Node parentNode, Node nn) {
		  Node rightChildNode = parentNode.getRight();
		  Node leftChildNode = parentNode.getLeft();
		  int parentValue = parentNode.getValue();
		  if(value>parentValue) {
			  if(rightChildNode==null) {
				  rightChildNode=nn;
				  parentNode.setRight(rightChildNode);
				  System.out.println("right child value : "+rightChildNode.getValue());

			  }else {
				  parentNode = rightChildNode;
				  rightChildNode = parentNode.getRight();
				  leftChildNode = parentNode.getLeft();
				  parentValue = parentNode.getValue();
				  traverseNodesforInsert( value,  parentNode,  nn) ; 
			  }
			  
		  }else if (value<parentValue){
			  if(leftChildNode==null) {
				  leftChildNode=nn;
				  parentNode.setLeft(leftChildNode);
				  System.out.println("left child value : "+leftChildNode.getValue());

			  }else {
				  parentNode = leftChildNode;
				  rightChildNode = parentNode.getRight();
				  leftChildNode = parentNode.getLeft();
				  parentValue = parentNode.getValue();
				  traverseNodesforInsert( value,  parentNode,  nn) ; 
			  }
		  }
		  
	  }
	  
	  @Override
	public String toString() {
		return "{root:" + root + "}";
	}
	public void lookup(int value){
	    //Code here
	  }
	  
		/*
		 * String traverse(Node node) { String tree = "{ value:"+ node.value +"}";
		 * tree.left = node.left === null ? null : traverse(node.left); tree.right =
		 * node.right === null ? null : traverse(node.right); return tree; }
		 */

	public static void main(String[] args) {
		BinarySearchTree bst = new BinarySearchTree();
		bst.insert(9);
		bst.insert(20);
		bst.insert(4);
		bst.insert(1);
		bst.insert(6);
		bst.insert(15);
		bst.insert(170);

		System.out.println(bst);

	}
	
	
}
 class Node {
	private int value=0;
	private Node left =null;
	private Node right =null;
	
	
	/**
	 * @param value
	 * @param left
	 * @param right
	 */
	public Node(int value) {
		super();
		this.value = value;
		this.left = null;
		this.right = null;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	public Node getLeft() {
		return left;
	}
	public void setLeft(Node left) {
		this.left = left;
	}
	public Node getRight() {
		return right;
	}
	public void setRight(Node right) {
		this.right = right;
	}
	@Override
	public String toString() {
		return " {value:" + value + ", left:" + left + ", right:" + right + "}";
	}
	
}
