package kr.ac.kopo.day04.exam;
/*   -**** 
     --*** 
     ---**
     ----*
     ---**
     --***	
     -****
     *****

*/

/*
public class ExamMain01 {
	public static void main(String[] args) {
		
		int startCol=1;
		for(int i=1; i<=9; i++) {
			for(int j=1; j<=5; j++) {
				if(j<startCol) {
					System.out.print('-');
				} else {
					System.out.print('*');
				}
				
			}
			System.out.println();
			if(i<5) {
				startCol++;
			}else {
				startCol--;
			}
		}	
	}	
}
*/

/*
	
//for 5 + if1
public class ExamMain01 {
	public static void main(String[] args) {
		for (int i =1; i<=9; i++) {
			if(i<=5) {
				for(int j =1; j<=i-1;j++) {
					System.out.print('-');
				}
				for(int j =1; j<=6-i;j++) {
					System.out.print('*');
				}
			
			} else {
				for(int j = 1; j <= 9-i; j++) {
					System.out.print('-');
				}
				for(int j = 1; j <= i-4; j++) {
					System.out.print('*');
				}
		}
			System.out.println();
		}
	}
}
*/
 
/*
//for3 + if3
public class ExamMain01 {
	public static void main(String[] args) {
		for(int i=1; i<=9; i++) {
			if(i <=5) {
				for(int j=1; j<=5; j++) {
					if(j<i) {
						System.out.print('-');
					}else {
						System.out.print('*');
					}
				}		
			}
			else {
				for(int j=1; j<=5; j++) {
					System.out.print(j<10-i ? '-':'*');
				}
			}	
			System.out.println();
		}
	}
}
*/
		
/*		
 //for3 + if1
public class ExamMain01 {
	public static void main(String[] args) {
			int star =5;
			for(int i =1; i<=9; i++) {
				for(int j =1; j<=5-star ;j++) {
					System.out.print('-');
				}
				for(int j =1; j<=star; j++) {
					System.out.print('*');
				}
				System.out.println();
				if(i<5) {		
					star--;
				}
				else {		
					star++;
				}
			}
 		}		
}
*/
		
		