package practicetest;

import java.util.Scanner;

public class VowelsConstantsInString {
  public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a String");
	String str=sc.nextLine().toLowerCase();
	int vowels=0,constants=0;
	for(int i=0;i<str.length();i++) {
		char ch=str.charAt(i);
		if(Character.isLetter(ch)) {
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
				vowels++;
			}
			else
				constants++;
		}
	}
	System.out.println("No of Vowels in a given string is " +vowels);
	System.out.println("No of constants in a given string is " +constants);
}
}
