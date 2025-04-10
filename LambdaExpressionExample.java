package practicetest;

import java.util.Comparator;
import java.util.function.BiConsumer;

public class LambdaExpressionExample {
	public static void main(String[] args) {
		BiConsumer<Integer,Integer> add= (a,b) -> System.out.println(a+b);
		add.accept(10,5);
		LambdaExpressionExample la=new LambdaExpressionExample();
		la.add1(8, 22);
		
		Comparator<String> c=(s1,s2) -> s1.compareTo(s2);
		System.out.println(c.compare("Lakshman", "Lakshman"));
	}
	
	void add1(int a,int b) {
		System.out.println(a+b);
	}
}
