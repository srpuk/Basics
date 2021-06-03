package general;

import java.util.HashMap;
import java.util.Map;

public class MapEg {
	
	
	
	public static void main(String[] args) {
		
		Map<Integer,Employee5> testMap=new HashMap<>();
		testMap.put(1, new Employee5(3,"Suman"));
		testMap.put(2, new Employee5(7,"Karun"));
		testMap.put(3, new Employee5(8,"Sehra"));
		testMap.put(5, new Employee5(45,"Kumaran"));	
		
		for(Map.Entry<Integer, Employee5> entry: testMap.entrySet()) {
			
			System.out.println(entry.getValue());
		}
		
		for(Integer key:testMap.keySet()) {
			System.out.println(testMap.get(key));
		}
	
		for(Employee5 emp:testMap.values()) {
			System.out.println(emp);
		}
		
		testMap.forEach((k,v)->System.out.println("Key :"+k+"Value :"+v));
	}
	
	


}


class Employee5{
	
	int id;
	String name;
	
	public Employee5() {}
	public Employee5(int id,String name) {
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

