package com.core.general;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableEg {
	
	
	
	public static void main(String[] args) {
		
		List<Employee> empList=new ArrayList<>();
		
		empList.add(new Employee(3,"Suman"));
		empList.add(new Employee(32,"Preman"));
		empList.add(new Employee(24,"Sreeroop"));
		empList.add(new Employee(5,"Kumari"));
		
		Collections.sort(empList); //here this one will work if Employee is implementing Comparåble
	//because sort doesn't know how to sort
	
		for(Employee e: empList)
	System.out.println(e);
	}
	

}

class Employee implements Comparable<Employee>{
	
	int id;
	String name;
	
	public Employee() {}
	public Employee(int id,String name) {
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
	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		if(this.getId()>o.getId()) {
			return 1;  //here this is used to represent one object and 'o' the next one
		}
		else if(this.getId()<o.getId()) {
			return -1;
		}
		else {
		return 0;
		}
	}
	
	
}
