package com.me.client;

import java.util.function.BiFunction;

public class ClientBiFunction {

	public static void main(String[] args) {

		BiFunction<Integer, Integer, Double>biFunction = (a,b)->a*b*9.8;
		
		System.out.println(biFunction.apply(10,2));

	}

}
