package kr.ac.kopo.day02;

import java.util.Scanner;

/*
 * 1~3 사이의 정수 입력 : 1
 * one
 * 
 * 1~3사이의 정수 입력 : 3
 * three
 * 
 * 1~3 사이의 정수 입력 : 6
 * Error
 */


public class SwitchMain01 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1~3 사이의 정수: ");
		int num =sc.nextInt();
		
		switch(num) {
		case 1:
			System.out.print("ONE");
			break;
		case 2:
			System.out.print("TWO");
			break;
		case 3:
			System.out.print("THREE");
			break;
		default : // default는 다 수행되고 수행, 2~3 사이에 위치해도 마지막에 수행
			System.out.print("Error");
			break;
		}
		// alt + 방향키 : 문장 줄 옮기기
		// ctrl + alt + 방향키 : 복사해서 문장줄 옮기기
		
		
		/*
		if(num==1) {
			System.out.println("One");
		} else if(num==2) {
			System.out.println("TWO);
		}else if(num==3) {
			System.out.println("THREE");
		}else {
				System.out.println("Error");
*/
	}

}
