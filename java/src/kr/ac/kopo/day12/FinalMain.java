package kr.ac.kopo.day12;

import java.util.Random;

class Super{
	private int MAX =100;
	
	public void info() {
		System.out.println("super 클래스에서 정의된 메소드...");
		MAX = 50; //할당 불가
	}
	
}	

class Sub extends Super{
	@Override
	public void info() {
		System.out.println("Sub 클래스에서 재정의된 메소드...");
	}
	
}

class MyRandom extends Random{ //Random class는 임의의 class 가능
	/**
	 * bound가 10일때 1~10사이의 난수 추출
	 * @param bound 추출 난수 범위
	 * @return 1~bound 사이의 난수
	 * 
	 */
	@Override
	public int nextInt(int bound ) {
		return super.nextInt(bound)+1; 
	}
	
}

//class MyString extends String{ //String class는 고정된 문자열 final class, 상속 불가
	
//}



public class FinalMain {	
	
	public static void main(String[] args) {
		/*
		 * 1~100 사이의 난수를 발생시켜 출력하는 코드 작성
		 */
		Random r =new MyRandom();
		int random = r.nextInt(100);
		System.out.println("추출된 정수:" +random);
	}

}
