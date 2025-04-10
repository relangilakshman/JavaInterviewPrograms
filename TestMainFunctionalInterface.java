package practicetest;

@FunctionalInterface
interface FunctionalInterfaceDemo{
	//only one single abstarct method //abstract void printMethod();//any number of default and static methods
	void printMethod();
   default void printDefaultMethod() {
	   System.out.println("Print Default Meessage");
   }
  static void printStaticMethod() {
	  System.out.println("Print Static Message");
  }
}


class Demo implements FunctionalInterfaceDemo{
	void add(int a,int b) {
		System.out.println(a+b);
	}

	@Override
	public void printMethod() {
		System.out.println("Print Abstarct Method");
		
	}
}

public class TestMainFunctionalInterface {
	public static void main(String[] args) {
		Demo obj=new Demo();
		obj.add(10, 5);
		obj.printMethod();
		obj.printDefaultMethod();
	FunctionalInterfaceDemo.printStaticMethod();
	}
}
