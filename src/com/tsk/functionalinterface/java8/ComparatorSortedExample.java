package com.tsk.functionalinterface.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ComparatorSortedExample {
	public static void main(String[] args) {
		Employee e1 = new Employee(1,"a",2000);
		Employee e2 = new Employee(3,"b",1000);
		Employee e3 = new Employee(2,"c",500);

		Employee e4 = new Employee(4,"d",6000);
        List<Employee> list = Arrays.asList(e1,e2,e3,e4);
		/*
		 * List<Employee> listnew =
		 * list.stream().sorted((a,b)->Integer.valueOf(a.getSalary()).compareTo(Integer.
		 * valueOf(b.getSalary()))) .collect(Collectors.toList());
		 * listnew.forEach(System.out::println);
		 */
        
        //or works with comparable method compareTo
		/*
		 * list.stream().sorted((a,b)->Integer.valueOf(a.getSalary()).compareTo(Integer.
		 * valueOf(b.getSalary()))) .forEach(System.out::println);
		 */
        
        //or works with comparator compare method
        
        list.stream().sorted((a,b)->   Integer.compare(b.getSalary(), a.getSalary()))
        .forEach(System.out::println);
        

	}
    public static class Employee{
    	private int id;
    	private String name;
    	private int salary;
    	
		/**
		 * @param id
		 * @param name
		 * @param salary
		 */
		public Employee(int id, String name, int salary) {
			super();
			this.id = id;
			this.name = name;
			this.salary = salary;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getSalary() {
			return salary;
		}
		public void setSalary(int salary) {
			this.salary = salary;
		}
		@Override
		public String toString() {
			return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
		}
    	
    }
	

}
