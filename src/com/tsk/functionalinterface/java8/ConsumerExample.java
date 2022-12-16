package com.tsk.functionalinterface.java8;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {
    
	public static void main(String[] args) {
		//generate squares of each element
		Consumer<List<Integer>> generateSquares = list ->{
			for(int i=0;i<list.size();i++) {
				list.set(i, list.get(i)*list.get(i));
			}
		};
		//display each element
				Consumer<List<Integer>> print = list->{
					list.forEach(System.out::println);
				};
				
				List<Integer> list = new ArrayList<Integer>();
		        list.add(4);
		        list.add(5);
		        list.add(6);
		        //generateSquares.accept(list); 
		        //print.accept(list); 
		        generateSquares.andThen(print).accept(list);;


	}

}
