package kr.ac.kopo.day15;
import java.io.FileInputStream;
/*
 *iodata/star1.jpg (입력) -> iodata/star2.jpg 복사 (출력)
 *작업순서 
 *1. stream open : 객체 만들기
 *2.read/write
 *3.stream close
 */
import java.io.FileOutputStream;
import java.io.IOException;

public class FileIOMain02 {

	public static void main(String[] args){
		
		//FileOutputStream fos = new FileOutputStream("aa.txt");//Package Explorer은 실시간이 아니다.
		FileInputStream fis = null; //선언
		FileOutputStream fos = null; //통로 연결 빈파일임
		
		try {
		//	1.stream open
			fis = new FileInputStream("doc/iodata/star1.jpg"); 
			fos = new FileOutputStream("doc/iodata/star2.jpg"); //통로 연결 빈파일임
			
			
		// 2. read/write	
			while(true) {
				int c =fis.read();
				if(c==-1)break;
				fos.write(c);
			}

			long end =System.currentTimeMillis();
			System.out.println("복사완료");
			System.out.println("소요시간:"+(end-start)/1000.+"초");
		//	while(true); //무한루프 수행 catch가 수행되면 star2빈파일만 생성 , 중단하는 순간 파일 제대로 완성됨. 파일을 다 보고나서 수정해야함.
		}catch(Exception e) {
			e.printStackTrace();
		}finally {//3. stream close -> final , 성공이든 실패던 닫아야함
			try {// checked exception
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}	
			try {
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
