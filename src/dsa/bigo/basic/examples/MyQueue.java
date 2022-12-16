package dsa.bigo.basic.examples;


public class MyQueue {
	private Node first = null;
	private Node last = null;
	private int length = 0;
	public MyQueue() {
		this.first=null;
		this.last=null;
		this.length=0;
	}
	//view to top element
	public Node peek() {

		return this.first;

	}
	public void enQueue(String value) {
		Node newNode = new Node(value);
		if(length==0) {
			last=newNode;
			first=newNode;
		}else {
			last.setNext(newNode);
			last = newNode;

		}
		length++;

	}
	public void deQueue() {
		if(this.length==0) {
			System.out.println("there is not items in the queue");
		}
		if(this.length==1){
			this.last=null;
			this.first=null;
		}else if (this.length>1) {
			Node firstNode = this.first;
			this.first = firstNode.getNext();
			firstNode.setNext(null);
		}
		length--;
	}



	@Override
	public String toString() {
		return "MyQueue [first=" + first + ", last=" + last + ", length=" + length + "]";
	}
	public static void main(String[] args) {
		MyQueue queue = new MyQueue();
		queue.enQueue("1");
		queue.enQueue("2");
		queue.enQueue("3");
		System.out.println(queue);
		queue.deQueue();
		System.out.println(queue);

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
