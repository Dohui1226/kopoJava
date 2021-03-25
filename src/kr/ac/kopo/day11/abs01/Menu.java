package kr.ac.kopo.day11.abs01;

import java.util.Scanner;

public class Menu {

	public int selectMenu(){
		Scanner sc = new Scanner(System.in);
		System.out.println("LV1 프린터를 선택하세요(1.엘지, 2.삼성)");
		int no =sc.nextInt();
		sc.nextLine();
		 return no; //1번 또는 2번이 입력됨
	}
	public void choice() {
		int type =selectMenu();
		print(type);
		
	}
	public void print(int no) {
		switch(no) {
		case 1:
			LGPrinter lg =new LGPrinter();
			lg.print();
			
			break;
		case 2:
			SamsungPrinter sam = new SamsungPrinter();
			sam.print();
			break;
		}
	}
}
