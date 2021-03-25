package kr.ac.kopo.day13.homework13;

import java.util.Calendar;
import java.util.Scanner;

public class Choice {
	boolean check =true;
	Scanner sc= new Scanner(System.in);
	
	public int getNum() {
		System.out.println("선택하세요.(1. 특정년도 2.특정월 3.종료)");
		int num =sc.nextInt();
		this.move(num);
		return num;
	}
	
	public int getYear() {
		System.out.println("년도를 입력하세요: ");
		int year =sc.nextInt();
		return year;
	}
	
	public int getMonth() {
		Scanner sc =new Scanner(System.in);
		System.out.println("월을 입력하세요:");
		int month=sc.nextInt();
		return month;
	}
	
	public void move(int num) {
		while(check) {
			if(num==1) {
				Year y =new Year();
				
			}
			else if(num==2) {
				Month m = new Month();
				m.printmonth();
			}
			else if(num==3) {
				check=false;
			}
		}
	}
	public int getmonthday() { //총 며칠인지 구하기
		Calendar c = Calendar.getInstance();
		c.set(getYear(),getMonth()-1,1);
		int day = c.getActualMaximum(Calendar.DAY_OF_MONTH);
		return day;
	}
	public int getfirstday() { //달의 첫날이 무슨요일인지 구하기
		Calendar c = Calendar.getInstance();
		c.set(getYear(),getMonth()-1,1);
		int day= c.get(Calendar.DAY_OF_WEEK);
		return day;
	}
}
	
	

