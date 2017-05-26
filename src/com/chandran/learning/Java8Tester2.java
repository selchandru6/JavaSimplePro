package com.chandran.learning;

import java.util.ArrayList;
import java.util.List;

public class Java8Tester2 {	

	public static void main(String args[]) {
		List<String> names = new ArrayList<>();

		names.add("Mahesh");
		names.add("Suresh");
		names.add("Ramesh");
		names.add("Naresh");
		names.add("Kalpesh");

		names.forEach(System.out::println);
	}
}
