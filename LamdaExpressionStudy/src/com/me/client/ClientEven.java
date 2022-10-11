package com.me.client;
import java.util.Scanner;


public class ClientEven {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CheckEven checkEven ;
		//CheckEvenImpl checkEvenImpl = new CheckEvenImpl();
		
		Scanner scInput = new Scanner(System.in);
		
		int number;
		
		boolean isEven;
		
		System.out.print("Enter a number: ");
		number = scInput.nextInt();
		
		//checkEven = checkEvenImpl;
		
		checkEven = (n) -> n%2 == 0;//Lambda Expression.
		
		isEven = checkEven.isEven(number);
		
		if(isEven){
			System.out.println("Given number is even.");
		}else{
			System.out.println("Given number is odd.");
		}
		
		scInput.close();
	}
}