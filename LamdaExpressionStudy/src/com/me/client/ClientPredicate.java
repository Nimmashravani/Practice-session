package com.me.client;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class ClientPredicate {

	public static void main(String[] args)
	{
		Predicate<Integer>CheckEven = (n)-> n%2 ==0;
		BiPredicate<Integer, Integer>whichIsGreater = (a,b)-> a>b;
		System.out.println(CheckEven.test(20));
		System.out.println(whichIsGreater.test(2, 10));
	}
}
