package kr.ac.kopo.day10.second;

public class Manager extends Employee {
	Employee[] empList;

	public Manager(int no, String name, int salary, String grade, Employee[] empList) {
		super(no, name, salary, grade);
		this.empList = empList;
	}

	//public Manager(Employee[] empList) {
	//	super();
	//	this.empList = empList; //자기꺼만 뜸...
	//}
	

}
