package kr.ac.kopo.day07.homework07;

public class CalculatorMain {

	public static void main(String[] args) {
		Calculator cal = new Calculator();
		 int num1=cal.getNum("정수:");
		 int num2=cal.getNum("정수:");
		 
		 cal.operations(num1, num2);
		
	

	}

}
