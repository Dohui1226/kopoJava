package kr.ac.kopo.day11;

public class CastMain01 {
	/*
	 * public static void print(Child01 c){//Main이 static이라서 c.info(); }
	 * 
	 * public static void print(Child02 c){ c.info(); }
	 */
	public static void print(Parent p){ //매개변수 자체가 묵시적 형변환 위에 두개 생략.
		p.info();
		if(p instanceof Child01) {
			Child01 c = (Child01)p;
			c.sleep();
			c.study();
		} else if(p instanceof Child02) {
			Child02 c = (Child02)p;
			c.sing();
			c.play();
		}
		
	}
	//info로 호출하며, child01,02는 parent와 상속관계
	public static void main(String[] args) {
		
		
		Child01 c01 =new Child01();
		print(c01);
		
		
		Child02 c02 =new Child02();
		print(c02);
		
		Parent p =new Parent();
		print(p);
		
		
		
		/*
		 * Parent p =new Child01(); //묵시적형변환 System.out.println(p.name+","+p.age);
		 * //부모,50 p.info();//Child01클래스에서 재정의된 메소드...
		 */
		
		/*
		 * Child01 c01 = new Child01(); //child01의 인스턴스를 만들고
		 * System.out.println(c01.name+","+c01.age); c01.info();
		 * 
		 * Parent p = new Parent(); System.out.println(p.name+","+p.age); p.info();
		 */
	}

}
