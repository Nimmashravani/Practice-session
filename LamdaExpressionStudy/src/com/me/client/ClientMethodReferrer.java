package com.me.client;

import com.me.entity.MyOwnPrint;

public class ClientMethodReferrer {

	public static void main(String[] args) {
		MyOwnPrint mop = (n)-> System.out.println(n);
		mop.printIt("Welcome to Lambdas");
		
		MyOwnPrint methodRef = System.out::println;
		
		methodRef.printIt("Lambdas are good!");
	}
}