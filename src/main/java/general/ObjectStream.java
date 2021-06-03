package general;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ObjectStream {

	
	public static void main(String[] args) {
		
		List<Employee3> empList=new ArrayList<>();
		empList.add(new Employee3(3,"Suman"));
		empList.add(new Employee3(32,"Preman"));
		empList.add(new Employee3(24,"Sreeroop"));
		empList.add(new Employee3(5,"Kumari"));
		
		
		
		List<Employee3> sorted=new ArrayList<>();
		List<Employee3> sorted2=new ArrayList<>();
		
		sorted=empList.stream().collect(Collectors.toList());
		
		Comparator<Employee3> comp=new Comparator<Employee3>() {

			@Override
			public int compare(Employee3 o1, Employee3 o2) {
				// TODO Auto-generated method stub
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
	 
		for(Employee3 emp: empList) {
			System.out.println(emp);
		}
		empList.stream().sorted(comp).forEach(System.out::println);
	
	
}
}


class Employee3{
	
	int id;
	String name;
	
	public Employee3() {}
	public Employee3(int id,String name) {
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
