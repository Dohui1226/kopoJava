package kr.ac.kopo.day06.homework06;

import java.util.Scanner;

public class HomeworkMain {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("아이스크림 몇개 구입할거야?: ");
		int a =sc.nextInt();
		
		Homework[] hw = new Homework[a];
		int sum=0;
		
		for (int i=0; i<a; i++) {
			hw[i]= new Homework();
			System.out.printf("****%d번째 아이스크림 구매정보 입력 ****\n",i+1);
			
			System.out.println("아이스크림 이름:");
			hw[i].icecream =sc.next();
			
			System.out.println("아이스크림 가격:");
			hw[i].price =sc.nextInt();
		}

		System.out.printf("<총 %d개의 아이스크림 구매정보 출력>\n",a);
		System.out.printf("번호\t아이스크림명\t아이스크림가격\n" );
		
		for (int i=0; i<a; i++) {
				sum=sum+hw[i].price;
				System.out.println(i+1+"\t" +hw[i].icecream+"\t\t" +hw[i].price );
				 
		}
		System.out.println("총계:"+sum);
	}
}

