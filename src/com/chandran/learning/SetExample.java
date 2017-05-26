package com.chandran.learning;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<Integer> setA = new HashSet<>();
		Set<Integer> setB = new LinkedHashSet<>();
		Set<Integer> setC = new TreeSet<>();
		
		
		setA.add(100);
		setA.add(200);
		setA.add(300);
		setA.add(200);
		setA.add(300);
		setA.add(400);
		setA.add(500);
		setA.add(400);
		
		setB.add(100);
		setB.add(200);
		setB.add(300);
		setB.add(200);
		setB.add(300);
		setB.add(400);
		setB.add(500);
		setB.add(700);
		setB.add(800);
		setB.add(900);
		setB.add(600);
		setB.add(110);
		
		setC.add(500);
		setC.add(700);
		setC.add(300);
		setC.add(200);
		setC.add(100);
		setC.add(400);
		setC.add(500);
		setC.add(400);
		
		
		Iterator<Integer> setAitr = setA.iterator();
	System.out.println("HashSet");
	while(setAitr.hasNext()){
		System.out.println((Integer)setAitr.next());		
	}
	
	Iterator<Integer> setBitr = setB.iterator();
	System.out.println("LinkedHashSet");
	while(setBitr.hasNext()){
		System.out.println(setBitr.next());		
	}
	Iterator<Integer> setCitr = setC.iterator();
	System.out.println("TreeSet");
	while(setCitr.hasNext()){
		System.out.println(setCitr.next());		
	}
		
	}

}
