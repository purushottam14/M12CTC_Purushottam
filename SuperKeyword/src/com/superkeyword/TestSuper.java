package com.superkeyword;


	class Animal{  
		String color="white";  
		}  
	class Dog extends Animal{  
	
		String color="black";  
		void printColor(){  
		System.out.println("This is called from Child class :"+color);//prints color of Dog class  
		System.out.println("This is call from Parentclass :"+super.color);//prints color of Animal class  
		}  
	}  
		class TestSuper{  
		public static void main(String args[]){  
		Dog d=new Dog();  
		d.printColor();  

		}
	}