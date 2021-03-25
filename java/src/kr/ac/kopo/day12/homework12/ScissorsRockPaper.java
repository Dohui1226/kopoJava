package kr.ac.kopo.day12.homework12;

import java.util.Scanner;

public class ScissorsRockPaper implements Game {
	final static int SCISSOR=1;
	final static int ROCK=2;
	final static int PAPER=3;

	
	public ScissorsRockPaper() {
		System.out.println("가위바위보 게임입니다.");
		System.out.println("가위바위보중 하나를 선택하세요.(1.가위, 2.바위, 3.보)");
		Scanner sc = new Scanner(System.in);
		int you =sc.nextInt();
	}
	@Override
	public int startGame(int you) {
		
	int me =(int)(Math.random()*3+1);
	
	if (me==you) {
		System.out.println("비겼습니다.");
		return 0;
	}
	else if(me==1) {
		if(you==3) {
			System.out.println("You lose");
			return 0;
		}
		else
			System.out.println("You win");
			return 1;
	}else if(me==2) {
		if(you==1) { 
			System.out.println("You lose");
			return 0;
		}
		else
			System.out.println("You win");
			return 1;
	}else
		if(you==1) { 
			System.out.println("You win");
			return 1;
		}
		else
			System.out.println("You lose");
			return 0;
	}	
}
	
