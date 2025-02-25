package practicetest;

public class SwapTwoNumbers {
	
	public static void main(String[] args) {
		int a=10;
		int b=5;
		System.out.println("Before swapping values are");
		System.out.println("a value is "+a+ " b value is "+b);
		a=a+b;  //a=a^b;   a+b a=1010     a=10;
	    b=a-b;  //b=a^b;       b=0010     b=5;
	    a=a-b;   //a=a^b;
	    System.out.println("after swapping values are");
	    System.out.println(" a value is "+a+ " b value is "+b);
	}

}
