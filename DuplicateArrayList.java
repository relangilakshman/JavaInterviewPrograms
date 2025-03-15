package practicetest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicateArrayList {
     public static void main(String[] args) {
		List<Integer> list=Arrays.asList(2,3,6,9,3,2);
		Set<Integer> uniqueSet=new HashSet<Integer>();
		Set<Integer> duplicateSet=new HashSet<Integer>();
		for(int num:list) {
			if(!uniqueSet.add(num)) {
				duplicateSet.add(num);
			}
		}
		System.out.println("duplicate elements in array list is: " +duplicateSet);
		strArray();
	}
     public static void strArray() {
 	List<String> list=Arrays.asList("Lakshman","Kalyan","Ram","Kalyan");
	Set<String> uniqueSet=new HashSet<String>();
	Set<String> duplicateSet=new HashSet<String>();
	for(String names:list) {
		if(!uniqueSet.add(names)) {
			duplicateSet.add(names);
		}
	}
	System.out.println("duplicate elements in array list is: " +duplicateSet);
}
}
