package zsgsdemo;

import java.util.ArrayList;
import java.util.Arrays;
//import java.util.*;

public class RemoveDuplicateElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> elements = new Arraylist<>(Arrays.asList(1, 3, 4, 5, 1, 8, 6, 2));
		System.out.println("ArrayList with duplicates: " + elements);
		ArrayList<Integer> newList = removeDuplicates(elements);

		System.out.println("ArrayList with duplicates removed: " + newList);

	}

	public static <T> ArrayList<T> removeDuplicates(ArrayList<T> elements) {
		// TODO Auto-generated method stub
		ArrayList<T> newList = new ArrayList<T>();
		for (T i : elements) {
			if (newList.contains(i)) {
				newList.add(i);
			}
		}

		return newList;
	}
	

}
