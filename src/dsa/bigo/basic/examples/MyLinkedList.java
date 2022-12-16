package dsa.bigo.basic.examples;

import dsa.bigo.basic.examples.MyLinkedList.Node;

public class MyLinkedList {


	private int length = 0;
	private Node head = null;
	private Node tail = null;
	

	/**
	 * 
	 */
	public MyLinkedList(int value) {
		super();
		this.head = new Node(value,null);
		this.tail=this.head;
		this.length=1;
	}
	
	public MyLinkedList append(int value) {
		//append 5
		
		
		Node newNode = new Node(value,null);
		this.tail.setNext(newNode);
		this.tail = newNode;
		this.length++;
		return this;
	}
	
	public MyLinkedList prepend(int value) {
		//append 1
		Node newNode = new Node(value,this.head);
		this.head = newNode;
		this.length++;
		return this;
	}
	
	public MyLinkedList insert(int index, int val) {
		
		if(index ==0) {
			this.prepend(val);
		}else if(index==(this.length-1)){
			this.append(val);
		}else if(index>this.length-1) {
			System.out.println("index to insert the element is more than the length of the LinkedList");
		}else {
		int currentIndex = 0;
		Node previousNode = null;
		Node currentNode = this.head;
		while(currentNode!=null && currentIndex != index) {
			currentIndex++;
			previousNode = currentNode;
			currentNode = currentNode.getNext();
		}
		Node newNode = new Node(val,currentNode);
		previousNode.setNext(newNode);
		}
		this.length++;
		return this;
	}
	
	public void delete(int index) {
		if(index==0) {
			Node tmp = null;
			tmp = this.head ;
			this.head=this.head.getNext();
			tmp.setNext(null);
		}else if(index>=this.length) {
			//delete the last element
			index = this.length-1;
			
		}
		Node leader = findLeader(index-1);
		Node follower = leader.getNext();
		leader.setNext(follower.getNext());
		if(index==this.length-1) {
			this.tail=leader;
		}
		this.length--;
	}
	
	public void reverse() {
		
	}

	private Node findLeader(int index) {
		int counter = 0;
		Node currentNode = this.head;
		while(counter!=index) {
			counter++;
			currentNode = currentNode.getNext();
			
		}
		return currentNode;
	}

	@Override
	public String toString() {
		return "MyLinkedList [length=" + length + ", head=" + head + ", tail=" + tail + "]";
	}



	public static void main(String[] args) {
		MyLinkedList  ln = new MyLinkedList(10);
		ln.append(5);
		ln.append(16);
		ln.prepend(1);
		ln.insert(2,99);
		ln.append(88);
		System.out.println(ln);
		ln.delete(88);
		System.out.println(ln);
	}

	public class Node {
		private int value=0;
		private Node next =null;

		@Override
		public String toString() {
			return "Node [value=" + value + ", next=" + next + "]";
		}

		public int getValue() {
			return value;
		}

		public void setValue(int value) {
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
		public Node(int value, Node next) {
			super();
			this.value = value;
			this.next = next;
		}

	}

}
