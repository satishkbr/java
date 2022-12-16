package dsa.bigo.basic.examples;


public class MyStack {
	private Node top = null;
	private Node bottom = null;
	private int length = 0;
	public MyStack() {
		this.top=null;
		this.bottom=null;
		this.length=0;
	}
	//view to top element
	public Node peek() {
		
		return this.top;

	}
	public void push(String value) {
		Node newNode = new Node(value);
		if(length==0) {
			top=newNode;
			bottom=newNode;
		}else {
			//top.setNext(newNode);
			//top=newNode;
			newNode.setNext(this.top);
			this.top=newNode;
		}
		length++;

	}
	public void pop() {
		if(length==0) {
			System.out.println("Stack is empty, no element to remove");
		}else if (length==1) {
			top=null;
			bottom=null;
			length--;
		}else {
			
			Node topper = this.top;
			this.top = topper.getNext();
			topper.setNext(null);
			length--;
		}
	}

	@Override
	public String toString() {
		return "MyStack [top=" + top + ", bottom=" + bottom + ", length=" + length + "]";
	}
	private Node findLeader(int i) {
		int counter = 0;
		Node currentNode = bottom;
		while(counter!=i) {
			counter++;
			currentNode=currentNode.getNext();
		}
		return currentNode;
	}
	public static void main(String[] args) {
		MyStack stack = new MyStack();
		stack.push("google");
		stack.push("udemy");
		stack.push("discord");
		System.out.println(stack);
		System.out.println(stack.peek());
		stack.pop();
		System.out.println(stack);
		System.out.println(stack.peek());
		

		//discord
		//udemy
		//google

	}

	public class Node {
		private String value=null;
		private Node next =null;

		@Override
		public String toString() {
			return "Node [value=" + value + ", next=" + next + "]";
		}

		public String getValue() {
			return value;
		}

		public void setValue(String value) {
			this.value = value;
		}

		public Node getNext() {
			return next;
		}

		public void setNext(Node next) {
			this.next = next;
		}

		/**
		 * @param value
		 * @param next
		 */
		public Node(String value) {
			super();
			this.value = value;
			this.next = null;
		}

	}


}
