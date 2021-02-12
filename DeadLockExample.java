import java.io.*;

class A{

	public synchronized void methodA(B b){
	try{
		Thread.sleep(3000);
	}
	catch(InterruptedException e){}

	b.write();
	}

	public synchronized void write(){

		try{
		FileInputStream fos = new FileInputStream("abc.txt");
		}
		catch(FileNotFoundException e){}
	}
}

class B {


	public synchronized void methodB(A a) {

		try{
			Thread.sleep(3000);
		}
		catch(InterruptedException e){}

		a.write();
	}

	public synchronized void write(){

		try{
		FileInputStream fos = new FileInputStream("abc.txt");
		}
		catch(FileNotFoundException e){}
	}
}

class Main extends Thread{

	A a = new A();
	B b = new B();

	public void execute(){

		this.start();
		b.methodB(a);
	}

	public void run(){

		a.methodA(b);
	}

	public static void main(String[]args) {


		Main m = new Main();
		m.execute();
	}
}

