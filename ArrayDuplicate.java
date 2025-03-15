package practicetest;

import java.util.HashSet;
import java.util.Set;

public class ArrayDuplicate {
	
	//10,15,8,49,25,98,98,32,15, 15
    public static void main(String[] args) {
    	int[] list= {10,15,8,49,25,98,98,32,15,15};
    	HashSet<Integer> uniqueSet=new HashSet<Integer>();
    	HashSet<Integer> dupliacteSet=new HashSet<Integer>();
		for(int num:list) {
			 if(!uniqueSet.add(num)) {
				dupliacteSet.add(num);
			 }                                                            //System.out.println(num);
		}
		System.out.println("duplicate elements in array is " +dupliacteSet);
		duplicString();
	}
    
    public static void duplicString() {
    	String[] names= {"Lakshman","Kalyan","Ram","Lakshman"};
    	HashSet<String> uniqueSet=new HashSet<String>();
    	HashSet<String> duplicateSet=new HashSet<String>();
          for(String objnames:names) {
        	  if(!uniqueSet.add(objnames)) {
        		  duplicateSet.add(objnames);
        	  }
          }
       System.out.println("duplicate names in an array is: " + duplicateSet);   
 }
}
