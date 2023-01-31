package com.bridgelabz.hashtable;

public class Main {
	
	public static void main(String[] args) {
		
		String paragraph = "Paranoids are not paranoid because "
						  +"they are paranoid but because they keep"
						  +" putting themselves deliberately into "
						  +"paranoid avoidable situations";
		String[] words = paragraph.split(" ");

		MyMap map = new MyMap();
		for (String word : words) {
			int count = map.get(word);
			map.put(word, count + 1);
		}
		System.out.println("The frequency of 'Paranoids' is: " + map.get("Paranoids"));
		System.out.println("The frequency of 'paranoid' is: " + map.get("paranoid"));
		System.out.println("The frequency of 'because' is: " + map.get("because")); 
		System.out.println("The frequency of 'they' is: " + map.get("they"));
		System.out.println("The frequency of 'into' is: " + map.get("into"));
	}
}
