package VidhinSanAssign;

public class CountingValleys {

	public static void main(String[] args) {
	String path="UDDDUDUU";
		 int h=0,count=0;
		   for(int i=0;i<path.length();i++)
		   {
		     if(path.charAt(i)=='U')
		     {
		       h++;
		     }
		     else
		     {
		       h--;
		     }
		     
		     if(path.charAt(i)=='U'&&h==0)
		     {
		       count++;
		     }
		   }
		   System.out.println(count);
	}

}
