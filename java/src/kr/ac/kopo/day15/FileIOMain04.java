package kr.ac.kopo.day15;

import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import kr.ac.kopo.util.FileClose;

public class FileIOMain04 {
	
	
	public static void write() {
		
		char c='A';
		int i =10;
		double d=12.34;
		//파일에 저장하고 싶음
		FileOutputStream fos =null;
		DataOutputStream dos =null; // 바이트를 조합해서 정수나 실수로 만든다.
		
		try {
			fos = new FileOutputStream("doc/iodata/test.dat");
			dos =new DataOutputStream(fos);
			
			
			dos.writeChar(c); //문자 /2
			dos.writeInt(i); //정수/2+4
			dos.writeDouble(d);//8+6
			
			System.out.println("쓰기완료");
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			FileClose.close(fos);
			FileClose.close(dos);
		}
		
	}

	
	public static void read() {
		FileInputStream fis = null; //저장할때 문자, 정수 , 실수형으로 저장해놨기 때문에
		DataInputStream dis =null; //변수 선언
		
		try {
			fis =new FileInputStream("doc/iodata/test.dat");
			dis =new DataInputStream(fis);
			
			//문자, 정수, 실수 순서로 읽어야한다.
			
			char c= dis.readChar(); //2바이트를 읽어서 문자로 조합한다. ,, 순서대로 입출력 조심.
			int i =dis.readInt();
			double d = dis.readDouble();
			
			System.out.println("읽어온 데이터 출력"); //순서대로 출력해야함.
			System.out.println("문자 :"+c);
			System.out.println("정수 :"+c);
			System.out.println("실수 :"+c);
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			FileClose.close(dis,fis);
		}
		
	}
	public static void main(String[] args) { 
		read();
		
		}

	}


