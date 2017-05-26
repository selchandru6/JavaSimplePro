package com.chandran.learning;

public class DoYouKnow {

	public static void main(String[] args) {
		String[][] x = new String[5][]; // line n1
		x[0][0] = "Fred"; // line n2
		System.out.println("name is " + x[0][0]);
	}

	public void aMethod() {
		// line n1
		{ int x = 100; }
		//int x = 100;
		for (int x = 0; x < 10; x++) {
			//line 2
			//{ int x = 100; }
			//int x = 100;
			
		}
		// line n3
		int x = 100;
	}

}
