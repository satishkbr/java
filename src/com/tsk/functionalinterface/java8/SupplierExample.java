package com.tsk.functionalinterface.java8;

import java.util.function.Supplier;

public class SupplierExample {

	public static void main(String[] args) {
     Supplier<Double> supp = ()->Math.random();
     System.out.println(supp.get());
	}

}
