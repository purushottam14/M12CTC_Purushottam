package com.purushottam1;

public class Brand {
	
		String carName;
		int carPrize;
		String carColor;      
		

		void displayCarName() {             
			carName="Fortuner";
			System.out.println("Car Name::"+carName);
		}
		void displayCarPrize() {          
			carPrize=3000000;
			System.out.println("Car Prize ::"+carPrize);
			}
		void displayCarColor() {         
			carColor="White";
			System.out.println("Car color::"+carColor);
			}
		
		public static void main(String[] args) {  
			
			
		Brand obj=new Brand();                   
			obj.displayCarName();
			obj.displayCarPrize();            
			obj.displayCarColor();

		

	}
}
