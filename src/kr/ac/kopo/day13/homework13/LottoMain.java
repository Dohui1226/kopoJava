package kr.ac.kopo.day13.homework13;

import java.util.Scanner;

public class LottoMain { //Exception 사용하기

	public static void register() throws CheckIDException {
		Scanner sc= new Scanner(System.in);
		System.out.println("좋아하는 로또 번호를 입력하세요.: ");
		int num= sc.nextInt();
		
		if(num>45) {
			throw new CheckIDException("1 - 45사이만 가능합니다."+num+"은 올바르지 않습니다.");
		}
		else
			System.out.printf("%d를 포함하여 추출하겠습니다.",num);
	}
	public static void main(String[] args) {
		
		try {
			register();
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
}
