package com.Final_Variable_Method_Class;

public class Vehicle {
		
	 final int speedlimit = 60;
	
		  void controlSpeed() {
			  
		    System.out.println("Car Speed Limit :"+ speedlimit);
		   
		  }
		  public static void main(String args[]) {
			  Vehicle obj = new Vehicle();
		    obj.controlSpeed();
		    
		  }
		}
	

