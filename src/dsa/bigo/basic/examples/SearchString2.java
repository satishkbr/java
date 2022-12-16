package dsa.bigo.basic.examples;

import java.util.Arrays;

//search in lasrge array
//scalability
public class SearchString2 {

	public static void main(String[] args) {
        final String searchString = "satish";
        String[] items = {"satish1","kumar","rakesh","brownie","jake"};
        String[] largeArray = new String[1000000];
        Arrays.fill(largeArray,"satish");
        //System.out.println(Arrays.toString(largeArray));

        long start = System.currentTimeMillis();
        System.out.println(searchString(largeArray,searchString));
        long end = System.currentTimeMillis();
        System.out.println("time taken in ms:"+(end-start));

    }
    //write a function to search a string in array
    //input array, searchstring
    //output boolean
    public static boolean searchString(String[] itemArray,String term){
        boolean found = false;
        for(int i=0;i<itemArray.length;i++){
            if(itemArray[i]==term){
            	found= true;
        //System.out.println("Found" +i+","+itemArray[i]);
            }
        }
      //  if(found)System.out.println("Found");
        return found;
    }
} 
//time complexity
//O(n) - Big O
//space complexity
//O(1)