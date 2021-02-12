class A{
	
	public synchronized void foo(B b) {
		
		System.out.println("Thread start Execution of foo method");
		try {
			Thread.sleep(6000);
		}
		catch(InterruptedException e) {}
		
		System.out.println("foo method trying to call b.last");
		b.last();
	}

		public synchronized void last() {
			
			System.out.println("A Last Method");
		}
	
}

class B{
	
	public synchronized void bar(A a) {
		
		System.out.println("Thread start Execution of bar method");
		try {
			Thread.sleep(6000);
		}
		catch(InterruptedException e) {}
		System.out.println("bar method trying to call a.last()");
		a.last();
	}
	
	public synchronized void last() {
		System.out.println("B Last Method");
	}
}
public class DeadLock extends Thread{

	
	A a = new A();
	B b = new B();
	public void m1() {
		
		this.start();
		a.foo(b);
	}
	
	public void run() {
		
		b.bar(a);

	}
	public static void main(String[]args) {
		
		DeadLock l = new DeadLock();
		l.m1();
	}
}

