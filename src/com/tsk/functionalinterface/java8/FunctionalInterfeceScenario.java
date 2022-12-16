package com.tsk.functionalinterface.java8;

import java.util.List;
import java.util.function.Supplier;

public class FunctionalInterfeceScenario {
	interface X { int m(Iterable<String> arg); }
	interface Y { int m(Iterable<String> arg); }
	interface Z extends X, Y {}
	// Functional: two methods, but they have the same signature
	interface X1 { Iterable m(Iterable<String> arg); }
	interface Y1 { Iterable<String> m(Iterable arg); }
	interface Z1 extends X1, Y1 {}
	// Functional: Y.m is a subsignature & return-type-substitutable
	public class Z11 implements X1,Y1{

		@Override
		public Iterable<String> m(Iterable arg) {
			// TODO Auto-generated method stub
			return null;
		}
	
	}
	
	interface X2 { int m(Iterable<String> arg); }
	interface Y2 { int m(Iterable<Integer> arg); }
	//uncomment the below code to verify
	//interface Z2 extends X2, Y2 {}
	// Not functional: No method has a subsignature of all abstract methods
	
	
	//uncomment the below code to verify, its is type eraser issue
	/*
	 * public class Z222 implements X2,Y2{
	 * 
	 * @Override public int m(Iterable<Integer> arg) { // TODO Auto-generated method
	 * stub return 0; }
	 * 
	 * @Override public int m(Iterable<String> arg) { // TODO Auto-generated method
	 * stub return 0; }
	 * 
	 * }
	 */
	public class Z22 implements X,Y{

		@Override
		public int m(Iterable<String> arg) {
			// TODO Auto-generated method stub
			return 0;
		}
		
	}
	
	/*
	 * interface X3 { int m(Iterable<String> arg, Class c); } interface Y3 { int
	 * m(Iterable arg, Class<?> c); } interface Z3 extends X3, Y3{} // Not
	 * functional: No method has a subsignature of all abstract methods
	 * 
	 * interface X4 { long m(); } interface Y4{ int m(); } interface Z4 extends X4,
	 * Y4 {}
	 */
	// Compiler error: no method is return type substitutable
	
	
	
	
	public interface ListStringRef extends Supplier<List<String>> {}
    public void doSomething(ListStringRef strings) {
        System.out.println("Doing something with a List of Strings " );
    }
 
    public interface ListIntegerRef extends Supplier<List<Integer>> {}
    public void doSomething(ListIntegerRef ints) {
        System.out.println("Doing something with a List of Integers " );
    }
}
