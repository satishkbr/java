package com.tsk.interfaceof.java8;

public class DefaultExample2 {
	public interface Interface1 {

		void method1(String str);
		
		default void log(String str){
			System.out.println("I1 logging::"+str);
		}
	}
	public interface Interface2 {

		void method2();
		
		default void log(String str){
			System.out.println("I2 logging::"+str);
		}

	}
	public static class MyClass implements Interface1, Interface2 {

		@Override
		public void method2() {
		}

		@Override
		public void method1(String str) {
		}
		@Override
		public void log(String str){
			System.out.println("MyClass logging::"+str);
			Interface2.super.log(str);
		}
	}
	public static void main(String[] args) {
		new MyClass().log("testing");

	}

}
