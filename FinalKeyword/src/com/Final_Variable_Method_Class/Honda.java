package com.Final_Variable_Method_Class;

class Bike{  
	  final void run(){System.out.println("running safely");}  
	}  
	     
	class Honda extends Bike{  
	  // void run()
	   //{System.out.println("running safely with 100kmph");}  
	    //giving error  you can not override the final method
	   public static void main(String args[]){  
	   Honda honda= new Honda();  
	   honda.run();  
	   }  
	}  