package com.purushottam1;

public class Student {

			int rollNo;
			String name;
			String branch;
			
			
			public int getRollNo() {                 // method return the value which is define in set method
				return rollNo;
				
			}
			public String getName() {
				return name;
				
			}
			public String getBranch() {
				return branch;
			}
			public void setRollNo(int n) {
				rollNo=n;
				
			}
			public void setName(String s) {      //seter method is set The Value and declare the parameters
				name=s;
				
			}	
			public void setBranch(String b) {
					branch=b;
			
			}	
			
			

			public static void main(String[] args) {
				Student details=new Student();
				 
				details.setRollNo(111);                       //call the method assign the value 
				details.setName("Nitin Surywanshi");
				details.setBranch("Computer Science");
				Student details1=new Student();
				details1.setRollNo(112);                       //call the method assign the value 
				details1.setName("Akshay Ghugre");
				details1.setBranch("Computer Science");
				
				
				System.out.println("\t#Students Details#\n");
				System.out.println("=====================================");
									
				System.out.println("Student Roll Number :"+details.getRollNo());  
				System.out.println("Student Name :"+details.getName());      
				System.out.println("Student Branch :"+details.getBranch());
				System.out.println("=====================================");
				System.out.println("Student Roll Number :"+details1.getRollNo());  
				System.out.println("Student Name :"+details1.getName());      
				System.out.println("Student Branch :"+details1.getBranch());
				
				
				


	}

}
