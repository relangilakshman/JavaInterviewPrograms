package practicetest;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class DuplicateCharsInString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
		String str=sc.nextLine();
		Set<Character> charSet=new HashSet<Character>();
		Set<Character> duplicateCharSet=new HashSet<Character>();
		for(char ch:str.toCharArray()) {
			if(!charSet.add(ch)) {                 //if add means return false character is already present
				duplicateCharSet.add(ch);
		}
	}
		System.out.println("duplicate characters in a string are :" +duplicateCharSet);
	}
}
