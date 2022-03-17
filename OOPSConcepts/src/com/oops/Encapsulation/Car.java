package com.oops.Encapsulation;

public class Car
	{
	int speed; //Variable
	public int getSpeed() // methods
	{
	return speed;
	}
	public void setSpeed(int speed) {
	this.speed = speed;
	}
	
	public static void main(String[] args) 
	{
	Car obj=new Car();
	 obj.setSpeed(80);
	 System.out.println(obj.getSpeed());
	}
}

