package general;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetEg {
	
	public static void main(String[] args) {
		
		int a=3;
		int b=1;
		int c=6;
		int d=3;
		Set<Integer> s1=new HashSet<>();
		
		s1.add(a);
		s1.add(c);
		s1.add(b);
		s1.add(d);
		s1.add(7);
		s1.add(0);
		
		for(int s:s1) {
			System.out.println(s);
		}
		
		
		Set<Integer> tree=new TreeSet<Integer>();
		tree.add(a);
		tree.add(c);
		tree.add(b);
		tree.add(d);
		tree.add(90);
		tree.add(89);
		
		for(int s:tree) {
			System.out.println(s);
		}
		
		Comparator<Employee4> comp=new Comparator<Employee4>() {

			@Override
			public int compare(Employee4 o1, Employee4 o2) {
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
		
		Set<Employee4> objTree=new TreeSet<Employee4>(comp);
		objTree.add(new Employee4(3,"Suman"));
		objTree.add(new Employee4(32,"Preman"));
		objTree.add(new Employee4(24,"Sreeroop"));
		objTree.add(new Employee4(5,"Kumari"));
		
		
		for(Employee4 e:objTree) {
			System.out.println(e);
		}
		
	}
	

	

}

class Employee4{
	
	int id;
	String name;
	
	public Employee4() {}
	public Employee4(int id,String name) {
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
