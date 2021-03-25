package kr.ac.kopo.day12.homework12;

import java.util.Scanner;

public class Dice implements Game {
	
		Dice(){
		System.out.println("주사위 값 맞추기 게임입니다.");
		System.out.println("주사위를 선택하세요.(1~6값을 선택)");
		Scanner sc = new Scanner(System.in);
		int you =sc.nextInt();
		}
	
		@Override
		public int startGame(int you) {
		int me =(int)(Math.random()*3+1);
		if(you==me) {
			System.out.println("You wim");
			return 1;
		}
		else if(you!=me) {
			System.out.println("You lose");
			
		}
		return 0;
	}
}
