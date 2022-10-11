package com.me.client;

import com.me.entity.MyAdder;

public class ClientMyAdder {

	public static void main(String[] args) {
		MyAdder myAdder = (a, b)-> (a+b);
		System.out.println(myAdder.addIt(10, 20));
	}
}