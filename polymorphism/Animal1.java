package polymorphism;
class Animal1{  
void eat(){
	System.out.println("eating");
	}  
}  
class Dog extends Animal1{  
void eat(){
	System.out.println("eating fruits");
	}  
}  
class BabyDog extends Dog{  
void eat(){
	System.out.println("drinking milk");
	}  
public static void main(String args[]){  
Animal1 a1,a2,a3;  
a1=new Animal1();  
a2=new Dog();  
a3=new BabyDog();  
a1.eat();  
a2.eat();  
a3.eat();  
}  
}  