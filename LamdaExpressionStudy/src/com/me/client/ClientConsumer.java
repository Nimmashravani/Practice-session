package com.me.client;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class ClientConsumer {

	public static void main(String[] args) {
		Consumer<Integer>consInt = (n)->System.out.println(n*n);
		consInt.accept(10);
		
		
		Consumer<String>printString = (n)->System.out.println(n);
		printString.accept("welcome to lambda expression");
		BiConsumer<Integer, Integer>biConsume = 
				(a,b)->System.out.println(a*b);
				
		biConsume.accept(10, 20);
	}
}