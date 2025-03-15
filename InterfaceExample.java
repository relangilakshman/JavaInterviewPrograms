package practicetest;


interface Vehicle {
  void makeSound();    // Method only name not have any body
}

class Car implements Vehicle{
	public void makeSound() {
		System.out.println("while driving");
	}
}

class InterfaceExample{
	public static void main(String[] args) {
		Vehicle vh=new Car();
		vh.makeSound();
	}
}

