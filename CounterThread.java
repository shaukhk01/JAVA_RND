package sync;

public class CounterThread extends Thread{

     protected Counter counter = null;

     public CounterThread(Counter counter){
        this.counter = counter;
     }

     public void run() {
	for(int i=0; i<10; i++){
		process(i);
           counter.add(i);
        }
     }


     private void process(int i){

	     try{
		     Thread.sleep(1000);
	     }
	     catch(InterruptedException e){
		     e.printStackTrace();
	     }
     }
  }
