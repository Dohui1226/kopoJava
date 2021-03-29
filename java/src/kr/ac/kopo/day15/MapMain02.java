package kr.ac.kopo.day15;

import java.util.HashMap;
import java.util.Map;

class Car{
	private String name;
	private String id;
	
	public Car(){
		
	}
	public Car(String name, String id) {
		super();
		this.name = name;
		this.id = id;
	}
}


class Member{
	
	private String name;
	private String phone;
	/*
	@Override
	public int hashCode() {
		return super.hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {//부모의 equals를 일단 호출
		
		boolean result = false;
		
		//name.equals(obj.name); 에러발생, 묵시적형변환(object는 object형을 가리킴/ name은 member형의 객체)
		//명시적 형변환 필요
		Member mem =(Member)obj;
		if (name.equals(mem.name) && phone.equals(mem.phone)) { //이름과 폰번호가 같을때 같은사람
			result =true;}
		
		return result; 
	}
	*/

	
	public Member(String name, String phone) {
		super();
		this.name = name;
		this.phone = phone;
	}
	
}

/*
class MemberInfo{
	private member;
	private car;
	
}


										// 리턴 2개를 할 때, 하나의 클래스를 더만든다. 멤버와 car타입을 대입한다.??
public Map<String, Object> returnTest2(){ //리턴2개를 할 때, object를 이용하거나 Map을 이용한다.
	Member n =new Member();
	Car c =new Car();
	
	Map<Stromg.Object>
}
 public MemberInfo rerunTest3() {
	 Member m = new Member();
	 Car c =new Car();
	 MemberInfo info =new MemberInfo(m,c);
	 return info;
	 
 }
*/

@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((phone == null) ? 0 : phone.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Member other = (Member) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (phone == null) {
			if (other.phone != null)
				return false;
		} else if (!phone.equals(other.phone))
			return false;
		return true;
	}



public class MapMain02 {

	public static void main(String[] args) {
		
		Map<Member, Car> carList= new HashMap<Member, Car>();
		carList.put(new Member("홍길동", "010-1111-2222"), new Car("소나타", "12소1212"));
		carList.put(new Member("윤길동", "010-3333-4444"), new Car("모닝", "12소1212"));
		carList.put(new Member("박길동", "010-5555-6666"), new Car("그랜저", "12소1212"));
		carList.put(new Member("김길동", "010-7777-8888"), new Car("카니발", "12소1212"));
		
		System.out.println("등록대수:"+carList.size());//4
		carList.put(new Member("홍길동", "010-8888-9999"), new Car("SM3", "25다3434"));
		System.out.println("등록대수:"+carList.size());//5
		
		carList.put(new Member("홍길동", "010-1111-2222"), new Car("제네시스", "42소1212"));// 홍길동이 차를 바꿈
		System.out.println("등록대수:"+carList.size()); //6 중복된 키라고 해석을 하지 않고, 하나 더 생김.
														// 비교연산자는 주소값 비교가됨.. 
														//	map은 내부적으로 equals 메소드를 사용하여 같은 키의 값인지 비교한다.
														// 객체는 주소값이 아닌 멤버변수가 중요하다.(객체들은 equals 메소드를 사용)
														
		/*
		Member m = new Member("홍길동", "010-1111-2222");
		Member m2 = new Member("홍길동", "010-1111-2222");
		
		if(m.equals(m2)) {
			System.out.println("같은 사람입니다.");
		}else {
			System.out.println("다른 사람입니다."); //출력: 주소값을 비교
			
		
		}
		*/
	}
}

