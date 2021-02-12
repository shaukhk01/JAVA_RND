
class MyThread extends Thread{

	static Thread mt;
	public void run(){

	try{
		mt.join();
	}
	catch(InterruptedException e){
		e.printStackTrace();
	}
//		Thread.yield();

		for(int index = 0; index < 5;index++)System.out.println(Thread.currentThread().getName());
	}

	public static void main(String[]args){

		MyThread t = new MyThread();
		t.mt = t.currentThread();
		t.start();

		for(int index = 0; index < 15; index++){

		try{
			t.join();
			//t.sleep(1000);
		}
		catch(InterruptedException e){
			e.printStackTrace();
		}
			System.out.println(t.getPriority()+"-----"+t.currentThread().getName());
		}
	}
}
