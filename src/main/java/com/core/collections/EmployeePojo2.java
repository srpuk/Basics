package com.core.collections;

public class EmployeePojo2 implements Comparable<EmployeePojo2>{
	int id;
	String name;
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
	public boolean equals(Object obj) {
		if(obj.hashCode()!=this.hashCode()) {
			return false;
		}
		return true;
		
	}
	@Override
	public int hashCode() {
		return id;
	
	}
	
    @Override
    public String toString() {
	return "EmployeePojo2 [id=" + id + ", name=" + name + "]";
}
    @Override
	public int compareTo(EmployeePojo2 o) {
		// TODO Auto-generated method stub
		if (this.id>o.id) {return 1;}
		else if(this.id<o.id){return -1;}
		return 0;
	}

}
