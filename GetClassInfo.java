import java.lang.reflect.*;
public class GetClassInfo {

	String name;
	private String getName(){
		return name;
	}
	private void setName(){

		this.name=name;
	}
}

class Main {

	public static void main(String[]args)throws Exception {

		/*Class c = Class.forName("GetClassInfo");

		Method[] m = c.getDeclaredMethods();

		for(Method m1 : m)
			System.out.println(m1);

		Field[] f= c.getDeclaredFields();

		for(Field f1: f){
			System.out.println(f1);
		}*/

		GetClassInfo c1 = new GetClassInfo();

		Class x1 = c1.getClass();

		GetClassInfo c2 = new GetClassInfo();

		Class x2 = c2.getClass();
		System.out.println(x1.hashCode());
		System.out.println(x2.hashCode());

		if(x2 == x1)System.out.println("true");
}
}
