package kr.ac.kopo.day11.abs02;

import java.util.Scanner;

public class Menu {

	public int selectMenu(){
		Scanner sc = new Scanner(System.in);
		System.out.println("LV2프린터를 선택하세요(1.엘지, 2.삼성, 3.HP)");
		int no =sc.nextInt();
		sc.nextLine();
		 return no; //1번 또는 2번이 입력됨
	}
	public void choice() {
		int type =selectMenu();
		print(type);
		
	}
	public void print(int no) {
		Printer p = null; 
		
		switch(no) {
		case 1:
			p =new LGPrinter(); //자식의 인스턴스 주소값을 부모가 가질수 있다.
			break;
		case 2:
			p = new SamsungPrinter();
			break;
		case 3:
			//p = new HPInkjetPrinter(); //객체를 바꿔봄. 잉크젯으로 변화를 둔감하게 만들어보기
			p = new HPLaserPrinter();
			break;
		}
		if(p!= null)
			p.print();
		else{
			System.out.println("잘못 선택했습니다.");
		}
	}
}
