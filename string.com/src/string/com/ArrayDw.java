/**
 * 
 */
package string.com;

import java.util.Scanner;

/**
 * @author dell1
 *
 */
 public class ArrayDw
 {
	
	
	     public static void main(String[]args)
	     {
	    	 Scanner scan= new Scanner (System.in);
	         System.out.println("no of col and row");
	         int row= scan.nextInt();
	         int col =scan. nextInt();
	         int a[][]=new int [row][col];
	         int sum1 =0;
	         int sum2 =0;
	         for(int i=0;i<row;i++)
	         {
	           for(  int j =0;j<col;j++)
	           {
	               a[i][j]= scan.nextInt();
	           }
	         }
	         for(int i=0;i<row;i++)
	         {
	           for(  int j =0;j<col;j++)
	           {
	        	   System.out.print(a[i][j]);
	           }
	           System.out.println("\n");
	           }
	         for(int i=0;i<row;i++)
	         {
	           for(  int j =0;j<col;j++)
	           {
	           
	               if(a[i]==a[j])
	               {
	                   sum1=sum1+a[i][j];
	               }
	               if(a[i]==a[col-j-1])
	               {
	                   sum2=sum2+a[i][j];
	               }
	           }
	         }
	         int result = sum1-sum2;
	         System.out.println(sum1);
	         System.out.println(sum2);
	         System.out.println(result);
	     }
  
	     } 
