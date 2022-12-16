package dsa.bigo.basic.examples;

import java.util.Arrays;
import java.util.Iterator;

public class IntArray implements Iterable<Integer>{
	private int length =0;
	private int[] array ;
	private int capacity = 0;
	public static final int DEFAULY_CAPACITY = 1 << 3;
	
	public IntArray(int capacity) {
		this.array=new int[capacity];
		this.capacity=capacity;
	}
	public IntArray() {
		this.array=new int[DEFAULY_CAPACITY];
		this.capacity=DEFAULY_CAPACITY;
	}
	
	//get element at index
	public int get(int index) {
		return array[index];
	}
	
	//add element to dynacic array
	public void add(int element) {
		//if length of element <capacity then add
		//capacity=5, length=5
		if(this.length+1>=capacity) {
		
			capacity++;
			if(capacity==0)capacity++;
			else capacity*=2;
			int[] secondArray = new int[capacity];
			//copy the array to this array
			for(int i=0;i<array.length;i++) {
			secondArray[i]=array[i];	
			}
			array=secondArray;
			
		}
		
		array[length++]=element;
	}
	//set an element at index
		public void set(int index, int element) {
			array[index]=element;
		}
	//is empty
		public boolean isEmpty() {
			return length == 0;
		}
		
		//return size of Array
		public int size() {
			return length;
		}
	
	//remove an element
	public void remove(int index) {
		if(index>=length) {
			System.out.println("input index is greater than array last index");
		}else {
		for(int i=index;i<this.length-1;i++) {
			array[i]=array[i+1];
		}
		array[length-1]=0;//remove element
		this.length--;
		}
	}
	
	//delete
	
	//tostring method
	
	
	@Override
	public String toString() {
		if(this.length==0)return "[]";
		else {
			StringBuilder sb = new StringBuilder("[");
			for(int i=0;i<this.length-1;i++) {
				sb.append(this.get(i)).append(",");
			}
			sb.append(array[this.length-1]).append("]");
			return sb.toString();
		}
	}

	public static void main(String[] args) {
		//System.out.println(1<<3);//0000 0001  becomes 0000 0100 shift 2 to left
		IntArray intarray  = new IntArray(0);
		intarray.add(1);
		intarray.add(2);
		  intarray.add(3);
		  intarray.add(4); 
		  intarray.add(5); 
		  intarray.add(6);
		  intarray.add(7); 
		  intarray.add(8); 
		  intarray.add(9);
		  intarray.add(10);
		 
		 
		System.out.println(intarray);
		
		  intarray.remove(7); System.out.println(intarray);
		 

	}
	@Override
	public Iterator<Integer> iterator() {
		return new Iterator<Integer> (){

			@Override
			public boolean hasNext() {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public Integer next() {
				// TODO Auto-generated method stub
				return null;
			}
			
		};
	}
	

}
