package kr.ac.kopo.day07;

/*
 * 메소드 오버로딩 : 같은 클래스내에 도명의 메소드이면서 
 * 매개변수의 개수 또는 타입이 다른 것
 */
public class Method {

	void call() {
		System.out.println("call() 메소드 호출...");
	}
	
	void call(int i) {
		System.out.println("call(int) 메소드 호출..."); //서로 다른 메소드로 인식
	}
	
	//int call(int i){
	//System.out.println("call(int) 메소드 호출...");
	//} 위의 식과 리턴값만 다른데 , 위의 식과 같은 것임 그래서 에러남. 중복으로
	void call(double d) {
		System.out.println("call(double) 메소드 호출...");
	}
	void call(String s) {
		System.out.println("call(string) 메소드 호출...");
		}
	/*void call(char c) {//묵시적 형변환 에러 안뜸.
		System.out.println("call(char) 메소드 호출...");
		}
	*/
	void call(String s, boolean b) {
		System.out.println("call(String, boolean) 메소드 호출...");
		
	}
	void call(boolean b, String s) {
		System.out.println("call(boolean, String) 메소드 호출...");
		
	
	}
}
