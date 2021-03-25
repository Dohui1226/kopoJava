package kr.ac.kopo.day04;

import java.util.Arrays;

public class ArrayMain04 {

	public static void main(String[] args) {
	//	String[] strArr = {"폴리텍", "데이터분석", "자바"};
		//참조자료형 배열은 기본자료형 2차원 배열과 모양이 같다.
		String[] strArr= {new String("폴리텍"),new String("데이터분석"), new String("자바")};
	//	System.out.println("배열의 크기:"+strArr.length);
	//	System.out.println("첫번째 문자열:"+strArr[0]);
	//	System.out.println("첫번째 문자열:"+strArr[1]);
	//	System.out.println("첫번째 문자열:"+strArr[2]);
		
		System.out.println("배열의 크기:"+strArr.length);
		System.out.println("<방식1>");
		for(int i=0; i<strArr.length; i++) {
			System.out.println(i+1+"번째 문자열:"+strArr[i]);
		}
		System.out.println("<방식2>");
		for(String str: strArr) {
			System.out.println(str);
		}
		System.out.println("<방식3>");
		System.out.println(Arrays.toString(strArr));
	}
		
}
