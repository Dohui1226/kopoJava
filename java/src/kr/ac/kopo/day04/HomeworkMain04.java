package kr.ac.kpop.day04;
import java.util.Scanner;

/*
 * 소수: 1과 자기자신 외에는 약수가 존재하지 않는 양의정수
 * 정수를 입력 :23
 * 23은 소수입니다.
 * 
 * 정수를 입력 :12
 * 12는 소수가 아닙니다.
 * 
 */
public class HomeworkMain04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력:");
		int a = sc.nextInt();
		
		if(a==1) {
			System.out.print(a+"는 소수가 아닙니다.");
		}	
		else {
			for(int i=2; i<a; i++){
				if (a % i ==0) {
					System.out.print(a+"는 소수가 아닙니다.");
					break;
				}
				else {
					System.out.print(a+"는 소수 입니다.");
					break;
				}
			}
		}
	}
}
