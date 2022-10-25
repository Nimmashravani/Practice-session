package com.constructor;
//implicit constructor chaining
 class M {
public M() {
	System.out.println("super class constructor without arg");
}
}
class N extends M{
	public N() {
		
		System.out.println("super class constructor without arg");
	}
	}
	public  class MainClass4 {
		// TODO Auto-generated constructor stub
		public static void main(String[] args) {
			System.out.println("main starts");
			N n1=new N();
			System.out.println("main ends");
	}

}
