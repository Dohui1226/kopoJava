package kr.ac.kopo.day09;

import java.util.Arrays;

public class StringMain04 {

	public static void main(String[] args) {
		String str ="hello world";
		System.out.println("str:"+str);
		String subStr =str.substring(1,5); //문자열 변환은 원본이 바뀌지 않느다.대입해줘야함
											//1~4까지 출력
											//end를 적지 않는다면 끝까지.
		System.out.println("substing(1,5): ["+subStr+"]");
		
		subStr =str.substring(6);
		System.out.println("substing(6): ["+subStr+"]");
		
		//문자열 결합
		
		String str1 ="hello";
		String str2 ="!!!";
		
	//  str= str1+str2;
		str =str1.concat(str2);
		System.out.println("str1 :"+str1);
		System.out.println("str2 :"+str2);
		System.out.println("concoat(str1, str2)결과 :"+str);
		
		//문자열 치환
		
		str ="hello world";
		System.out.println("replace()전:"+str);
		str =str.replace("ll","rrrrrrrrrrr");
		str =str.replace('e','a');
		System.out.println("replace()후:"+str);
		
		//문자열 공백 제거
		str ="          hello world          ";
		System.out.println("trim()전 ["+str+"]길이:"+str.length());
		str= str.trim(); //중간공백은 영향 x 좌우 공백만 영향이 있다.
		System.out.println("trim()후 ["+str+"]길이:"+str.length());
		
		
		//대문자로변환 소문자로 변환
		str ="hello world!!";
		System.out.println("str:"+str);
		System.out.println("toUpperCase():"+str.toUpperCase());
		System.out.println("toLowerCase():"+str.toLowerCase());
		
		//분할하기 (,로 출력)
		str ="홍길동전:허균:조선시대";
		String[] strArr = str.split(":");
		System.out.println(Arrays.toString(strArr));
		
		String ip ="192.168.5.203";
		String[] ipArr = ip.split("\\."); //.는 \\를 붙여아함
		System.out.println(Arrays.toString(ipArr));
		
		
		int num =123;
		//String strNum = num +"";
		String strNum =String.valueOf(num);
		System.out.println(strNum +100);
		System.out.println(String.valueOf(true) +false);// true는 문자열로 출력됨
														//원래 false는 불린형이라 +가 불가능하지만 
														//true가 문자열이라 +가능
	}

}
