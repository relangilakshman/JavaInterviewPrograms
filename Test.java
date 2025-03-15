package practicetest;

import java.util.function.BiFunction;

public class Test {
	public static void main(String[] args) {
		BiFunction<Integer,Integer,Integer> add=(a,b) ->a+b;
		int result=add.apply(5,7);
		System.out.println("result oftwo numbers are " +result);
	}
}
