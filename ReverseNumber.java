package practicetest;

import java.util.Scanner;

public class ReverseNumber {
   public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number: ");
	int number=sc.nextInt();
	int reverseNum=0;
	while (number!=0) {
		int digit=number%10;               // to get last digit
		reverseNum= reverseNum*10 + digit;  // append digit to reversed
		number=number/10;                  // Remove last digit from number
	}
	System.out.println(" Reverse number is: " +reverseNum);
}
}

