package com.chandran.learning;

public class RecursionExample {

	static long n1 = 0, n2 = 1, n3 = 0;

	static void printFibo(int count) {
		try{
		if (count > 0) {
			n3 = n1 + n2;
			n1 = n2;
			n2 = n3;
			System.out.print(" " + n3);
			printFibo(count - 1);
		}
		}catch(Exception ex){
			ex.printStackTrace();
		}
	}

	public static void main(String[] args) {
		int count = 1000;
		try{
		System.out.print(n1 + " " + n2);// printing 0 and 1
		printFibo(count - 2);// n-2 because 2 numbers are already printed
		}/*catch(Exception ex){
			ex.printStackTrace();
		}*/finally {
			System.out.println("Try without Exception.....");
		}
	}
}