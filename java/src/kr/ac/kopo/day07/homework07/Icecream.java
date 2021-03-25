package kr.ac.kopo.day07.homework07;
import java.util.Scanner;

public class Icecream {
	Scanner sc = new Scanner(System.in);
	


	 String name;
	 int price;
	 
	 Icecream[] Icecreaminfo(int num) {
		 Icecream[] arr = new Icecream[num];
			
			for(int i =0; i<num; i++) {
				arr[i] = new Icecream();
				
				System.out.printf("****%d번째 아이스크림 구매정보 입력 ****\n",i+1);
				arr[i].name = geticeName("아이스크림 이름:");
				arr[i].price = getprice("아이스크림 가격:");
			}
			printice(arr,num);  
			return arr;
	}		
	 
	 int getNum() {// 아이스크림 갯수 입력받기
		System.out.println("아이스크림 몇개 구입?:");
		int num =sc.nextInt();
		sc.nextLine();
		return num;
	}		
		 
	 int getprice(String msg) {//아이스크림 가격 입력받기
		System.out.print(msg);
		int price =sc.nextInt();
		sc.nextLine();
		return price;
	 }
		
		 
	String geticeName(String msg) {// 아이스크림 이름 입력받기
		System.out.print(msg);
		String name = sc.nextLine();
		return name;
	}
		 
		
		
	void printice(Icecream[] arr, int num) {
		System.out.printf("<총 %d개의 아이스크림 구매정보 출력>\n",num);
		System.out.printf("번호\t아이스크림명\t아이스크림가격\n" );
		for (int i=0; i<num; i++) {
			System.out.println(i+1+"\t" +arr[i].name+"\t\t"+arr[i].price);
		}
	}
}