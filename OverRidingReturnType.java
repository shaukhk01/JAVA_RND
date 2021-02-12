class Parent {

	public String methodOne(){

		return "parent class";
	}

	public String method(String name){

		return name;
	}
}
class Child extends Parent {

	public String methodOne(){

		return "child class";
	}

	public int method(int x){
		return x;
	}

	public static void main(String[]args)throws Exception {

		Child c = new Child();
		Parent p = new Child();
		System.out.println(c.methodOne());//runtime object
		System.out.println(p.methodOne());//run time object
		System.out.println(p.method("annie"));//compile time object
		System.out.println(c.method(10));//compile time object
}
}
