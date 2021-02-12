package Thread;

public class ThreadExample extends Thread {


	String name;
	Display d;
	public ThreadExample(Display d, String name){
		this.d = d;
		this.name = name;
	}

	public void run(){

		d.wish(name);
	}
}

