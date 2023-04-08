package com.core.collections;

import java.util.*;

public class MapExample {
	
	
	public static void main(String[] args) {
		MapExample mapExample=new MapExample();
		mapExample.hashMap();
		mapExample.treeMap();
		mapExample.linkedHashMap();
	}
	
	public void hashMap() {
		//key is unique, so if any of your object becomes key, have to override hashCode() and equals()
		HashMap<String, Integer> hashMap=new HashMap<String, Integer>();
		hashMap.put("id", 1);
		hashMap.put("name",2);
		hashMap.put("address", 3);
		
		for(String k:hashMap.keySet()) {
		   System.out.println(hashMap.get(k));
		}
		System.out.println("key present? id  "+hashMap.containsKey("id"));
		System.out.println("key present? empty  "+hashMap.containsKey("empty"));
		System.out.println("value present? 2  "+hashMap.containsValue(2));
	}
	
	
	public void treeMap() {
		//follows natural order of key
		//we can use comparators here also to change the order
		TreeMap<String, Integer> treeMap=new TreeMap<String, Integer>();
		treeMap.put("id", 1);
		treeMap.put("name",2);
		treeMap.put("address", 3);
		for(String k:treeMap.keySet()) {
			   System.out.println(treeMap.get(k));
			}
	}
	
	public void linkedHashMap() {
		
		LinkedHashMap<String, Integer> linkedHMcache=new LinkedHashMap<String, Integer>(2,.75f,false);
		//true means it will take access order, otherwise insertion order
		//for LRU cache make it true
		linkedHMcache.put("first", 10000);
		linkedHMcache.put("second", 5044);
		
		System.out.println("take from cache"+linkedHMcache.get("first"));
		linkedHMcache.put("third", 2344);
		linkedHMcache.put("fourth", 1111);
		System.out.println("take from cache"+linkedHMcache.getOrDefault("first", -1));
		
		for(String k:linkedHMcache.keySet()) {
			   System.out.println(linkedHMcache.get(k));
			}
		
		Map m = Collections.synchronizedMap(new LinkedHashMap()); //to make map synchronized
		
	}
	
	public void concurrentHashMap() {}

}
