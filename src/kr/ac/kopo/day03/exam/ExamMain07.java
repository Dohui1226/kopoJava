package kr.ac.kopo.day03.exam;

public class ExamMain07{

	public static void main(String[] args) {
		for(int i =1; i<10; i++) {
			if(i<5) {
				for(int j=1; j<=i-5; j++) {
					System.out.print(' ');
				}
				for(int j=i; j<=5-i; j++) {
					System.out.print('*');
				}
			}else if(i==5){
				for (int l=1; l<=7; l++) {
					System.out.print('*');
				}	
			}
			
			else{
				for(int j =1; j<=9-i; j++) {
					System.out.print(' ');
				}
				for(int j=1; j<=i-4; j++) {
					System.out.print('*');
				}
			}
			System.out.println();
		}

	}
}
