import java.util.Scanner;

public class IfElseDemo {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		char ch =sc.next().charAt(0);
		sc.close();
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
		{
			System.out.println(ch+" is a vowel");
		}
		else if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
		{
			System.out.println(ch+" is a vowel");
		}
		else
			System.out.println(ch+" is not  a vowel");

	}

}
