package kr.ac.kopo.day13;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ExceptionMain04 {

	public static void main(String[] args) {
		try {
			FileReader fr = new FileReader("a.txt"); 
				//파일 읽어오기 객체 생성시 , 파일이 없을 수도 있으니 예외처리 강제
				//컴파일 시점 예외처리(checked exception)
				//java.lang 처럼 따로 import한적 없는 exception은 대부분 일반적으로 컴파일시점
				//내부가 아닌 외부장치를 제어할때 대부분 컴파일시점
		}
		catch(FileNotFoundException fnfe) {
			try {
				FileWriter fw = new FileWriter("error.log");
				//file에 기록하기, 컴파일 시점 예외처리
			}catch(IOException ie) {
				ie.printStackTrace();
			}
		}
	}
}
