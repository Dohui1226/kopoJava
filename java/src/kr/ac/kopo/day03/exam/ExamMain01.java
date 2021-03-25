package kr.ac.kopo.day03.exam;

/*
 	12345
 	23456
 	34567
 	45678
 	56789
 */

public class ExamMain01 {

	public static void main(String[] args) {
	
		for(int i=1; i<6; i=i+1) {
			for(int j=i; j<i+5; j=j+1) {
				System.out.print(j);
				}
			System.out.println();
		}
	}
}
