package kr.ac.kopo.day12.inter01;

public class UserMain {

	public static void main(String[] args) {
		
		//맨처음 삼성 구매
		SamsungTV sam = new SamsungTV();
		sam.powerOn();
		sam.volumDown();
		sam.volumUp();
		sam.channelDown();
		sam.channelUp();
		sam.powerOff();
		
		// 엘지 구매
		LGTV lg =new LGTV();
		lg.turnOn();
		lg.soundDown();
		lg.soundUp();
		lg.channelDown();
		lg.channelUp();
		lg.turnOff();
		
		//삼성 리모컨으로 엘지티비를 조정-> 에러남
	}

}
