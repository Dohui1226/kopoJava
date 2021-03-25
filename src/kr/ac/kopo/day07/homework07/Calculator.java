package kr.ac.kopo.day07.homework07;

import java.util.Scanner;

public class Calculator {
	
	boolean check=false;
	Scanner sc = new Scanner(System.in);
	
	void operations (int num1, int num2) {
		System.out.printf("%d + %d = %d\n",num1,num2,(num1+num2));
		System.out.printf("%d - %d = %d\n",num1,num2,(num1-num2));
		System.out.printf("%d * %d = %d\n",num1,num2,(num1*num2));
		System.out.printf("%d / %d = %.1f\n",num1,num2,(num1/(float)num2));
		
		sosu(num1);
		sosu(num2);
	}
	
	void sosu(int a) {
		for(int i=2; i<a; i++){
				if(a%i==0) { 
					check =false;	
					break;
					}
				else {
				check =true;
				break;
				}
			}		
		
		System.out.println(a+" 소수인지: "+check);
	}	
	
	
	int getNum(String msg) {
		System.out.println(msg);
		int num =sc.nextInt();
		sc.nextLine();
		return num;
	}
	

}
