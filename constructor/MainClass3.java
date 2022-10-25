package com.constructor;
//explicit constructor chaining
 class A {
public A(int i) {
	System.out.println("super class constructor with int arg");
}
}
class B extends A{
	public B() {
		super(100);
		System.out.println("super class constructor without arg");
	}
	}
	public  class MainClass3 {
		// TODO Auto-generated constructor stub
		public static void main(String[] args) {
			System.out.println("main starts");
			B b1=new B();
			System.out.println("main ends");
	}

}
