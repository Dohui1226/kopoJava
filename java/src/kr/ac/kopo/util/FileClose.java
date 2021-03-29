package kr.ac.kopo.util;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class FileClose { //객체 클로즈 목적. 외
	public static void close(InputStream is) {// 명시적 형변환 오버로딩 필요없음
		if(is !=null) {
			try {
				is.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void close(OutputStream os) {
		if(os!=null) {
			try{
				os.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void close(InputStream bis, InputStream is) {
		FileClose.close(bis);
		FileClose.close(is);
	
	}
	
	public static void close(OutputStream bos, OutputStream os) {
		FileClose.close(bos);
		FileClose.close(os);
	
	}
}
	