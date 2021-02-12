import java.util.TreeSet;
import java.util.TreeMap;
import java.util.ArrayList;
import java.util.Collections;

class TreeSetExample {


	private int empno;
	private String ename;

	public TreeSetExample(int empno,String ename){
		this.empno = empno;
		this.ename = ename;
	}


	public String toString(){

		return (empno+":"+ename);
	}

	public static void main(String[]args){

		//TreeSet ts = new TreeSet();

		TreeSet<Integer> ts = new TreeSet<Integer>((I1,I2) -> (I1 > I2) ? -1 : (I1 < I2) ? 1: 0);
		ts.add(5);
		ts.add(10);
		ts.add(0);
		ts.add(25);
		ts.add(20);
		ts.add(15);
		System.out.println(ts);

		//TreeMap<Integer,String> tm = new TreeMap<Integer,String>();		//lambda expression
		TreeMap<Integer,String> tm = new TreeMap<Integer,String>((I1,I2) -> (I1 > I2)? -1 : (I1 < I2)? 1 : 0);
		tm.put(1,"annie");
		tm.put(3,"bridget");
		tm.put(2,"hector");
		tm.put(4,"nic");

		System.out.println(tm);


		ArrayList<TreeSetExample> list = new ArrayList<TreeSetExample>();

		list.add(new TreeSetExample(3,"annie"));
		list.add(new TreeSetExample(1,"bridget"));
		list.add(new TreeSetExample(2,"hector"));
		list.add(new TreeSetExample(4,"nic"));
		System.out.println(list);

		Collections.sort(list,(list1,list2) -> (list1.empno > list2.empno ) ? -1 : (list1.empno < list2.empno) ? 1: 0);
		System.out.println(list);
				
	}
}
