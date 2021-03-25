package kr.ac.kopo.day07;

import java.util.Scanner;

public class GugudanMain {

	public static void main(String[] args) {
		
		//Scanner sc =new Scanner(System.in);
		
		Gugudan gu =new Gugudan();
		
		int dan=gu.getDan("2-9 사이의 정수 입력:");
		//System.out.print("2-9 사이의 정수 입력:");
		//int dan =gu.getDan();
		/*
		int dan =sc.nextInt();
		sc.nextLine();
		*/
		gu.print(dan);
		gu.print(); //전체 단 모두 출력
		
		int startDan=gu.getDan("시작단 입력:");
		int endDan=gu.getDan("종료단 입력:");
		//System.out.print("시작단을 입력:");
		//int startDan =gu.getDan();
		
		
		//System.out.print("종료단을 입력");
		//int endDan =gu.getDan();
		gu.print(startDan, endDan);
	}

}
