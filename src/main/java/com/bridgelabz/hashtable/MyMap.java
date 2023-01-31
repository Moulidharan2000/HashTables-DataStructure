package com.bridgelabz.hashtable;

import java.util.LinkedList;

public class MyMap {
	
	LinkedList<MyMapNode>[] data;

	public MyMap() {
		data = new LinkedList[26];
	}

	private int getIndex(String key) {
		return Math.abs(key.hashCode() % 26);
	}

	public void put(String key, int value) {
		int index = getIndex(key);
		if (data[index] == null) {
			data[index] = new LinkedList<>();
		}
		LinkedList<MyMapNode> bucket = data[index];
		for (MyMapNode node : bucket) {
			if (node.key.equals(key)) {
				node.value = value;
				return;
			}
		}

		bucket.addLast(new MyMapNode(key, value));
	}

	public int get(String key) {
		int index = getIndex(key);
		LinkedList<MyMapNode> bucket = data[index];
		if (bucket == null) {
	        	return 0;
		}
		for (MyMapNode node : bucket) {
			if (node.key.equals(key)) {
				return node.value;
			}
		}
		return 0;
	}
}
