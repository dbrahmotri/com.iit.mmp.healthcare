package org.iit.healthcare.betabatch;

import java.util.HashMap;
import java.util.Set;

public class HashMapEx {
	public static void main(String[] args) {
		
		HashMap<String,Integer> hMap = new HashMap<String,Integer>();
		hMap.put("Arti",10);
		hMap.put("James",20);
		hMap.put("John",30);
		hMap.put("Charlie",40);
		hMap.put("Arti",50);
		String Arti="10";
		String James="20";
		String John ="30";
		String Charlie="40";
		Arti="50";
		int i=10;
		i=20;
		System.out.println(i);
		
		
		System.out.println("size of the map " + hMap.size());
		System.out.println("Marks of Arti  " + hMap.get("Arti"));
		
		
		Set<String> setofKeys = hMap.keySet();
		
		for (String s: setofKeys)
		{
			System.out.println("Key is :: "+ s); 
			System.out.println("value is :: "+ hMap.get(s));
		}
		
		hMap.get("Arti");
		
		
		
	}

}
