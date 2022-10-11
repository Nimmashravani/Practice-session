package com.me.client;
import java.util.Random;
import java.util.function.DoubleSupplier;
import java.util.function.Supplier;

public class ClientSupplier {

	public static void main(String[] args) {
		Supplier<Double>random = ()-> new Random().nextDouble();
		
		System.out.println(random.get());
		
		DoubleSupplier dobRandom = ()-> new Random().nextDouble();
		System.out.println(dobRandom.getAsDouble());
	}
}