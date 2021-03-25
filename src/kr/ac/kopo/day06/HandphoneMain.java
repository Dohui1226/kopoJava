package kr.ac.kopo.day06;

public class HandphoneMain {

	public static void main(String[] args) {
		//홍길동, 010-1111-2222, 삼성을 가지는 핸드폰 객체 hp 생성
	
		Handphone hp =new Handphone();
		hp.name="홍길동";
		hp.phone ="010-1111-2222";
		hp.company ="삼성";
		
		//윤길동, 010-3333-4444, 애플을 가지는 객체 hp2 생성
		Handphone hp2 =new Handphone(); //인스턴스 객체 생성
		hp2.name="윤길동";
		hp2.phone ="010-2222-3333";
		hp2.company ="애플";
		
		//한길동, 010-5555-6666, 엘지를 가지는 객체 hp3 생성
		Handphone hp3 =new Handphone(); 
		hp3.name="한길동";
		hp3.phone ="010-5555-6666";
		hp3.company ="엘지";
		
		
		System.out.println("소유주명:"+hp.name+", 전화번호:"+hp.phone+"만원, 제조사:"+hp.company);
		System.out.println("소유주명:"+hp2.name+", 전화번호:"+hp2.phone+"만원, 제조사:"+hp2.company);
		System.out.println("소유주명:"+hp3.name+", 전화번호:"+hp3.phone+"만원, 제조사:"+hp3.company);
		
		System.out.println("========================================================================");
		
		Handphone[] hpArr={hp, hp2, hp3}; // 핸드폰형 배열 만들기
		
		for(Handphone h:hpArr) {//타입: 배열
			System.out.println("소유주명:"+h.name+", 전화번호:"+h.phone+", 제조사:"+h.company);
		}
		
		for(int i =0; i<hpArr.length; i++) {
			System.out.println("소유주명:"+hpArr[i].name+", 전화번호:"+hpArr[i].phone+", 제조사:"+hpArr[i].company);
			
		}
	
	}

}
