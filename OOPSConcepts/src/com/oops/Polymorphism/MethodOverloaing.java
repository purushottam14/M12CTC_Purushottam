package com.oops.Polymorphism;
 class Add 
{
 public void add(int x,int y)
 {
 System.out.println("Additon of 2 is :"+(x+y));
 }
 public void add(int x,int y,int z)
 {
 System.out.println("Addition of 3 is :"+(x+y+z));
 }
 public void add(int x,int y,int z,int q)
 {
 System.out.println("Addition of 4 is :"+(x+y+z+q));
 }
 
}

public class MethodOverloaing {
	public static void main(String[] args)
	 {
	 Add ob=new Add();
	 ob.add(5,5);
	 ob.add(5,5,5);
	 ob.add(5,5,6,8);
	}
}
