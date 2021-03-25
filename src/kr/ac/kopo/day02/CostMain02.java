package kr.ac.kopo.day02;

public class CostMain02 {
	public static void main(String[] args) {
		char ch ='A';//char은 2byte이므로 16진수
		ch =65;
		ch='\u0041';//유니코드가 65인 문자를  ch변수에 저장
		
		System.out.println((int)ch);// ch가 가지고 있는 값을  정수로 형변환		                              	
		int code =ch;
		System.out.println(code);
		System.out.println("문자:"+ch);
		System.out.println(10+20);
		System.out.println(12.3+45);
		System.out.println(12.3+(double)45);
		System.out.println((int)12.3+45);
		System.out.println("" + 'A'+'B');//문자열로 출력하려고 한다면 문자열을 추가해야함
		
		double num =/*(double)*/12; // double에 int를 대입하려고함. 실수는 정수를 포함하기에 생략가능
		int nm2 = (int)12.34; //int에 double대입 double는 int보다 크므로 강제적 형변환이 필요하다.
	}
}
