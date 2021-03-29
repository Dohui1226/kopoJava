package kr.ac.kopo.day15;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class FileIOMain01 {

	public static void main (String[] args) throws Exception {// 입력받은 문자를 출력
		
		System.out.println("입력을 하세요. crl+z를 누르면 종료됩니다.");// ctrl+z 나올때까지 입력받는다.
	
		InputStream is = System.in; //외부장치에서 입력 -> 예외처리 
		InputStreamReader isr = new InputStreamReader(is);
		
		try {
			while(true) {
				int c=isr.read();//문자 스트림으로 읽어온다. 
				if(c==-1)break;
				System.out.print((char)c);
			}
		}catch(IOException e) {
			e.printStackTrace();
		}	
	}
}


