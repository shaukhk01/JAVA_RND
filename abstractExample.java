abstract class Super{

	public Super(){
		System.out.println("Super Constructor");
	}
	public void meth1(){
		System.out.println("Meth1 of Super");
	}

	public abstract void meth2();
}

class Sub extends Super {

	//here compiler addded zero arg constructor and inside constructor contain supper() for parent class constructor.
	public void meth2(){

		System.out.println("Overriding of abstract class method");
	}

	public static void main(String[]args){

		Super sub = new Sub();
		sub.meth1();
		sub.meth2();
	}
}
