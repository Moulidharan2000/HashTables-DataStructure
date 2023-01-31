package com.bridgelabz.hashtable;

public class Main {
	
	public static void main(String[] args) {
		
		String str = "To be or not to be";
		String [] words = str.split(" ");
		MyMap map = new MyMap();
		for(String word : words) {
			int count = map.get(word);
			map.put(word, count + 1);
		}
		System.out.println(map.get("to"));
		System.out.println(map.get("be"));
		System.out.println(map.get("or"));
		System.out.println(map.get("not"));
	}
}
