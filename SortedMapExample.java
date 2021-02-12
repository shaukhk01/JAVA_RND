import java.util.SortedMap;
import java.util.TreeMap;
import java.util.HashMap;
import java.util.Comparator;
public class SortedMapExample implements Comparator {



	public static void main(String[]args){

		
		SortedMap tm = new TreeMap();
		//HashMap tm = new HashMap();
		tm.put(1,"annie");
		tm.put(3,"hector");
		tm.put(2,"bridget");
		tm.put(4,"nic");
		System.out.println(tm.headMap(3));
		System.out.println(tm);
		System.out.println(tm.tailMap(3));
	}
}


