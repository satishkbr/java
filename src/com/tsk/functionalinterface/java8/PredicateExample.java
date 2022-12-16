package com.tsk.functionalinterface.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

//very important is Predicate is a boolean function with single argument
//i.e boolean isPrime(x)
public class PredicateExample {

	public static void main(String[] args) {
		/*
		 * Predicate<Integer> grThan5 = x-> x>5; Predicate<Integer> lessThan30 =
		 * y->y<30; System.out.println(grThan5.and(lessThan30).test(25));
		 * System.out.println(grThan5.and(lessThan30).negate().test(25));
		 */
		List<User> users = new ArrayList<User>();
        users.add(new User(1,"Alex", "admin"));
        users.add(new User(2,"john", "developer"));
        users.add(new User(3,"Cameron", "admin"));
        users.add(new User(3,"JAson", "analyst"));
        Predicate<User> dev = x->x.getRole().equals("developer");
        Predicate<User> admin = x->x.getRole().equals("admin");

		users.stream().filter(
		/*
		 * (User x)->{ x.getRole().equals("developer") ; }
		 */
		/*
		 * (User u) -> u.getRole().equals("admin") || u.getRole().equals("developer")
		 */
				dev.and(admin)
				).forEach(System.out::println);

	}
	
	static class  User
	{
	    Integer id;String name, role;
	    User(Integer id, String name, String role) {
	    	this.id=id;
	        this.name = name;
	        this.role = role;
	    }
	     Integer getId() {
			return id;
		}
		String getRole() { return role; }
	    String getName() { return name; }    
	    public String toString() {
	       return "User Id : "+id+", name : " + name + ", Role :" + role;
	    }
	}

}
