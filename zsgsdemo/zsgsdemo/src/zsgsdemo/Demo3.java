package zsgsdemo;

import java.util.Scanner;
/*
 *   1
    212
   32123
  4321234
 543212345
  4321234
   32123
    212
     1

 * 

 * 
 */
public class Demo3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int i, j, k, l;
        
		System.out.println(" number of rows: ");
		int row = sc.nextInt();

		for (i = 1; i <= row; i++) {
			for (j = i; j <= row; j++) {
				System.out.print(" ");
			}
			for (k = i; k >= 1; k--) {
				System.out.print(k);
			}
			for (l = 2; l <= i; l++) {
				System.out.print(l);

			}
			System.out.println();
		}
		for (i = row - 1; i > 0; i--) {
			for (j = 1; j <= row - i + 1; j++) {
				System.out.print(" ");
			}
			for (k = i; k >= 1; k--) {
				System.out.print(k);
			}
			for (l = 2; l <= i; l++) {
				System.out.print(l);
			}
			System.out.println();
		}

	}

}
