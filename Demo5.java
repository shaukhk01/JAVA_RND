final class parent {


static 	int x = 100;
	public static int m1(){

		System.out.println(++x);
		return x+1;
	}

	static int z = m1();

	public static void main(String[]args) {

		parent p = new parent();
	}
}

//class child extends parent{

//}

