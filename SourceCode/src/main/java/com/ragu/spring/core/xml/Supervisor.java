package com.ragu.spring.core.xml;

public class Supervisor {

	int id;
	String name;
	String supervisor;
	double salary;
	
	public Supervisor() {
		
		super();
	}

	public Supervisor(int id, String name, String supervisor, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.supervisor = supervisor;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Supervisor [id=" + id + ", name=" + name + ", supervisor=" + supervisor + ", salary=" + salary + "]";
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
