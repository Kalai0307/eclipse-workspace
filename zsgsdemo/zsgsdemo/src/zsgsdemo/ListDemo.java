package zsgsdemo;

import java.util.ArrayList;
import java.util.Collections;

public class ListDemo {
	public static void main(String[] args) {
		ArrayList <Integer>abc=new ArrayList<Integer>();
		abc.add(5);
		abc.add(126);
		abc.add(51256);
		abc.add(515);
		abc.add(3, 0);
		//abc.clear();
		//abc.contains(abc);
		Collections.sort(abc);
		
		
		for(int i:abc)
		System.out.println(i);
		
		
	}

}
