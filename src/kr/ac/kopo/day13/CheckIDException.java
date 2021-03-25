package kr.ac.kopo.day13;

public class CheckIDException extends Exception {//예외 클래스로 만들자


	public CheckIDException() {
		super();
		
	}

	public CheckIDException(String message) {
		super(message); //부모 호출
		
	} 

}
