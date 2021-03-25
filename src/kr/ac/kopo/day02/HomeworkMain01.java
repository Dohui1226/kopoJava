package kr.ac.kopo.day02;

import java.util.Scanner;
/*
 * 2개의 정수를 입력받아 다음과 같이 출력하는 코드를 작성
 * 첫번째 정수 : 12
 * 두번째 정수 : 5
 * 12+5=17
 * 12-5=7
 * 12*5=60
 * 12/5=2.40 소수점 둘째짜리 출력
 * 12%5*=2
 */
public class HomeworkMain01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 정수를 입력하세요: ");
		int num1 =sc.nextInt();
		System.out.print("두번째 정수를 ㄷ입력하세요: ");
		int num2 =sc.nextInt();
		
		System.out.println(num1+" + "+num2+ " = " +(num1+num2));
		System.out.println(num1+" - "+num2+ " = "+ (num1-num2));
		System.out.println(num1+" * "+num2+ " = "+(num1*num2));
		System.out.printf(num1+" / "+num2+ " = %.2f \n",(float)num1/(float)num2);
		System.out.println(num1+" % "+num2+ " = "+(num1%num2));
	}

}


