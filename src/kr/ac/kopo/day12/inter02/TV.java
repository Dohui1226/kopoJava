package kr.ac.kopo.day12.inter02;

public interface TV { //접근제한자 무조건 public, 
					 //서로 같은 패키지라는 보장이 없어서
	/*public static final*/ int MAX_VOLUMN_SIZE=50; 
									//최대 음량 크기
									//변수는 메모리 공간 할당되어야하는데 인터페이스는 불가 
									//-> 상수변수
	int MIN_VOLUMN_SIZE=0;
	
	/*public abstract*/void powerOn();
	void powerOff();
	void channelUp();
	void channelDown();
	void soundUp();
	void soundDown();
	void mute();
	


	
}
