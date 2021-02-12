import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;
import java.util.TreeMap;

class MyComparator {

	public static void main(String[]args){

		ArrayList<Integer> l = new ArrayList<>();
		l.add(10);
		l.add(30);
		l.add(40);
		l.add(20);
		l.add(50);
		Collections.sort(l);
		System.out.println(l);
		System.out.println(l);

		Collections.sort(l,(l1,l2)->(l1 > l2) ? -1 : (l1 < l2) ? 1 : 0);
		System.out.println(l);


		TreeSet<Character> ts = new TreeSet<>((l1,l2)->(l1 > l2) ? -1 : (l1 < l2) ? 1 : 0);
		ts.add('A');
		ts.add('C');
		ts.add('D');
		ts.add('E');
		ts.add('B');
		System.out.println(ts);


		TreeMap<Integer,String> tm = new TreeMap<Integer,String>((l1,l2)->(l1 > l2) ? -1 : (l1 < l2) ? 1 : 0);
		tm.put(4,"Annie");
		tm.put(3,"Hector");
		tm.put(2,"Bridget");
		tm.put(1,"Nic");
		System.out.println(tm);

		
	}
}
