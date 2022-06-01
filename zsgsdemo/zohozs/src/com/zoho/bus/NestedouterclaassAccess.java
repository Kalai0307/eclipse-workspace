package com.zoho.bus;

import com.zoho.bus.NestedClassDemo.InnerClass;

public class NestedouterclaassAccess {

	public static void main(String[] args) {
		
//	NestedClassDemo nsd = new NestedClassDemo();
//		nsd.nonStaticMethod();
//		//InnerClass inner = nsd.new InnerClass();

		NestedClassDemo nsd = new NestedClassDemo();
		InnerClass inner = nsd.new InnerClass();
		inner.innerClassMethod();
	}

}
