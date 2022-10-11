package com.me.client;

import com.me.entity.AddImpl;
import com.me.entity.IAdder;

public class ClientAdd {
public static void main(String[] args) {
	AddImpl add = new AddImpl();
	System.out.println(add.add(10,20));
	
	IAdder add1 = new AddImpl();
	System.out.println(add1.add(10,20));
	
	IAdder add2 =((a,b)->a+b);
	System.out.println(add2.add(10,20));
}
}
