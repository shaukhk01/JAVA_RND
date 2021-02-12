class Test {

	static{
		System.out.println("Block 1");
	}
	static {
		System.out.println("Block 2");
	}
}

class StaticPractice {

	public static void main(String[]args){

		//Test t= new Test();//first static-block will be executed

		System.out.println("Main");//first main
		Test t= new Test();
	}
}
