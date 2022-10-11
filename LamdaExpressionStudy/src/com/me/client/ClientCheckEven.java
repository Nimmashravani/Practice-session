package com.me.client;

import com.me.entity.CheckEven;
import com.me.entity.CheckEvenImpl;

public class ClientCheckEven {

	public static void main(String[] args) {
	CheckEven checkEven = new CheckEvenImpl();
	
	System.out.println(checkEven.isEven(3));
	
	checkEven = new CheckEven(){
		@Override
		public boolean isEven(int number) {
			boolean isItEven;
			isItEven = number % 2 == 0;
			return isItEven;
		}
	};
	
	System.out.println(checkEven.isEven(3));*/
	
	
	
	  checkEven = (n)-> n%2 == 0;//Lambda Expression.
	  
	  System.out.println(checkEven.isEven(3));
	 
	
	}
}