package kr.ac.kpop.day04;
/*
 * 2~100사이의 소수를 출력
 * 2 3 5 7 11 13 17 ... 97
 * -----------------------
 * 2 3 5 7 11 
 * 13 17 ...
 * 
 * 
 */

public class HomeworkMain05 {

	public static void main(String[] args) {	
		System.out.println("2~100사이의 소수를 출력:");
		for(int i=2; i<=97; i++) {
			for(int j=1; j<i; j++) {
				if (i/i==1 && i%j==0) {
					System.out.println(i);
					break;
				}else {
					break;
				}
			}
		}
	}
}
