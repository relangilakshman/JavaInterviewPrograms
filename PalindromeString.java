package practicetest;

import java.util.Scanner;

public class PalindromeString {
	
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter a string");
	    String str=sc.nextLine();
	    if(isPalindrome(str)) {
	    	System.out.println("The String is a palindrome");
	    }
	    else {
	    	System.out.println("The String is not a palindrome");
	    }
	    sc.close();
	}
	
	public static boolean isPalindrome(String str) {
		int left=0;
		int right=str.length()-1;
		while(left<right) {
			if(str.charAt(left) != str.charAt(right)) {
				return false;
			}
			left++;
			right--;
		}
		return true;
	}
	

}
