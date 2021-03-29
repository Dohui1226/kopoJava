package kr.ac.kopo.day14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/*
 *  List : 순서(O), 중복(O)
 *  구현클래스 : ArrayList,LinkedList
 *  
 *  주요메소드
 *  -add() : 데이터 입력
 *  -get() : 해당 인덱스에 있는 데이터 추출
 *  -remove() :  데이터 삭제
 *  -size() : 리스트의 전체 데이터 개수
 *  -clear() : 리스트이 전체 데이터 삭제
 *  -isEmpty() : 리스트가 비어있는지 체크 (T/F)
 *  -contains() : 특정 데이터의 존재여부 판단 (T/F)
 *  -iterator() : Iterator 객체를 반환
 */

public class ListMain {
	public static void main(String[] args) {

		// ArrayList list = new ArrayList();// 1.5버전 이전
		// list = new LinkedList();

		// List <String> list =new ArrayList<String>();// 1.5버전의 Generic 사용

		List<String> list = new ArrayList<>(); // 1.7버전 이후의 Generic 방식

		// list.add(10); //에러 String만 입력할 수 있다.

		System.out.println("리스트의 원소 총개수:" + list.size()); // 0
		list.add("one");
		list.add("two");
		list.add("three");
		list.add("four");
		list.add("five");
		System.out.println("add후 리스트의 원소 총개수:" + list.size());// 5
		list.add("one");
		System.out.println("add(one)후 리스트의 원소 총개수:" + list.size());// 6

		/*
		 * list의 전체데이터 출력 1.index를 이용한 get()메소드 이용 2.1.5버전의 for문 이용 3. toArray이용하여 배열로
		 * 출력 3. toArray이용하여 배열로 출력 -> -next(): 다음 데이터 추출, -hasnext(): 추출한 다음 데이터 존재여부
		 */

		System.out.println("get()메소드를 이용한 출력");
		for (int i = 0; i < list.size(); i++) { // 입력된 순서 그대로 출력된다. 중요!!!!! 차.곡.차.곡
			System.out.println(list.get(i));
		}

		System.out.println("1.5버전의 for문 이용한 출력");
		for (String str : list) {
			System.out.println(str);
		}

		System.out.println("toarray() 이용한 출력");
		Object[] arr = list.toArray(); // 고정된 길이로 배열 출력
		System.out.println(Arrays.toString(arr));

		System.out.println("iterator() 메소드 이용 출력"); // 순환자. 맨처음부터 끝까지 접근
		Iterator<String> ite = list.iterator();
		while (ite.hasNext()) {
			System.out.println(ite.next());
		}
		String searchStr = "two";
		if (list.contains(searchStr)) {
			System.out.println(searchStr + "은 존재합니다.");
		} else {
			System.out.println(searchStr + "은 존재하지 않습니다.");
		}

		boolean bool = list.remove("two");
		// 문자열이 없는경우 remove를 하면 false가 나온다.
		System.out.println("remove:" + bool);

		if (list.contains(searchStr)) {
			System.out.println(searchStr + "은 존재합니다.");
		} else {
			System.out.println(searchStr + "은 존재하지 않습니다.");
		}

		bool = list.remove("two");
		System.out.println("remove:" + bool);
		System.out.println("첫번째 문자열:" + list.get(0));
		String removeStr = list.remove(0);
		System.out.println("삭제된 문자열 문자열:" + removeStr);
		System.out.println("remove(0)후 첫뻔째 문자열)" + list.get(0));

		System.out.println("원소 총 개수" + list.size());
		// list.clear();
		// System.out.println("clear()후 원소 총개수"+list.size());

		List<String> sub = new LinkedList<>();
		sub.add("봄");
		sub.add("여름");

		list.addAll(sub);
		System.out.println("addAll() 후 원소의 개수 :" + list.size());

	}
}
