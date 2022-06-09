package com.zoho.stackAssignment;

import java.util.Scanner;

public class PushPopPeek {

	int top;
	int capacity;
	String []stuName;
	PushPopPeek()
	{
		top=-1;
		capacity=5;
		stuName= new String[capacity];
			
	}
	public boolean isEmpty()
	{
		return top==-1;
		 
		
	}
	public boolean isfull()
	{
		return top==capacity-1;
			
	}
	public String push(String data)

	{if(isfull())
	{
		// throw exceptiion by me
		throw new IndexOutOfBoundsException("stack is overflow");	}
		
		return stuName[++top]=data;
	}
	public String pop()
	{
		if(isEmpty())
		{
			System.out.println("your stack is underflow");
		}
		return stuName[top--];
		
	}
	public String peek()
	{
		return stuName[top];
	}
	public void display()
	{
		for(String i: stuName)
		{
			System.out.println(i);
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 PushPopPeek ppp= new PushPopPeek();
		
		 int n=3;
		 System.out.println("total number of students "+n);
		 for(int i=0;i<n;i++)
		 {
			 String name= sc.next();
			 
			 ppp.push(name);
			 
		 }
		 ppp.display();
		 System.out.println(" to view the top most name :"+ppp.peek());
		 System.out.println("to remove thr top most name :"+ppp.pop());
		 System.out.println(" to view the top most name after pop :"+ppp.peek());

	}

}
