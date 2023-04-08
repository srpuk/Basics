package com.core.collections;


import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExamples {
	
	public static void main(String[] args) {
		
		SetExamples setExamples=new SetExamples();
		setExamples.hashSet();
		setExamples.treeSet();
		setExamples.linkedHashSet();
		
	}

	public void hashSet() {
		
	Set<Integer>hashset=new HashSet<>();
	Set<EmployeePojo> empHashSet=new HashSet<EmployeePojo>(20,.5f);
	Set<EmployeePojo2> empHashSet2=new HashSet<EmployeePojo2>();
	hashset.add(10);
	hashset.add(10); //duplicate
	hashset.add(20);
	hashset.add(30);
	hashset.forEach(x->System.out.println(" "+x)); //check order- no order
	
	EmployeePojo emp=new EmployeePojo();
	emp.setId(1);emp.setName("Sreeroop");EmployeePojo emp1=new EmployeePojo();
	emp1.setId(1);emp1.setName("Sreeroop");empHashSet.add(emp1);empHashSet.add(emp);
	empHashSet.forEach(x->System.out.println("object is" +x)); //here duplicate is accepted
	//to remove duplicate we have to override equals and hashCode methods
	
	EmployeePojo2 emp2=new EmployeePojo2();
	emp2.setId(1);emp2.setName("Sreeroop");EmployeePojo2 emp3=new EmployeePojo2();
	emp3.setId(1);emp3.setName("Sreeroop");empHashSet2.add(emp2);empHashSet2.add(emp3);
	empHashSet2.forEach(x->System.out.println("object is" +x));//here duplicates are removed
	//because EmployeePojo2 override both hashCode and equals method
	}

	public void treeSet() {
		Set<Integer> treeSet1=new TreeSet<Integer>();
		treeSet1.add(20);treeSet1.add(90);treeSet1.add(5);
		treeSet1.forEach(x->System.out.println(" "+x)); //natural order will be kept
		
		Set<EmployeePojo2> empSet=new TreeSet<EmployeePojo2>();
		EmployeePojo2 emp2=new EmployeePojo2();
		emp2.setId(5);emp2.setName("Sreeroop");EmployeePojo2 emp3=new EmployeePojo2();
		emp3.setId(1);emp3.setName("Sreeroop");empSet.add(emp2);empSet.add(emp3);
		empSet.forEach(x->System.out.println("object is" +x)); //here set will order the object
		//automatically we are implementing comparable for class EmployeePojo2
	}
	
	public void linkedHashSet() {
		Set<Integer>linkedHashSet=new LinkedHashSet<>();
		linkedHashSet.add(10);
		linkedHashSet.add(90);
		linkedHashSet.add(5);
		linkedHashSet.add(9);
		linkedHashSet.remove(2);
		linkedHashSet.forEach(x->System.out.println(x)); //order in which elements are added
		//is preserved here
		
	}
	
}


