package kr.ac.kpop.day04;
import java.util.Scanner;
/*
 *
 * 4개의 정수를 입력받아 가장 큰수를 출력
 * 4개의 정수를 입력하세요: 12 6 2 54
 * 가장 큰수:54
 */
public class HomeworkMain02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("4개의 정수를 입력하세요:");
		int a,b,c,d,one;
		 a = sc.nextInt();
		 b = sc.nextInt();
		 c = sc.nextInt();
		 d = sc.nextInt();
		 
			if(a>b && a>c && a>d) {
				one=a;		
			}
			else if(b>a && b>c && b>d){
				one=b;
			}
			else if (c>a && c>b &&c>d){
				one=c;		
			}
			else {
				one=d;
			}
			System.out.println("가장 큰수:"+one);
	}
}
