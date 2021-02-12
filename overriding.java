class A{

	public void a(){
		System.out.println("a");
	}
}
class Tv  {


	 A b = new A();
	public  void switchOn(){
		System.out.println("TV switchON");
	}
	public  void channelChanged(){
		System.out.println("TV channel changed");
	}
	public void browser(){
		System.out.println("Yahoo COM");
	}
	public void a(){
		System.out.println("a override");
	}
}

class SmartTv extends Tv{

	public  void switchOn(){
		System.out.println("SMART TV ON");
	}


	public  void channelChanged(){
		System.out.println("SMARTTV channel changed");
	b.a();
	}
	public void browser(){
		System.out.println("GOOGLE COM");
	}

	public void a(){
		System.out.println("aaaa");
	}
}

class Overriding{

	public static void main(String[]args) {

		//based on object reference will be called t reference is TV 
		//so what ever available in Tv class all can access using t reference.
		Tv t = new SmartTv();
		t.channelChanged();
		t.browser();
		t.a();

//		A a = new Tv();//until extends Tv class it can not compile [make it compatible type]
//		a.a();
	}
}

