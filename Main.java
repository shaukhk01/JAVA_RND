import H.*;

abstract class Abs {

	public abstract void world();
	public abstract void hello();
}

 class World extends Hello{

	public void world(){

	}
}

public class Main {

	public static void main(String[]args) {

		World w = new World();
		w.world();
		w.hello();
	}
}






