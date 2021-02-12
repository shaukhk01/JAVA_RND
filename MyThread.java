
class MyThread extends Thread{


	
	public void run(){

		int count = 1;
		for(int index = 0; index < 10000; index++){

			System.out.println("I am Lazy"+count++);
		}
			try{

				Thread.sleep(10000);
			}
			catch(InterruptedException e){
				System.out.println("I got interrupted");
			}
		}
	}

class Main{

	public static void main(String[]args) {

		MyThread t = new MyThread();
		t.start();
//		t.interrupt();//threading goes to waiting stage then automaticlly raise interrupted exception.
		System.out.println("Enter of Thraed");
	}
}
	

