package kr.ac.kopo.day13.homework13;

public class Year extends Choice {
	

	public void printyear() {
		for (int i=0; i<12; i++) {
			System.out.println("<<"+ super.getYear()+"년 "+i+1+"월 >>");
			System.out.println("일 월 화 수 목 금 토");
		}
	}
	
}


