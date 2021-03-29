package kr.ac.kpop.day04;
/*
 * 3개의 정수를 입력받아 큰수에서 작은 순으로 출력
 * 3개의 정를 입력하세요:12
 * 39 12 7
 */
import java.util.Scanner;
public class HomeworkMain01 {
	public static void main(String[] args) {
		int one, two, three, a,b,c;
		Scanner sc = new Scanner(System.in);
		System.out.println("3개의 정수를 입력하세요:");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();

		if(a>b && a>c && b>c) {
			one=a;			
			if (b>c) {
				two=b;
				three=c;
			}else {
				two=c;
				three=b;
				}
		}
		else if(b<a && b<c){
			one=b;
			if (a>c) {
				two=a;
				three=c;
			}
			else
				two=c;
				three=a;
		}else {
			one=c;
			if(b>a) {
				two=b;
				three=c;
			}else {
				two=c;
				three=b;
			}
		}System.out.println(one+" "+two+" "+three);
	}
}
