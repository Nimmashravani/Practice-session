package com.me.client;

import java.util.Scanner;

import com.bvk.entity.CheckPrime;

public class ClientPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		com.me.entity.CheckPrime checkPrime;
		/*CheckPrimeImpl checkPrimeImpl = new CheckPrimeImpl();
		
		checkPrime = checkPrimeImpl;*/
		
		Scanner scInput = new Scanner(System.in);
		
		int number;
		
		boolean isItPrime;
		
		System.out.print("Enter a number: ");
		number = scInput.nextInt();
		scInput.close();
		
		checkPrime = (n) -> {
			int sqrt = (int)Math.sqrt(n);
			boolean flag = true;
			
			for(int i = 2 ; i <= sqrt ; i++){
				if(n % i == 0){
					flag = false;
					break;
				}
			}
			return flag;
		};
		
		isItPrime = checkPrime.isPrime(number);
		
		if(isItPrime){
			System.out.println("Given number is prime.");
		}else{
			System.out.println("Given number is not prime.");
		}
	}
}