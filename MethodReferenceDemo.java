package practicetest;

@FunctionalInterface
interface FunctionalInterfaceDemo1 {
	//abstarct method
    void printMethod(); 
    
    default void printDefaultMethod() {
        System.out.println("Default method called");
    }
    static void printStaticMethod() {
    	System.out.println("Print Static Message");
    }
}

public class MethodReferenceDemo {
	public static void main(String[] args) {
		  FunctionalInterfaceDemo1 functionalInterfaceDemo= Test::refernceMethod;
		  functionalInterfaceDemo.printDefaultMethod();
		  functionalInterfaceDemo.printMethod();
		  FunctionalInterfaceDemo1.printStaticMethod();
		  
	}

}

class Test {
	static void refernceMethod() {
		System.out.println("Print refernceMethod Message");
	}
}
