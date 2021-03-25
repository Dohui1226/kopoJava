package kr.ac.kopo.day07;

import java.util.Scanner;

/**
 * 구구단과 관련된 여러가지 기능을 가지는 기능 클래스
 * @author da
 *
 */
public class Gugudan {
	Scanner sc = new Scanner(System.in); //클래스의 멤버변수 선언
										// 구구단에서 멤버변수를 볼수 있다.
										// Scanner 삭제가능

	void print(int dan) {
	System.out.println("****"+dan+"단 ****");
	for(int i =1; i<=9; i++) {
		System.out.println(dan+"*"+i+"="+dan*i);
		}
	}
	void print() {
		print(2,9);
		/*for(int dan=2; dan<=9;dan++) {
			System.out.println("****"+dan+"단 ****");
			for(int i=1; i<=9; i++) {
				System.out.println(dan+"*"+i+"="+(dan*i));
		*/
		  for(int dan=2; dan <=9; dan++) {
			  print(dan);
		  	}
			System.out.println();
	}
	/**
	 * 
	 * 시작단에서 조욜단까지 구구단출력
	 * @param sDan 시작단
	 * @param eDan 종료단
	 */
	void print(int sDan, int eDan) {
		for(int dan =sDan; dan<=eDan; dan++) {
			print(dan);	
		}
	}	
	int getDan(){
		int dan = sc.nextInt();
		sc.nextLine();
		return dan;
	}
	
	int getDan(String msg) {
		System.out.print(msg);
		int dan = sc.nextInt();
		sc.nextLine();
		return dan;
	}
}
