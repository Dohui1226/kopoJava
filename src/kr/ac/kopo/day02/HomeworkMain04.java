package kr.ac.kopo.day02;

import java.util.Scanner;

/*
 두개의 정수를 입력받아 첫번째 정수가 두번째 정수의 배수인지를 판단하는 프로그램을 작성 
  (조건연산자, if문을 이용하여 작성)
    첫번째 정수 입력 : 12
    두번째 정수 입력 : 4

    12가 4의 배수인지 판단결과 : true   
    //12가 4의 배수인지 판단결과 : 참


    -------------------------  
    첫번째 정수 입력 : 12
    두번째 정수 입력 : 5

    12가 5의 배수인지 판단결과 :  false


    첫번째 정수 입력 : 12
    두번째 정수 입력 : 0

    12가 0의 배수인지 판단결과 :  false   
    */


public class HomeworkMain04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 정수를 입력하세요: ");
		int num1 =sc.nextInt();
		System.out.print("두번째 정수를 입력하세요: ");
		int num2 =sc.nextInt();
		System.out.println("<조건연산자>");
		System.out.println(num1 +"가 "+ num2+ " 의 배수인지 판단결과: "+(num2!=0 && num1%num2==0? true:false));
		System.out.println("<if문>");
		if (num2==0) {
			System.out.println(num1 +"가 "+ num2+" 의 배수인지 판단결과: False");
		}
		
			else if (num1%num2 ==0) {
			System.out.println(num1 +"가 "+ num2+" 의 배수인지 판단결과: True");
		}
			else {
			System.out.println(num1 +"가 "+ num2+" 의 배수인지 판단결과: False");
		}	
	}
}