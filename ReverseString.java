package practicetest;

import java.util.Scanner;

public class ReverseString {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
		String str=sc.nextLine();
		String revStr="";
		for(int i=str.length()-1;i>=0;i--)
		{
			revStr=revStr+str.charAt(i); // Apend characters to reverse string
		}
		System.out.println("reverse of given string is "+ revStr);
	}

}
