package kr.ac.kopo.day06.homework05;
// 소수를 알기 위해서는 판단 정수 앞의 소수로 나누어 떨어지는지 확인한다.
public class HomeworkMain3 {

	public static void main(String[] args) {
		
			int[] prime = new int[30];
			int loc = 0;
			
			for(int num = 2; num <= 100; num++) {
				boolean flag = true;
				for(int i = 0; i < loc; i++) {
					if(num % prime[i] == 0) {
						flag = false;
						break;
					}
				}
				if(flag) {
					prime[loc++] = num;
				}
			}
			
			for(int i = 0; i < loc; i++) {
				System.out.print(prime[i] + "\t");
				if((i+1) % 5 == 0)
					System.out.println();
			}
		
	}

}
