import demo.A;
import demo.inner.C;
import demo.inner.HashMapExample;
public class B {

	public static void main(String[]args){

		A a = new A();
		a.display();
		C c = new C();
		c.display();

		HashMapExample h = new HashMapExample();
		h.hashMap();
	}
}
