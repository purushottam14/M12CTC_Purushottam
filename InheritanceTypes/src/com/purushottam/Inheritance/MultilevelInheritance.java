package com.purushottam.Inheritance;
class  Animal{  
	void eat(){
		System.out.println("eating...");
		}  
	}  
	class Dog extends Animal{  
		
	void bark(){
		System.out.println("barking...");
	}  
   }  
	class BabyDog extends Dog{  
	void weep(){
		System.out.println("weeping...");
		}  
	}  
	  
public class MultilevelInheritance {
	public static void main(String [] args) {
	BabyDog b= new BabyDog();
	b.eat();
	b.bark();
	b.weep();
}
}