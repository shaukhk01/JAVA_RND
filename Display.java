package Thread;

public class Display {

	
	public   synchronized void wish(String name){

		for(int index = 0; index < 10; index++){

			System.out.print("Good morning:");
			try{
				Thread.sleep(2000);
			}
			catch(InterruptedException e){e.printStackTrace();}
			System.out.println(name);
		}
	}
}
