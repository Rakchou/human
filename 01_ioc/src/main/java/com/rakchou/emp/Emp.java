package com.rakchou.emp;

public abstract class Emp {
	public Emp getEmp(){
		System.out.println();
		return this;
	};
	
	public void work(){
		getEmp().work();
	};
}
