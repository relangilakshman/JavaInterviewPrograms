package practicetest;

abstract class AbstractExample {
	
	abstract void add();
}	
	class TestDemo extends AbstractExample{
		void add() {
			System.out.println("Hi");
		}
	}
	
	class Main{
	public static void main(String[] args) {
	   AbstractExample obj=new TestDemo();
	   obj.add();
	}
	}

