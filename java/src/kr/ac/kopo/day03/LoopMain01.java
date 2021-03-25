package kr.ac.kopo.day03;

public class LoopMain01 {

	public static void main(String[] args) {
				
//반복을 위한 기본요소 : 반복할 문장, 시작 값, 증가/감소, 종료조건
	System.out.println("-----------");	
	/* int cnt =1;
	while(cnt<=3){
		System.out.println("Hello World");
		++cnt;
	}	// 여기서 cnt변수는 while문안에 만들어진것이 아니기 때문에 Main 메소드 안에서 계속 존재.
	System.out.println("----------");
	*/	
	
	for (int cnt=1; cnt<=3; ++cnt) {
			System.out.println("Hello World");
	} //for문안에 만들어진 변수는 for 문이 사라지면 삭제 된다.
	}

}
