package com.core.general;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializeEg {
	

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		Employee6 emp6=new Employee6(1,"Sahara");
		
		FileOutputStream fout=new FileOutputStream("serialize.txt");
		ObjectOutputStream out=new ObjectOutputStream(fout);
		
		out.writeObject(emp6);
		out.flush();
		out.close();
		System.out.println("Success");
		
		
		FileInputStream fin=new FileInputStream("serialize.txt");
		ObjectInputStream in=new ObjectInputStream(fin);
		
		Employee6 emp7=(Employee6)in.readObject();
		System.out.println(emp7);
	}
	
	

}

class Employee6 implements Serializable{
	int id;
	String name;
	
	public Employee6() {}
	
	public Employee6(int id, String name) {
		super();
		this.id = id;
		this.name = name;
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
		return "Employee6 [id=" + id + ", name=" + name + "]";
	}
	
	
	
}
