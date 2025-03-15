package practicetest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraysSort {
     public static void main(String[] args) {
		int[] arr= {10,5,12,19,2,3};
		List<Integer> list=new ArrayList<Integer>();
		int size=arr.length;
		Arrays.sort(arr);
		System.out.println("sorted array is "+Arrays.toString(arr));
		for(int i=size-1;i>=0;i--)
		{
			list.add(arr[i]);
		}
		System.out.println("Reverse order of Array elements is " +list);
		sortNames();
	}
     public static void sortNames() {
    	 String[] namesArr= {"Ram","Kalyan","Lakshman"};
    	 List<String> namesList=new ArrayList<String>();
    	 int size=namesArr.length;
    	 Arrays.sort(namesArr);
    	 System.out.println("sorted result of given array is "+ Arrays.toString(namesArr));
    	 for(int i=size-1;i>=0;i--) {
    		 namesList.add(namesArr[i]);
    	 }
    	 System.out.println("Reverse order of given names array is " +namesList);
     }
}
