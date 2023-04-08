package com.core.collections;

import java.util.LinkedHashMap;

public class LRUCache<K,V> extends LinkedHashMap<K,V>{
	
	int capacity;
	
	public LRUCache(int capacity) {
		super(capacity+1,.75f,true); 
		this.capacity=capacity;
	}
	
	@Override
	protected boolean removeEldestEntry(java.util.Map.Entry<K, V> eldest) {
		// TODO Auto-generated method stub
		return (size()>capacity);
	} //this method overriding is the important thing
	
	public V find(K key) {
		return super.get(key);
	}
	public void set(K key,V value) {
		super.put(key, value);
	}

	
	public static void main(String[] args) {
		LRUCache<String, String> lruCache=new LRUCache<String, String>(2);
		lruCache.set("benz", "germany");
		lruCache.set("fiat", "america");
		
		//now the game begins
		lruCache.set("honda","japan");
		//here benz will be removed as size() is greater than capacity and last accessed is fiat
	
		System.out.println(lruCache.find("benz"));
		System.out.println(lruCache.find("fiat"));
		System.out.println(lruCache.find("honda"));
	}
}
