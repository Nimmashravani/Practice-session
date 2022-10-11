package com.me.client;

import com.me.entity.MyOwnPrint;

public class ClientMyOwnPrint {

	public static void main(String[] args) {

		MyOwnPrint myOwnPrint = (str)-> System.out.println(str);
		
		myOwnPrint.printIt("Welcome to Lambda Expressions!!");
	}
}