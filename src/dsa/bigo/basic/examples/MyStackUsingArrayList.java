package dsa.bigo.basic.examples;

import java.util.ArrayList;
import java.util.List;

public class MyStackUsingArrayList {
	private List<String> arrayList = null;
	public MyStackUsingArrayList() {
		this.arrayList = new ArrayList();
	}
	//view to top element
	public String peek() {
		
		return this.arrayList.get(this.arrayList.size()-1);

	}
	public void push(String value) {
		this.arrayList.add(value);
	}
	public void pop() {
		this.arrayList.remove(this.arrayList.size()-1);
	}

	
	
	@Override
	public String toString() {
		return "MyStackUsingArrayList [arrayList=" + arrayList + "]";
	}
	public static void main(String[] args) {
		MyStackUsingArrayList stack = new MyStackUsingArrayList();
		stack.push("google");
		stack.push("udemy");
		stack.push("discord");
		System.out.println(stack);
		System.out.println(stack.peek());

		stack.pop();
		stack.pop();
		stack.pop();
		System.out.println(stack);
		//System.out.println(stack.peek());
		

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
