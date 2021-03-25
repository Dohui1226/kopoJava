package kr.ac.kopo.day04.exam;
/*
		----*
		---***
		--*****
		-*******
		*********
		-*******
		--*****
		---***
		----*
		
*/


public class ExamMain02 {
	public static void main(String[] args) {
		int	 n=1;
		for (int i =1; i<=9; i++) {
			for(int j=1; j<=5-n; j++) {
				System.out.print('-');
			}
			for(int j=1; j<=2*n-1; j++) {
				System.out.print('*');
			}

			System.out.println();
			//space +=1<5 ?-1:1;
			if(i<5) {
				n++;
			}else {
				n--;
			}
		}	
	}
}
