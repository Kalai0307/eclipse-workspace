package VidhinSanAssign;

public class Mck {

	public static void main(String[] args) {
		  char c='A';
	        char p=c;
	        
	        for(int i=0;i<5;i++)
	        {
	          for(int j=i;j<5;j++)
	          {
	              System.out.print(" ");
	          }
	          for(int k=0;k<=i;k++)
	          {
	                System.out.print(p+" ");
	          }
	            System.out.println();
	            p++;
	        }
	       ;
	       
	        char s='D';
	        char l=s;
	          for(int i=1;i<=4;i++)
	          {
	              for(int j=0;j<=i;j++)
	              {
	                   System.out.print(" ");
	              }
	              for(int k=i;k<=4;k++)
	              {
	                  System.out.print(l+" ");
	              }
	              l--;
	               System.out.println();
	          }

	}

}
