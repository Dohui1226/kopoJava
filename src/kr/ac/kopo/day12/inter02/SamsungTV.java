package kr.ac.kopo.day12.inter02;

public class SamsungTV implements TV {
	//TV라는 인터페이스를 상속받아야함
	//TV에 6개 메소드 중에 선택 사용할 수도 있음. 
	//Source ->Override implements
	
	private String modelName;
	private boolean power;
	private int volumeSize;
	private int channelNo;
	private boolean muteToggle; 
	private int currentVolumeSize;
	
	
	public SamsungTV() {
		System.out.println("삼성TV 구매 완료");
		modelName="삼성TV";
		power=false;
		volumeSize=10;
		channelNo=3;
		muteToggle=false; //뮤트상태가 아님
	}
	
	//생성자 만들기 
	//Source-> Constructor
	
	@Override
	public void powerOn() {
		power =true;
		System.out.println("전원을 키다.");
		info();
	}

	@Override
	public void powerOff() {
		power=false;
		System.out.println("전원을 끄다.");
		
	}

	@Override
	public void channelUp() {
		System.out.println("채널을 올리다.");
		channelNo=++channelNo%101;
		info();
		
	}

	@Override
	public void channelDown() {
		System.out.println("채널을 내리다.");
		channelNo--;
		if(channelNo==0)
			channelNo=100;
		info();
	}

	@Override
	public void soundUp() {
		System.out.println("채널을 올리다.");
		if(muteToggle)
			volumeSize=currentVolumeSize; //뮤트상태에서 누르면 볼륨 올라감
			muteToggle=false;
			
		if(volumeSize<TV.MAX_VOLUMN_SIZE)
			volumeSize++;
		info();
	}

	@Override
	public void soundDown() {
		System.out.println("볼륨을 내리다.");
		if(volumeSize>TV.MIN_VOLUMN_SIZE)
			volumeSize--;
		info();
	}

	@Override
	public void mute() {
	//volumeSize=TV.MIN_VOLUMN_SIZE;
		if(muteToggle) {
			System.out.println("음소거해제");
			
			volumeSize=currentVolumeSize;
		}else {
			System.out.println("음소거 중");
			currentVolumeSize=volumeSize;
			volumeSize=TV.MIN_VOLUMN_SIZE;
		}
		muteToggle=!muteToggle;
		info();
	}
	
	public void info() {
		System.out.println("채널번호:"+channelNo+", 음량크기:"+volumeSize);
	}//외부에서 실행할 일이 없고, 내부적으로만 실행된다면 굳이 public을 할 필요없음.
	 // 접근제한자는 일반적으로 public을 쓰지만,
	
	

}
