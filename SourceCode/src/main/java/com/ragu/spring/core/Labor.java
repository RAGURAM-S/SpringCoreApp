package com.ragu.spring.core;

public class Labor {

	int id;
	String name;
	String supervisor;
	double salary;
	
	public Labor() {
		
		super();
	}

	public Labor(int id, String name, String supervisor, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.supervisor = supervisor;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Labor [id=" + id + ", name=" + name + ", supervisor=" + supervisor + ", salary=" + salary + "]";
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

	public String getSupervisor() {
		return supervisor;
	}

	public void setSupervisor(String supervisor) {
		this.supervisor = supervisor;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

}
