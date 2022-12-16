package dsa.bigo.basic.examples;

public class Factorial {
	public static int findFactorialRecursive(int n) {
	   if(n==1)return 1;
	   else return n*findFactorialRecursive(n-1);
	}
	public static int findFactorialIterative(int n) {
		int product = 1;
		while(n>0) {
			product *= n--;
		}
		return product;
	}

	public static void main(String[] args) {
		System.out.println(findFactorialRecursive(5));
		System.out.println(findFactorialIterative(5));


	}

}
