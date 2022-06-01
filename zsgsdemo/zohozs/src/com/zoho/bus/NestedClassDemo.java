package com.zoho.bus;

public class NestedClassDemo {
static //static method
	 int fee=1000;
	
	
	public static void main(String[] args) {

		NestedClassDemo nsd = new NestedClassDemo();
		InnerClass inner = nsd.new InnerClass();
		inner.innerClassMethod();
		//System.out.println("nestedclass sysout");
		System.out.println(fee);
		//nsd.nonStaticMethod();
	}

	public void nonStaticMethod() {
		//System.out.println("verigi");
		System.out.println(fee);
InnerClass inner = new InnerClass();

	inner.innerClassMethod();
	}

	class InnerClass {
		public void innerClassMethod() {
			System.out.println("InnerclassMethod");
			System.out.println(fee);
		}

	}

}
