package kr.ac.kopo.day12.homework12;

import java.util.Scanner;

public class Menu {
	boolean check = true;
	
	void gameMenu() {
		while(check) {
			System.out.println("게임을 선택하세요");
			System.out.println("A:가위바위보");
			System.out.println("B:주사위 값 맞추기");
			System.out.println("C:종료");
		
			Scanner sc = new Scanner(System.in);
			char c = sc.nextLine().charAt(0);
		
			if(c=='A') {
				
			
			}
			else if(c=='B') {
				
			}
			else if(c=='C'){
				System.out.println("게임을 종료합니다.");	
				check =false;
//				System.out.printf("당신의 게임 전적은 %d승 %d패 %d무 입니다.",victory,lose,draw);}	
			}
			else
				System.out.println("다시 입력하세요.");
				
		}
	}
}
