package Thread;

public class ExecuteMain {

	public static void main(String[]args) {

		Display d1 = new Display();
		Display d2 = new Display();
		ThreadExample t = new ThreadExample(d1,"annie");
		ThreadExample t2 = new ThreadExample(d2,"hector");
		t.start();
		t2.start();

	}
}
