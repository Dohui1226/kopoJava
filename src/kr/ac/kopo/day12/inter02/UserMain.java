package kr.ac.kopo.day12.inter02;



public class UserMain {

	public static void main(String[] args) {
		
		//TV협회의 표준(인터페이스 필요)
		TV tv = new SamsungTV();
		tv.powerOn();
		tv.channelUp();
		tv.channelDown();
		tv.soundDown();
		tv.mute();
		tv.mute();
		tv.mute();
		tv.soundUp();
		tv.mute();
		tv.powerOff();
	
		//예외처리
		default void copyright() {
			System.out.println("모든 기술은 TV협회에 귀속됩니다.");
			//원래는 추가 불가. 인터페이스는 추상 메소드만 가져야한다. 구조가 아예 바뀜
			//default를 통해 구현하면 안되는데 유지보수시 기능추가할때 구조가 바뀌는게 싫은데, 붙이면 가능, 접근제한자 아님
		
	

	}

}
