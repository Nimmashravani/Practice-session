package com.me.client;
import com.me.entity.MySquare;

public class ClientMySquare {

	public static void main(String[] args) {
		
		MySquare mySquare = (n)-> n * n;
		
		System.out.println(mySquare.square(40));

	}

}