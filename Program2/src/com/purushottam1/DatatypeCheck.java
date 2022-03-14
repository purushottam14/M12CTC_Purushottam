package com.purushottam1;
public class DatatypeCheck {

	public static void main(String[] args) {
		
		int A;

		System.out.println("Size of Integer: A =  " + (Integer.SIZE/8) + " Bytes");
		A=100000;
		System.out.println("Int Datatype :"+A);

		byte B;
		System.out.println("Size of Byte : B =  " + (Byte.SIZE/8) + " Bytes");
		B=126;
		System.out.println("Byte Datatype :"+A);
		short S;
		System.out.println("Size of Short : S =  " + (Short.SIZE/8) + " Bytes");
		S=136;
		System.out.println("Short Datatype :"+S);
		long L;
		System.out.println("Size of Long : L =  " + (Long.SIZE/8) + " Bytes");
		L=345;
		System.out.println("Long Datatype :"+L);
		char C;
		System.out.println("Size of Char : C =  " + (Integer.SIZE/8) + " Bytes");
		C='A';
		System.out.println("Char Datatype :"+C);
		float F;
		System.out.println("Size of Float : F =  " + (Integer.SIZE/8) + " Bytes");
		F=50.50f;
		System.out.println("Float Datatype :"+F);
		double D;
		System.out.println("Size of Double : D =  " + (Double.SIZE/8) + " Bytes");
		D=3300;
		System.out.println("Double Datatype :"+D);

	}

}