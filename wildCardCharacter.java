package com.univerisity.acadmic;
import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;

class Demo {


	public void add(ArrayList<Integer> l){
		l.add(10);
		//l.add("annie");
	}

	public void add(List<?> l){

		l.add(null);

	}
	public static void main(String[]args){

		ArrayList l = new ArrayList();
		l.add(l);
		l.add(l);



		ArrayList<?> a = new ArrayList<String>();
		ArrayList<? extends Number> al = new ArrayList<Integer>();
		//ArrayList<? extends Runnable> all = new ArrayList<String>();//because of String is not implementation class of Runable interface.
		//

		ArrayList<? super String> alll = new ArrayList<Object>();

		//ArrayList<?> aa = new ArrayList<?>();


	}
}
