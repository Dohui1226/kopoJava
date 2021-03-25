package kr.ac.kopo.day14;

import java.util.Random;

class A{
	private Object obj;
	
	public A(Object obj) {
		this.obj =obj;
	}

	public Object getObj() {
		return obj;
	}

	public void setObj(Object obj) {
		this.obj = obj;
	}
	public void info() {
		System.out.println("obj:"+obj); //obj.toStinrg() 출력 
	}
	
}

class B<T>{ //Generic <> 표시, 안에는 타입표시 , 타입으로 만들어라.
	private T obj;
	
	public B(T obj) {
		this.obj =obj;
	}

	public T getObj() {
		return obj;
	}

	public void setObj(T obj) {
		this.obj = obj;
	}
	public void info() {
		System.out.println("obj:"+obj); 
	}
	
}

public class GenericMain {

	public static void main(String[] args) {
		B<String> b01 =new B<String>(new String("Hello"));
		B<Random> b02 = new B<Random>(new Random());
		
		b01.info();
		b02.info();
		
		b01.getObj(); //String 
		b02.getObj(); //Random 
		
		System.out.println("길이 :"+ b01.getObj().length());
		System.out.println("난수 :"+ b02.getObj().nextInt());
		
		
		//b01 =new B<Random>(new Random()); //컴파일 시점 에러
											// 모든 타입을 받을 수 있으나, 한번 지정하고 다르게 입력하면 에러남
		
		
		
		/*
		A a01 =new A(new String("hello"));
		A a02 =new A(new Random());
		
		a01.info();
		a02.info();
		
		//System.out.println("길이 :"+ a01.getObj().length()); //getObj를 통해 private Obj 접근
														    //오류 발생 ,getObj() object형
															// 주황색을 원하는데, 빨간색으로 접근함
		System.out.println("길이 :"+ (((String) a01.getObj()).length()));	
		//System.out.println("난수 :"+ a02.getObj().nextInt()); //random은 String 불가
		System.out.println("난수 :"+ ((Random) a02.getObj()).nextInt());	
		
		//형변환 잘못시키면 오류난다. -> Generic
		*/
	}
}
