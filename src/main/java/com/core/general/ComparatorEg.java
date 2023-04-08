package com.core.general;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ComparatorEg {
	
	public static void main(String[] args) {
		
		List<Employee2> empList=new ArrayList<>();
		empList.add(new Employee2(3,"Suman"));
		empList.add(new Employee2(32,"Preman"));
		empList.add(new Employee2(24,"Sreeroop"));
		empList.add(new Employee2(5,"Kumari"));
		
		Comparator<Employee2> com=new Comparator<Employee2>() {
//anonymous comparator
			//here the class dont require to implement comparable
			@Override
			public int compare(Employee2 o1, Employee2 o2) {
				if(o1.getId()>o2.getId()) {
					return 1;  //here this is used to represent one object and 'o' the next one
				}
				else if(o1.getId()<o2.getId()) {
					return -1;
				}
				else {
				return 0;
				}
			}
		};
		
		List<Employee2> emp=empList.stream().sorted(com).collect(Collectors.toList());
		System.out.println("From steam"+emp);
		
        Collections.sort(empList, com); //here comparator is passed to sort method
		
		for(Employee2 e:empList) {
			System.out.println(e);
		}
	}
	
	
}
	
	class Employee2{
		
		int id;
		String name;
		
		public Employee2() {}
		public Employee2(int id,String name) {
			this.id=id;
			this.name=name;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		
		@Override
		public String toString() {
			return "Employee [id=" + id + ", name=" + name + "]";
		}
		
}
