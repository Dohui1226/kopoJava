package kr.ac.kopo.day11;

public class CastMain02 extends Parent{

	public static void main(String[] args) {
		//Child01 c =(Child01)new Parent(); // 대입연산자를 기준으로 좌변과 우변의 타입이 서로 다르다. 
							   //하지만 좌변의 범위가 더커서 문법에러(메모리 부족으로) 
								//-> 에러가 나타나지 않도록 명시적 형변환을 해보면? 타입을 맞췄더니 에러는 발생하지 않는다.
								//실행해보면 예외 문제 발생. 문법적 에러는 생기지만 메모리 문제가 발생. 우변이 좌변의 공간을 가져야한다.
		
		Parent p =new Child02();
		p.info();
		//p.study(); 불가
		
		Child02 c =(Child02)p;//
		c.info();
		c.sing(); //호출가능
		c.play(); //호출가능
		
	}

}
