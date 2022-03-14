package com.purushottam1;
import java.util.Scanner;

public class Scanner1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("\t#Addition#");
		System.out.println("===============");
		System.out.println("Enter the Number1:");
		int a=sc.nextInt();
		System.out.println("Enter the Number2:");
		int b=sc.nextInt();
		
		int c=0;
		c=a+b;
		System.out.println("Addition :"+c);
		
		

	}

}
