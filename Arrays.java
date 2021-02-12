import java.util.Arrays;
import java.util.Comparator;
class Demo implements Comparator {

	public static void main(String[]args){

		int[] item = {4,3,1,5,8,9,7,2};
		System.out.println(Arrays.toString(item));
		Arrays.sort(item,new Demo());
		System.out.println(Arrays.toString(item));
	}
}
