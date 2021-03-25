package kr.ac.kopo.day06;

public class HanmdphoneMain02 {

	public static void main(String[] args) {
		//Handphone[] hpArr =new Handphone[3];// 회색그림
										//핸드폰의 인스턴스 객체는 만들지 않았다.
										// 인스턴스 객체를 만들기 위해서는 꼭 괄호()가 들어가야함
										//new Handphone(); 
		
			//new Handphone();// 이게 없으면 출력은 null로 나올 것임
			Handphone[] hpArr = new Handphone[]{new Handphone(), new Handphone(), new Handphone()};
			
			
			hpArr[0].name="홍길동";
			hpArr[0].phone="010-1111-2222";
			hpArr[0].company="삼성";
			
			hpArr[1].name="윤길동";
			hpArr[1].phone="010-3333-4444";
			hpArr[1].company="애플";
			
			hpArr[2].name="한길동";
			hpArr[2].phone="010-5555-6666";
			hpArr[2].company="엘지";
			
			for(Handphone hp :hpArr) {
				System.out.println("소유주명:"+hp.name+", 전화번호:"+hp.phone+", 제조사:"+hp.company);
			}
			
			//for(int i =0; i<hpArr.length; i++) {
			//System.out.println(hpArr[i].name); //이것도 출력하면  null값이 나온다. 초록색그림
		}
			
	}
