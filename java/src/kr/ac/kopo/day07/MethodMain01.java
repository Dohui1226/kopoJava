package kr.ac.kopo.day07;

/*
 * 		**********
 * 		hello
 * 		**********
 * 		Hi
 * 		**********
 * 		Good-bye
 * 		**********
 */

public class MethodMain01 {
	//반환형 메소드명([매개변수]) 매개변수는 생략가능, 반환형은 무조건 필요
	/**
	 * 임의의 문자를 반복하여 출력하는 기능
	 * @param a 출력할 문자
	 * @param num 출력 횟수
	 */
	//메소드 주석처리 방법
	static int printStar(char a ,int num){//피호출자 메소드 
							//void는 보통.. 많이쓰고 리턴값이없다라는 뜻

		for(int i=0; i<num; i++) {
			System.out.print(a);
		}
		System.out.println();
		return 10;
	}
	//문장의 집합을 만든것(정의)

	public static void main(String[] args) { //호출자메소드
		
		int data =printStar('*',10); // printStar 메소드를 실행하세요
		System.out.println("Hello");
		printStar('!',2);
		System.out.println("Hi");
		printStar('-',5);
		System.out.println("Good-bye");
		printStar('#',4);
	}

}
