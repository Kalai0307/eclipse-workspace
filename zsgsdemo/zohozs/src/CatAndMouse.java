package VidhinSanAssign;

import java.util.Scanner;

public class CatAndMouse {

	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);
	        int x=sc.nextInt();//catA
	        int y = sc.nextInt();//catB
	        int z=sc.nextInt();//mouse
	        int distanceFromCatAtoMouse=Math.abs(x-z);
	        int distanceFromCatBtoMouse=Math.abs(y-z);    
	        if(distanceFromCatAtoMouse>distanceFromCatBtoMouse)
	        {
	          System.out.println("CAT B");
	        }
	        else if (distanceFromCatAtoMouse<distanceFromCatBtoMouse) {
	           System.out.println("CAT A");
	        }
	        else
	        {
	           System.out.println("Mouse C");
	        }
	        
sc.close();
	}

}
