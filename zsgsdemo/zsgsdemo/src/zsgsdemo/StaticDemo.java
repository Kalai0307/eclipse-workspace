package zsgsdemo;

public class StaticDemo {

	public static void main(String[] args) {
        int i=5;
        test(i);
		System.out.println(i);
		
		
	}

	private static void test(int i) {
		// TODO Auto-generated method stub
		
		i++;
		int j=6;
		System.out.println("j"+j);
		System.out.println(i);;
	}

}
