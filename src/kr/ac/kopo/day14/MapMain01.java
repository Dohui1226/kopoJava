package kr.ac.kopo.day14;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class MapMain01 {

	/*
	 * Map: key, value의 쌍으로 구성된 데이터의 집합, 키에대한 중복 불가, 순서 없음
	 * HashMap, TreeMap
	 */
	
	// 웹 방문시 ID-> key, 비밀번호->value가 필요. 비밀번호 변경에 대한 프로그래밍
	
	public static void main(String[] args) {
		//Map<ID, FASSWORD>
		Map<String,String> map =new HashMap<>();
		map.put("aaa","1111");
		map.put("bbb","2222");
		map.put("ccc","3333");
		map.put("ddd","4444");
		
		Scanner sc= new Scanner(System.in);
		System.out.println("패스워드 변경 서비스 입니다.");
		System.out.println("ID를 입력하세요: ");
		String id =sc.nextLine();
		if(!map.containsKey(id)) { //id가 포함되어 있는지 확인
			System.out.println("입력하신 ID["+id+"]는 존재하지 않습니다.");
			System.out.println("서비스를 종료합니다.");
			System.exit(0);
		}
		System.out.println("현재 비밀번호를 입력하세요.");
		String password = sc.nextLine();
		
		if(!map.get(id).equals(password)){//문자열과 문자열 비교는 연산자가 아닌 equals를 사용해야 한다.
			System.out.println("패스워드가 다릅니다.");
			System.out.println("서비스를 종료합니다.");
			System.exit(0);
		}
		System.out.println("변경할 패스워드를 입력하세요:");
		String newPassword =sc.nextLine(); //set은 데이터가 있을때 중복된 데이터를 넣으면 false	반환
											//Map 동일한 데이터가 있으면 새로운 값으로 대체하고 기존 값을 반환한다.
		
		map.put(id, newPassword);
		System.out.println("패스워드가 변경되었습니다.");
		
		System.out.println("<< 전체 회원 정보 출력>>");
		Set<Map.Entry<String, String>> entryset = map.entrySet(); //import를 .Map추가하면 Set<Map.Entry<k,v>>에서 Map생략 가능
		
		for(Map.Entry<String, String> e: entryset) {
			System.out.println("ID:"+e.getKey()+", PASSWORD : "+e.getValue());
		}
		
		Set<String> keys = map.keySet();//key를 set에 모아서 반환 , key는 String형
		for(String key: keys) {
			System.out.println("ID: "+key+", PASSWORD :"+map.get(key));
		}
	}
}