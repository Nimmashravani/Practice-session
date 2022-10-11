package com.me.client;
import java.util.function.Function;
public class ClientFunctionNew {
public static void main(String[] args) {
	Function<Integer, Integer>calculateTwice = (n)->n*n;
	System.out.println(calculateTwice.apply(10));
}
}
