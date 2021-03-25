package kr.ac.kopo.day13;

import java.io.FileReader;

abstract class Parent{
	public abstract void print();
	public abstract void scan() throws Exception;// 추상클래스의 메소드를 만들때 throws를 사용한다. 컴파일시점 예외처리
													//안전 장치.
}

class Child extends Parent{

	@Override
	public void print() {
	
		
	}

	@Override
	public void scan() throws Exception {
		
		
	}
	
}

public class ExceptionMain05 {

	//public static void main(String[] args) throws Exception{ //main은  jvm실행, jvm은 자체 예외 처리가 있음. -> b(); try-catch 안하고 넘겨도됨 
	public static void main(String[] args) {
		
		Child obj =new Child();
		obj.print();
		try {
			obj.scan();
		}catch(Exception e) {
			
		}
		//a();
			
		try {
			b();
		}catch(Exception e) {
			System.out.println("main() 예외처리");
			e.printStackTrace();
		}
		
			
	}
	//public static void b() throws ArithmeticException, NullPointerException {//ArithmeticException ,NullPointerException 두개 넘김
	public static void b() throws Exception {// 모든 예외 넘김
		System.out.println("b() 메소드 호출...");
		String str= null;
		System.out.println(str.charAt(0)); 
		System.out.println(1/0);
	}
	
	
	public static void a() {
		System.out.println("a() 메소드 호출...");
		
		try {
			FileReader fr =new FileReader("a.txt");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
