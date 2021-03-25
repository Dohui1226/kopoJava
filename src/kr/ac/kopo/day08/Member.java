package kr.ac.kopo.day08;

public class Member { //멤버변수
	String name;
	int age;
	String bloodType;
	
	Member() {
		this("알수없음");
	}
	
	Member(String name) {
		this(name, -1);
	}
	
	Member(String name, int age) {
		this(name, age, "알수없음");
	}
	
	Member(String name, int age, String bloodType) {
		this.name = name;
		this.age = age;
		this.bloodType = bloodType;
	}
	

	
	//생성자는 일반적으로 멤버변수와 메소드 사이에 정의한다.
	
	/*Member(){ //객체 초기화
		name="알수없음";
		age=-1;
		bloodType="알수없음";
		
	}
	Member(String name){
		this.name=name; //멤버변수에 넣는게 아니라 지역변수가 우선으로됨.
		//지역변수에 지역변수 대입하는식임. 구분이 필요하다.
		//-> 멤버변수에 this를 붙인다. this가 생략된 상태이므로
		this.age=-1;
		this.bloodType="알수없음";
		//이름만 초기화 함
	}
	Member(String name, int age){
		this.name=name;
		this.age=age;
		this.bloodType="알수없음";
	}
	
	Member(String name, int age, String bloodType){
		this.name=name;
		this.age=age;
		this.bloodType=bloodType;
	}
	
	*/
	void info() {
		System.out.println("이름 :"+name+", 나이 :"+age+", 혈액형 :"+bloodType);
	}
}
