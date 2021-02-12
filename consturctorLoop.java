class A{

	String s = "hello world";
	int i = 0;
	char[] c = new char[8];
	A(){

	for(char x: s.toCharArray()){

		c[i++] = x;
	}
	}

	public static  void main(String[]args) {
		A  a = new A();
		System.out.println(a.c);
	}
}
