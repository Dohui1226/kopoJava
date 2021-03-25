package kr.ac.kopo.day13.homework13;

import java.util.Scanner;

public class Month extends Choice {
	
	public void printmonth() {
		
		System.out.println("<<"+ super.getYear()+"년 "+super.getMonth()+"월 >>");
		System.out.println("일 월 화 수 목 금 토");
		
		int [] Arr =new int[100];
		
		for(int i=0; i<super.getmonthday(); i++) {
			for(int j=1; j<=2*i; j++) {
				Arr[2*j]=0;
			}
			for(int j=0; j<=2*i-1; j++) {
				Arr[j]=i;
			}
		}	
		for(int i=0; i<super.getmonthday(); i++) {
			System.out.println(Arr[i]);		
		
			}
		
	}
}
