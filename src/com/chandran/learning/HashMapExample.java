package com.chandran.learning;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class HashMapExample {

	public static void main(String[] args) {
		HashMap<Integer, String> hashMap = new HashMap<>();
		hashMap.put(10,"Ten");
		hashMap.put(20,"twenty");
		hashMap.put(60,"Sixty");
		hashMap.put(70,"Seventy");
		hashMap.put(50,"Fifty");
		
		for(Map.Entry hashMapItem : hashMap.entrySet()){
			System.out.println(hashMapItem.getKey()+"   "+hashMapItem.getValue());
		}
		hashMap.remove(10);
		hashMap.put(null,"Fifty");
		hashMap.put(null,"EEEEE");
		hashMap.put(null,"TTTTTT");
		System.out.println("After Removing an Item....");
		for(Map.Entry hashMapItem : hashMap.entrySet()){
			System.out.println(hashMapItem.getKey()+"   "+hashMapItem.getValue());
		}
		
		LinkedHashMap<Integer, String>  lhm = new LinkedHashMap<>();
		lhm.put(1,"A");
		lhm.put(5,"B");
		lhm.put(4,"C");
		lhm.put(3,"D");
		lhm.put(2,"E");
		lhm.put(2,"EA");
		lhm.put(2,"EB");
		lhm.put(2,"EC");
		lhm.put(2,"EX");
		lhm.put(null,"E");
		lhm.put(null,"EY1");
		lhm.put(null,"EY2");
		lhm.put(null,"EY3");
		
		for(Map.Entry<Integer, String> lkhm  : lhm.entrySet()){
			System.out.println(lkhm.getKey() +"   "+lkhm.getValue());
		}		
		
		
		TreeMap<Integer, String> treeMap = new TreeMap();
		
		treeMap.put(100, "one hunderead");
		treeMap.put(900, "nine hunderead");
		treeMap.put(800, "eight hunderead");
		treeMap.put(400, "four hunderead");
		treeMap.put(700, "seven hunderead");
		treeMap.put(600, "six hunderead");
		
		for(Map.Entry<Integer, String> tMap : treeMap.entrySet()){
			System.out.println(tMap.getKey() + tMap.getValue());			
		}
		
		treeMap.put(100, "XXXsix hunderead");
		//treeMap.put(null, "YYY hunderead");
		treeMap.put(-400, "four hunderead");
		treeMap.put(-403, "four hunderead");
		System.out.println("*****");
		for(Map.Entry<Integer, String> tMap : treeMap.entrySet()){
			System.out.println(tMap.getKey() + tMap.getValue());			
		}
		
	}
	

}
