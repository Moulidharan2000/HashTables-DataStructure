package com.bridgelabz.hashtable;

import java.util.LinkedList;

public class MyMap {
	
	LinkedList<MyMapNode>[] data;
	
	@SuppressWarnings("unchecked")
	public MyMap() {
		data = new LinkedList[26];
	}
	
	private int getIndex(char c) {
		return c - 'a';
	}
	
	public void put(String key, int value) {
		
		int index = getIndex(key.charAt(0));
		
		if(data[index] == null) 
			data[index] = new LinkedList<>();
		
		LinkedList<MyMapNode> bucket = data[index];
		
		for(MyMapNode node : bucket) {
			if(node.key.equals(key)) {
				node.value = value;
				return;
			}
		}
		bucket.addLast(new MyMapNode(key, value));
	}
	
	public int get(String key) {
		
		int index = getIndex(key.charAt(0));
		LinkedList<MyMapNode> bucket = data[index];
		if(bucket == null)
			return 0;
		for(MyMapNode node : bucket) {
			
			if(node.key.equals(key))
				return node.value;
		}
		return 0;
	}
}
