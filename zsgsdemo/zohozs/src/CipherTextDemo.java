import java.util.Scanner;

public class CipherTextDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub  
		//Scanner sc = new Scanner(System.in);
		Scanner sc = new Scanner(System.in);
        System.out.println(" Input the plaintext message : ");
        String plaintext = sc.nextLine();
        System.out.println(" number of shifts+");
        int shift = sc.nextInt();
        String ciphertext = "";
        char ch;
        for(int i=0;i<plaintext.length();i++)
        {
        	ch= plaintext.charAt(i);
        	
        	if(ch>='a'&&ch<='z')
        	{
        		ch=(char)(ch+shift);
        		if(ch>'z')
        		{
        			ch= (char) (ch+'a'-'z'-1);
        		}
        		ciphertext =ciphertext+ch;
        	}
        	
        	else if(ch>='A'&&ch<='Z')
        	{
        		ch=(char)(ch+shift);
        		if(ch>'Z')
        		{
        			ch= (char) (ch+'A'-'Z'-1);
        		}
        		ciphertext =ciphertext+ch;
        	}
        	
        	else {
                ciphertext = ciphertext + ch; 
        }
        }
        System.out.println(" finaltext : " + ciphertext);
	}

}
