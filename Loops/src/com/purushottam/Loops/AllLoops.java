package com.purushottam.Loops;

public class AllLoops {
	public static void main(String[] args) 
	{
		System.out.println("ForLoop");
		  System.out.println("====================");
		  
	  // for loop
	  for(int i=1,j=1; i<10||j<10;i++,j++)
	  { 
		  j++;
		  System.out.println("i="+i+" and j="+j); 
	  }
	  System.out.println("====================");
	  System.out.println("WhileLoop");
	  System.out.println("====================");

	  // while loop 
		  int i=1,j=1;
		  while(i<10 || j<10)
		  { 
			  i++; j++;
		      System.out.println("i="+i+" and j="+j); 
		  }	
		System.out.println("======================");
		System.out.println("Dowhile Loop");
		  System.out.println("====================");
		// Do while loop
		int p = 1, q = 1;
		do {
			p++;
			q++;
			System.out.println("p=" + p + " and q=" + q);
		    } while (p < 10 || q < 10);
	}
}


