class Parent {
	
	public static String methodOne(){

		return "parent class";
	}

	public int[] method(int... x){
		return x;
	}
}
class Child extends Parent {

	public static String methodOne(){

		return "child class";
	}

	public int method(int i){

		return i;
	}

	public static void main(String[]args){

		Child c = new Child();
		Parent p = new Parent();
		System.out.println(c.methodOne());
		System.out.println(p.methodOne());
		System.out.println(c.method(10));
		System.out.println(p.method(20));

		Parent p2 = new Child();
		System.out.println(p2.methodOne());
}
}
