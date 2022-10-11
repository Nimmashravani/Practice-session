package com.me.entity;

public class CheckPrimeImpl implements CheckPrime {

	@Override
	public boolean isPrime(int n) {
		int sqrt = (int)Math.sqrt(n);
		boolean flag = true;
		
		for(int i = 2 ; i <= sqrt ; i++){
			if(n % i == 0){
				flag = false;
				break;
			}
		}
		return flag;
	}
}