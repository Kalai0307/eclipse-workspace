import java.util.Scanner;
// function call  by itself
public class RecursionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int UserInput = sc.nextInt();
		int fact=1;
	    int result=	factorial(UserInput);
		
		System.out.println("factorial of a number "+result);

	}

	public static int factorial(int n) {
		// TODO Auto-generated method stub
		if(n!=0)
		{
			return n*factorial(n-1);
		}
		else
			return 1;
		
	}

}
