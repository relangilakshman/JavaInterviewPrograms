package practicetest;

import java.util.Scanner;

public class PrimeNumberCheck {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number to check prime number or not : ");
		int num=sc.nextInt();
		if(isPrime(num)) {
			System.out.println(num + " is a prime number");
		}
		else
		{
			System.out.println(num + " is not a prime number");
		}
	}
	
	public static boolean isPrime(int num) {
		for(int i=2;i<num/2;i++) {
			if(num%i==0) {
		return false;
			}
		
}
		return true;
}
}
