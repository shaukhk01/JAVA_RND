class Daemon extends Thread {

	public void run(){

		for(int index = 0 ; index < 5; index++) {

			try{
				System.out.println(Thread.currentThread().getName());
				Thread.sleep(2000);
		this.suspend();
			}
			catch(InterruptedException e){}
		} 
	}
	public static void main(String[]args){

		System.out.println(Thread.currentThread().isDaemon());

	//	Thread.currentThread().setDaemon(true);
		Daemon t = new Daemon();
		System.out.println(t.isDaemon());
	//	t.setDaemon(true);
		t.start();
		//t.stop();
		t.resume();
		System.out.println(t.isDaemon());
		
	}
}

		
