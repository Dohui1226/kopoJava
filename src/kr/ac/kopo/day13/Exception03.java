package kr.ac.kopo.day13;

public class Exception03 {

	public static void main(String[] args) {
		
		System.out.println("main start...");
		for(int i=-2; i<3; i++) {
			System.out.println(i+"번째 반복문 수행중...");
			//System.out.println(10/1);//숫자 i를 10으로 나눈 몫이 알고 싶다. 
			//i가 0인 경우 문제 발생-> 소프트웨어 종료
			try {
				System.out.println(10/i);
			}
			catch(ArithmeticException ae) {
				System.out.println("예외발생");
				break;// 예외가 발생된 경우 for문 나감
			}
			finally {//break를 수행해도 finally는 무조건 수행한다.
				System.out.println("반복문 수행중...");
			}
		}
		System.out.println("main end...");
	}

}
