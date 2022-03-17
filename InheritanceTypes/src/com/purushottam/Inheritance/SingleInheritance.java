package com.purushottam.Inheritance;
class A{
	int a=10,b=20;
	void add() {
		int c= a+b;
		System.out.println("The Addition is :"+c);
	}
}

public class SingleInheritance extends A {
	
	void subtract() {
		int a=10,b=20,c;
		c= a-b;
		System.out.println("The Subtraction is : "+c);
	}
	public static void main(String [] args) {
		SingleInheritance t = new SingleInheritance();
		t.add();
		t.subtract();
	}

}
