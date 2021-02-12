package Thread;

class InterThreadCommunication {


	String traficLight = 30;
	public void run(){

		Synchronized(this);
		{

			try{
			for(int index = 1;index <=traficLigh;index++){
				System.out.println("Signal is Red");
				Thread.sleep(10000);
			}
			}
			catch(InterrruptedException e){
				e.printStackTrace();
			}

			this.notifyAll();
		}
	}
}


