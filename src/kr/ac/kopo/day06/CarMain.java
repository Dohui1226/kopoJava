package kr.ac.kopo.day06;
//프로그래밍을 실행하기 위한 실행 클래스(메인 메소드를 가짐)
public class CarMain {

	public static void main(String[] args) {
		Car c=new Car(); //눈에 보이는 자동차 만들기
					// heap 영역에 자동차가 만들어짐, 
					//heap에 만들면 변수명이 없으니 
					//주소값을 알아야함 Car c입력
		c.name="소나타";
		c.price=3200;
		c.company="현대";
		
		Car c2=new Car();
		
		c2.name="K5";
		c2.price=3000;
		c2.company="기아";
		
		//c =c2; shallow copy를 하게 된다.  참조변수 일뿐, 따라서 둘다 c2를 가리키게됨.
		System.out.println("모델명:"+c.name+", 가격:"+c.price+"만원, 제조사:"+c.company);
		System.out.println("모델명:"+c2.name+", 가격:"+c2.price+"만원, 제조사:"+c2.company);

	}

}
