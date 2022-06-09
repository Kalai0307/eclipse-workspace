package VidhinSanAssign;

import java.util.ArrayList;

public class SubArrayDivision {

	public static void main(String[] args) {
		ArrayList<Integer> s=new ArrayList<Integer>();
		s.add(2);
		s.add(2);
		s.add(1);
		s.add(3);
		s.add(2);
		int m = 2;
		int d = 4;
		int count = 0;
		int sum = 0;
		int n = s.size();
		for (int i = 0; i < n - m + 1; i++) {

			for (int j = i; j < m + i; j++) {
				sum = sum + s.get(j);
			}
			if (s.get(i) == 4) {
				count++;
			}

			if (sum == d) {
				count++;
			}

			sum = 0;
		}
System.out.println(count);
	}

}
