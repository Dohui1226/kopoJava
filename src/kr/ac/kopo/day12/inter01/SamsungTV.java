package kr.ac.kopo.day12.inter01;

public class SamsungTV {
	private boolean power;
	private int channelNo;
	private int volumeSize;
	
	public SamsungTV() {//TV구매
		power=false; //원래 전원이 꺼져있음.
		channelNo=3;//처음 지정 채널번호
		volumeSize=6; //처음 볼륨 크기
		System.out.println("SamsungTV를 구매하였습니다.");
	}
	public void powerOn() {
		System.out.println("전원을 켭니다.");
	}
	public void powerOff() {
		System.out.println("전원을 끕니다.");
	}
	public void channelDown() {
		System.out.println("채널을 내립니다.");
	}
	public void channelUp() {
		System.out.println("채널을 올립니다.");
	}
	
	public void volumUp() {
		System.out.println("볼륨을 올립니다.");
	}
	public void volumDown() {
		System.out.println("볼륨을 내립니다.");
	}
}	
