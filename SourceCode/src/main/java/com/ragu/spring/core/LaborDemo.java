package com.ragu.spring.core;

public class LaborDemo {

	public static void main(String[] args) {
		
		Labor l1 = new Labor(101, "holmes", "watson", 25000);
		
		Labor l2 = new Labor();
		l2.setId(102);
		l2.setName("tony");
		l2.setSupervisor("howard");
		l2.setSalary(200000);
		
		System.out.println(l1);
		System.out.println(l2);
		
		LaborCRUD l = new LaborCRUD();
		l.createLabor();
		l.getLabor();
	}

}
