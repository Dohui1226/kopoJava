package kr.ac.kopo.day09;

public class EmployeeMain {

	public static void main(String[] args) {
		
		
		
		
		Employee e= new Employee("홍길동", 3200, "사원");
		e.info();
		Employee e2 =new Employee("강길동", 4000, "주임");
		e2.info();
		Employee e3 =new Employee("윤길동", 3600, "사원");
		e3.info();
		
		System.out.println("첫번째 사원:" + e.getName());
		System.out.println("두번째 사원:" + e2.getName());
		
		//e.salary=3800; 접근 불가 private라서
		e.setSalary(3800);
		System.out.println("첫번째 사원의 연봉 변화:" + e.getSalary());
		
		/*
		e.printTotalEmployee(); //totalEmployee도 인스턴스 객체마다 한개씩만들어짐.. -> static로
		*/
	}

}
