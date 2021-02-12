class Parent {

	public void display(){
		System.out.println("Super class Display");
	}

	/*
	public void open(){

	}
	*/
}

class Child extends Parent {

	public void display(){
		System.out.println("Child  class Display");
	}

	public void open(){
		
		System.out.println("Now type firefox");
	}


	public static void main(String[]args) {

		Parent p = new Child();
		p.display();
		p.open();//open method must be declare in parent class also otherwise it will get error,
	}
}
