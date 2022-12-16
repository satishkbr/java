package com.tsk.interfaceof.java8;

public class InterfaceStaticMethodExample {
	public interface MyData {

		default void print(String str) {
			if (!isNull(str))
				System.out.println("MyData Print::" + str);
		}

		//static boolean isNull(String str) {check output with one of these lines
			default boolean isNull(String str) {
			System.out.println("Interface Null Check");

			return str == null ? true : "".equals(str) ? true : false;
		}
	}
	public static class MyDataImpl implements MyData {

		public boolean isNull(String str) {
			System.out.println("Impl Null Check");

			return str == null ? true : false;
		}
		
		
	}
	public static void main(String args[]){
		MyDataImpl obj = new MyDataImpl();
		obj.print("");
		obj.isNull("abc");
	}

}
