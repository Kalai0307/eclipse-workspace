import java.util.Scanner;

public class NestefSwitchDemo {
	public static void main(String []args) {
		
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter the character: ");
        char userCharacter = sc.nextLine().toLowerCase().charAt(0);
        String allCharacters = "abcdefghijklmnopqrstuvwxyz";
        int redFlag = 0;
        int n =allCharacters.length();
        for (int i = 0; i < n; i++) {
            if (userCharacter == allCharacters.charAt(i)||(n-i)== allCharacters.charAt(i))
            {
                redFlag = 1;
                break;
            }
        }
            int whiteFlag = 0;

            if (userCharacter == 'a' || userCharacter == 'e' || userCharacter == 'i' || userCharacter == 'o' || userCharacter == 'u') {
                whiteFlag = 1;
            }
            switch (redFlag) {
            case 0:
                System.out.println("The entered character is not an alphabet..");
                break;
            case 1:
                switch (whiteFlag) {
                    case 0:
                        System.out.println("The entered character is not a vowel..");
                        break;
                    case 1:
                        System.out.println("The entered character is a vowel..");
                        break;
                }
        }
        


	}
	

}
