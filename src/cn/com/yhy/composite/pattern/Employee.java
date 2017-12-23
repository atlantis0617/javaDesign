package cn.com.yhy.composite.pattern;

import java.util.ArrayList;
import java.util.List;

public class Employee {
	private String name;
	private String dept;
	private int salary;
	private List<Employee> subordinates;
	
	//构造函数：
	public Employee(String name,String dept,int salary){
		this.name = name;
		this.dept = dept;
		this.salary = salary;
		subordinates = new ArrayList<Employee>();
	}
	
	//添加员工的方法：
	public void add(Employee e){
		subordinates.add(e);
	}
	
	//移除员工的方法：
	public void remove(Employee e){
		subordinates.remove(e);
	}
	
	public List<Employee> getSubordinates(){
	    return subordinates;
	}
	
	public String toString(){
		return ("Employee :[ Name : "+ name 
			      +", dept : "+ dept + ", salary :"
			      + salary+" ]");
	}
}
