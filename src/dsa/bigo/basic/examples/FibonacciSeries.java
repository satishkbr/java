package dsa.bigo.basic.examples;

public class FibonacciSeries {

	
	  public static int fibonacciIterative(int n) {
		  int f=0,s=1;
		    if(n==0)return f;
	    	else if(n==1)return s;
	    	else if(n>1) {
	    		int i = 2;
	    		while(i<=n) {
	    			int tmp = s;
	    			s=s+f;
	    			f=tmp;
	    			i++;
	    		}
	    	}
		  return s;
	  }
	 
    public static int fibonacciRecursive(int n) {
    	//base case
    	if(n==0)return 0;
    	else if(n==1)return 1;
    	
    	return fibonacciRecursive(n-1)+fibonacciRecursive(n-2);
	}
	public static void main(String[] args) {
		System.out.println(fibonacciRecursive(43));
		System.out.println("****************************");

		System.out.println(fibonacciIterative(43));


	}

}
