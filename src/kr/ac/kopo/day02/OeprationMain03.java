package kr.ac.kopo.day02;

import java.util.Scanner; //자동 import : ctrl +shift + o(알파벳)

/*
 * 정수를 입력하세요 : 5 
 * 5의 짝수유무 : false
 * 단, 0이나 음수인 경우 false를 출력
 */

public class OeprationMain03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		// "정수를 입력하세요:" 문장을 출력
		System.out.println("정수를 입력하세요 : ");
		//키보드로 정수를 입력
		int num = sc.nextInt();
		//결과 출력
		boolean result = (num >0 && num%2 == 0);
		System.out.println(num+"의 짝수 유무: "+ result);
		
	}

}
