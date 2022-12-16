package dsa.bigo.basic.examples;

import java.util.Hashtable;

public class MyArray {
	int length = 0;
	Hashtable data =  null;
	public MyArray() {
		this.length=0;
		this.data   = new Hashtable();
	}
	//get object by index
	public Object get(int index) {
		return this.data.get(index);
	}
	//push object
	public int push(Object item) {
		this.data.put(length, item);
		return ++length;
	}
	//pop the last object
	public Object pop() {
		Object lastItem = this.data.get(this.length);
		//this.get(this.length-1);
		//this.data.get(this.length);
		this.data.remove(this.length-1);
		length--;
		return lastItem;
	}

	public void delete(int index) {
		Object item = this.data.get(index);
		shiftItems(index);
	}

	private void shiftItems(int index) {
		for(int i=index;i<length-1;i++) {
			//last item l=5  i=4
              this.data.put(i, this.data.get(i+1));//throw error for the last item
		}
		this.data.remove(this.length-1);
		this.length--;
	}
	@Override
	public String toString() {
		return "MyArray [length=" + length + ", data=" + data + "]";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyArray ar = new MyArray();
		//System.out.println(ar.get(0));
		ar.push("hi");
		ar.push("you");
		ar.push("!");
		System.out.println(ar);

		//ar.pop();
        ar.delete(0);
        //ar.delete(1);

		ar.push("d");
		ar.push("e");

		System.out.println(ar);

	}

}
