package com.purushottam.Inheritance;
class Value{
	int a=10,b=20;
}
class Addition extends Value{
	void Add() {
	int c=a+b;
	System.out.println("The Addition is :"+ c);

	}
}
class Subtraction extends Value{
	void subtract() {
	int z;
	z=a-b;
	System.out.println("The Subtraction is :"+z);
	}
}
public class HierarchicalInheritance {
	public static void main(String []args) {
	Addition a= new Addition();
	a.Add();
	Subtraction s= new Subtraction();
	s.subtract();
	}
}
