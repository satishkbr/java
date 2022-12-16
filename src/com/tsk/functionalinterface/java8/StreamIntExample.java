package com.tsk.functionalinterface.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamIntExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//List<String> list = Arrays.asList("1","2","3","4","5");
		//list.stream().map(x->Integer.parseInt(x)).forEach(System.out::print);
		//list.stream().mapToInt(x->Integer.parseInt(x)).forEach(System.out::print);
		//above to statements gives the same result
		//list.stream().filter(x->(x.equals("2"))).forEach(System.out::print);
		//list.stream().map(x->Integer.parseInt(x)).filter(x->x>2).forEach(System.out::print);
		//list.stream().mapToInt(x->Integer.parseInt(x)).filter(x->x>2).forEach(System.out::print);
		
		
		//initialize stream of 1 to 20 int types
		/*
		 * IntStream stream = IntStream.range(1, 20);
		 * stream.filter(x->x%2==0).forEach(System.out::print);
		 */
		//mapping string with length
		/*
		 * List<String> listComputers =
		 * Arrays.asList("Dell","HP","Lenovo","Apple","Acer","Asus");
		 * //listComputers.stream().mapToInt(x->x.length()).forEach(System.out::print);
		 * 
		 * List<String> resultList = listComputers.stream().map(x->x.toUpperCase())
		 * .collect(Collectors.toList()); System.out.println(resultList);
		 */
		
		
		// min and max,count of Integers and Strings, also OPtional usage
        List<Integer> list = Arrays.asList(-50 ,-30,-15, 0, 24, 6);
        Optional<Integer> minimum = list.stream().min(Integer::compareTo);
        System.out.println(minimum);
        
        //or
        Optional<Integer> minimum1 = list.stream().reduce(Integer::compare);
        System.out.println(minimum);
        if(minimum.isPresent()) {
        	System.out.println(minimum.get());
        }
        else  {
        	System.out.println("Null");
        }
        Optional<Integer> maximum = list.stream().max(Integer::compare);
        if(maximum.isPresent()) {
        	System.out.println(maximum.get());
        }
        else  {
        	System.out.println("Null");
        }
        //count
       long count =  list.stream().distinct().count();
   	   System.out.println("count="+count);

        
        
        
        List<String> listComputers =
       		  Arrays.asList("Dell","2hp","Lenovo","Apple","Acer","Asus");
        //compare based on the last  character
        Optional<String> min3 = listComputers.stream().min((s1,s2)->
        Character.compare(s1.charAt(s1.length()-1), s2.charAt(s2.length()-1))
        );
        if(min3.isPresent()) {
        	System.out.println(min3.get());
        }
        else  {
        	System.out.println("Null");
        }
        
        
        




	}

}
