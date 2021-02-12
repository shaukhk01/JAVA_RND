class Parent {

	public void parent(){

		System.out.println("parent");
	}
}
class Child {

	Parent p = new Parent();
	public void child (){
		System.out.println("child");
		p.parent();
	}
}

class Main  {

	public static void main(String[]args){

		Child m = new Child();//hasA
		m.child();
//		m.parent();


	}
}




