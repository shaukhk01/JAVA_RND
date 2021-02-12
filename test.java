class A{

	private void a(){

		System.out.println("HELLO");
	}

}
class B extends A{

	private void a(){
		System.out.println("world");
	}

	public static void main(String[]args){

		B b = new B();
		b.a();

	}
}
