package com.core.collections;

import java.util.*;

public class ListExamples {
	
	
	public static void main(String []args) {
		ListExamples listExamples=new ListExamples();
		//listExamples.ArralistEg();
		listExamples.LinkedListEg();

		}
		
	
	public void ArralistEg() {
		List<String> nameList=new ArrayList<>();
		nameList.add("Sreeroop");
		nameList.add("Shiv");
		nameList.add("UK");
		nameList.forEach(x-> System.out.print(x));
		
		for(String s:nameList) {
			System.out.print(s);
	}
		
		List<Integer> intList=new ArrayList<Integer>(20); //here 20 is the size
		System.out.println("size is "+intList.size());
		
		List<Integer> intList2=new ArrayList<>(Arrays.asList(10,11,12)); //initializing
		intList2.forEach(x->System.out.println(x));
		
		//iterator
		Iterator<Integer> itr=intList2.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
}
	
	public void LinkedListEg() {
		
		LinkedList<Integer> linkedlist=new LinkedList<>();
		linkedlist.add(10);
		linkedlist.add(0, 20);
		linkedlist.remove(1);
		linkedlist.add(40);
		linkedlist.forEach(x->System.out.print(" "+x));
		linkedlist.addFirst(10);
		System.out.println("");
		linkedlist.forEach(x->System.out.print(" "+x));
		linkedlist.addLast(80);    //use these methods to use this as a queue
		int out=linkedlist.removeFirst();  //its because linked list implements deque
		System.out.println("output is "+out); 
		linkedlist.forEach(x->System.out.print(" "+x));
		
		
	}
}
