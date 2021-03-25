package kr.ac.kopo.day12;

import java.util.Random;

public class ExcepetionMain02 {//여러개의 catch, MultiCatch

	public static void main(String[] args) {//0~2사이의 난수 발생, 난수를 10으로 나눈 몫구하기
		System.out.println("main start...");
		Random r =new Random();
		int num = r.nextInt(3);
		System.out.println("num:"+num);
		
		String str="hello";
		
		try{
			System.out.println(10/num);//0일때 예외가 발생 JVM자체가 예외처리 기능을 가지고 있음
			System.out.println("첫번째 문자:"+str.charAt(0)); //null이므로 예외발생
			 
		}catch(Exception e) {//둘중 하나의 오류를 가질때 , e에 저장
			e.printStackTrace(); 
		
		}
		System.out.println("main end...");

	}

}
