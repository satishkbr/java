package com.tsk.interfaceof.java8;

public class InterfaceDefaultExample {
	public interface Animal{
		//returns move action of concrete Animal
		String walk();
	}
	public interface Cow extends Animal{
		//returns move action of Cow
		//@override
		@Override
		default String walk() {
			return this.getClass().getSimpleName()+" moves on four legs";
			}
	}
	public interface Whale extends Animal{
		@Override
		default String walk() {
			return this.getClass().getSimpleName()+" do not walk have legs";
			}
		default String Swim() {
			return this.getClass().getSimpleName()+" swims in ocean";
		}
	}
	
	public static class Animator implements Cow,Whale{

		@Override
		public String walk() {
			// TODO Auto-generated method stub
			return Cow.super.walk();
		}
		
	}
	public static void main(String[] args) {
		System.out.println( new Animator().walk());
		System.out.println( new Animator().Swim());
	}

}
