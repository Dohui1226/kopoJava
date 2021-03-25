package kr.ac.kopo.day14.homework;

import java.util.Scanner;

public class CalendarView {// 화면을 보여주기 위한 View class. 입력을 받을 때 보통 View를 사용
	private Scanner sc; 
	int year, month;
	
	public CalendarView() {
		sc =new Scanner(System.in);
	}
	
	private int getInt(String msg) {
		System.out.println(msg);
		int no =sc.nextInt();
		sc.nextLine();
		return no;
	}
	
	public void process() {
		
		CalendarUtil util =new CalendarUtil();
		loop: while(true) {
			int command =getInt("항목을 선택하세요.(1. 특정년도 2.특정월 3.종료) :");
			switch(command) {
				case 1:
					year =getInt("년도를 입력하세요:");
					util.showDayByYear(year); //연도를 넘겨줘야함.
					break;
				case 2:
					year =getInt("년도를 입력하세요:");
					month =getInt("월을 입력하세요:");
					util.showDayByMonth(year,month);
					break;
				case 3:
					System.out.println("프로그램을 종료합니다."); //system -> public static
					System.exit(0); //프로그램 종료 ,system클래스, public static
				//	break loop;
			}
		}
	}
}
