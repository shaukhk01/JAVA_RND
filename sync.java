class Synchronized extends Thread{

	 int m1 = 0;
	static int m2=0;
	public   void methodOne(int m1){
		this.m1 +=m1;

	}

	public  void methodTwo(){

	}

	public void methodThree(){
		System.out.println("concret method3");
	}

	public static void main(String[]args) {

		Synchronized sync  = new Synchronized();
		Synchronized t1 = sync;
		for(int i = 0; i<10;i++){
			sync.methodOne(i);
			t1.methodOne(i);
		}
		System.out.println(sync.m1);
	}
}
