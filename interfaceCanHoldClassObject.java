interface Member {

	public void callBack();
}

class Store {

	Member[] members = new Member[10];
	int count = 0;

	void register(Member m){

		members[count++] = m;
	}

	void invite(){
		for(int i = 0; i<count;i++){
			members[i].callBack();
		}
	}
}

class Customers implements Member {

	String name;

	Customers(String name){
		this.name = name;
	}

	public void callBack(){
		System.out.println("I,will visit "+name);
	}
}

class Main {
	public static void main(String[]args) {

		Customers c1 = new Customers("annie");
		Customers c2 = new Customers("nic");
		Customers c3 = new Customers("bridget");
		Customers c4 = new Customers("hector");

		Store s = new Store();
		s.register(c1);
		s.register(c2);
		s.register(c3);
		s.register(c4);
		s.invite();

	}
}




