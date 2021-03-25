package kr.ac.kopo.day02;

import java.util.Scanner;

/*
 * 좋아하는 게절을 입력 : spring
 * 봄은 3월~5월까지 입니다.
 **/


public class SwitchMain02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("좋아하는 계절을 입력 : ");
		String season = sc.nextLine(); //문자열이라서
		/*		
		System.out.println(season); //참조자료에 있는 것들은 동등비교만 된다. 객체참조형은 불가
		if(season == "spring") {
			System.out.println("봄은 3월~ 5월까지 입니다.");
		} else if(season == "summer") {
			System.out.println("여름은 6월~ 8월까지 입니다.");
		}
		*/
		
		switch(season) {
		case "spring" :
			System.out.println("봄은 3월~ 5월까지 입니다.");
			break;
		case "summer" :
			System.out.println("여름은 6월~ 8월까지 입니다.");
			break;
		default:
			System.out.println("error")	;
			}
		}
			
	

}
