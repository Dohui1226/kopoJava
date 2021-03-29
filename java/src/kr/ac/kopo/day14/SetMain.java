package kr.ac.kopo.day14;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/*
 * Set: 순서(X), 중복(X)
 * 장점: 검색속도 빠름
 * 구현클래스 : HashSet, TreeSet
 * 
 */
public class SetMain {
	public static void main(String[] args) {
		

	//Set<String> set =new HashSet<>();
	Set<String> set =new TreeSet<>();//treeset은 문자열의 경우 사전순으로.
	
	boolean bool =set.add("one");
	System.out.println("\"one\" 데이터 삽입 여부 :"+ (bool ?"성공": "실패"));
	set.add("two");
	set.add("three");
	set.add("four");
	set.add("five");
	set.add("one");
	bool =set.add("one");
	System.out.println("\"one\" 데이터 삽입 여부 :"+ (bool ?"성공": "실패"));
	/*
	 * set의 전체 데이터 출력 방식
	 * 1. 1.5버전의 for문
	 * 2. iterator() 이용
	 * 3. toArray() 이용
	 */
	System.out.println("1.5버전의 for문 이용 출력");
	for(String str: set) {
		System.out.println(str); //순서없이 무작위로 출력
	}
	System.out.println("iterator() 이용 출력");
	Iterator<String> ite =set.iterator();
	while(ite.hasNext()) {
		System.out.println(ite.next());
	}
	
	System.out.println("toArray() 이용 출력");
	Object[] arr =set.toArray();
	System.out.println(Arrays.toString(arr));
	}
	
}
