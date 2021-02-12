package B;
import A.*;

class World extends Hello {

	World(){

	}
	final int x;
	{
		x = 1000;
	}
	
	public static void main(String[]args) {

		World w = new World();
		Hello h = new Hello();
		w.hello();

	}
}

