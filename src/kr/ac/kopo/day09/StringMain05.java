package kr.ac.kopo.day09;

public class StringMain05 {

	public static void main(String[] args) {
		
		long start = System.currentTimeMillis();
		String str ="";
		for(int i=0; i<100000; i++) {
			str+=1;
		}
		long end = System.currentTimeMillis();
		System.out.println("소요시간:" +(end-start)/1000.0+"초"); //묵시적 형변환 쓰려고 1000.0 으로 함 
																//double로 하고 싶어서

		start =System.currentTimeMillis();
		StringBuffer sb= new StringBuffer();//생성자 꼭 쓰기
		for(int i=0; i<100000; i++) {
			sb.append(i);
		}
		end = System.currentTimeMillis();
		System.out.println("소요시간:" +(end-start)/1000.0+"초");
		
		
	}

}
