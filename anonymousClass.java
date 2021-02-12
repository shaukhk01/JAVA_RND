interface My {

	public abstract void display();
}

class Outer {

	public void method(){

		My m = new My(){

			public void display(){

				System.out.println("Implementation of My interface");
			}
		};

		m.display();
	}

	public static void main(String[]args){

		Outer o  = new Outer();
		o.method();
	}
}
