package com.core.collections;

import java.util.ArrayDeque;
import java.util.PriorityQueue;

public class QueueExample {

	public static void main(String[] args) {
		QueueExample qe=new QueueExample();
		qe.arrayQueue();
		qe.priorityQueue();

	}
	
	public void arrayQueue() {
		//can be used as a queue and stack
		ArrayDeque<Integer> arrayQueue=new ArrayDeque<Integer>();
		ArrayDeque<Integer> arrayQueueStack=new ArrayDeque<Integer>();
		try{arrayQueue.element(); }//to see first element throws exception if empty
	    catch(java.lang.Exception e) {System.out.println("queue is empty");}
		arrayQueue.add(10); arrayQueue.add(20);arrayQueue.add(30);
		System.out.println("element:"+arrayQueue.element());
		System.out.println("element:"+arrayQueue.peek());//to see first element only
		//but wont throw exception
		System.out.println("element:"+arrayQueue.poll());//return first element and deletes it
		System.out.println("element:"+arrayQueue.poll());
		
		arrayQueue.offerFirst(23);
		arrayQueue.forEach(x->System.out.println(" "+x));
		arrayQueue.offerLast(32);
		arrayQueue.forEach(x->System.out.println(" "+x));
		
		arrayQueueStack.push(10);
		arrayQueueStack.push(20);
		System.out.println(arrayQueueStack.pop());
		System.out.println(arrayQueueStack.pop());
		try {System.out.println(arrayQueueStack.pop());} //throws exception as no elements are present
	    catch (java.lang.Exception e) {System.out.println("empty stack");}
	}
	
	public void priorityQueue() {
		//highest priority items are deleted first, high priority for small items
		PriorityQueue<Integer> priorityQueue=new PriorityQueue<Integer>();
		priorityQueue.add(10);
		priorityQueue.add(1);
		priorityQueue.add(90);
		System.out.println("out is "+priorityQueue.poll());
		System.out.println("next out is "+priorityQueue.poll());
		//if you want to pass a comparator, you can do that also just create a class EmployeeComparator 
		//implementing Comparable interface and pass that new class to priority queue
	}
	    

}
