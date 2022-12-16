package dsa.bigo.basic.examples;

public class SearchString {

	public static void main(String[] args) {
        final String searchString = "satish";
        String[] items = {"satish1","kumar","rakesh","brownie","jake"};
        
        System.out.println(searchString(items,searchString));
    }
    //write a function to search a string in array
    //input array, searchstring
    //output boolean
    public static boolean searchString(String[] itemArray, String term){
        for(int i=0;i<itemArray.length-1;i++){
            if(itemArray[i]==term)return true;
            
        }
        return false;
    }
} 
//time complexity
//O(n) - Big O
//space complexity
//O(1)