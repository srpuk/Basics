package com.core.collections;

public class EmployeePojo {
		
        private final int k=9;
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
		private int getFinal() {
			return k;
		}
		
	    @Override
	    public String toString() {
		return "EmployeePojo [id=" + id + ", name=" + name + "]";
	}

}
