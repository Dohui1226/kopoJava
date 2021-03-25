package kr.ac.kopo.day06.homework05;
/*
 * 짝수 : nums[0]~nums[evenNum-1]
 * 홀수 : nums[evenNum]~nums[num.length-1]
 */
import java.util.Scanner;

public class HomeworkMain2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc= new Scanner(System.in);
		System.out.println("짝수 몇개 입력: ");
		int evenNum =sc.nextInt();
		System.out.println("홀수 몇개 입력: ");
		int oddNum =sc.nextInt();
		
		int[] nums= new int[evenNum+oddNum];
			
		int evenIdx=0, oddIdx=nums.length-1;
		for(int i=0; i<nums.length; i++) {
			System.out.println("num"+ (i+1)+":");
			int num= sc.nextInt();
			
			if(num%2==0 && evenIdx<evenNum) {
				nums[evenIdx++]=num;
				
			}
			else if(num%2==1 &&oddIdx>=evenNum) {
				nums[oddIdx--]=num;
			}
			else {
				i--;
			}
		}
		System.out.println("<총"+nums.length +"개 정수 출력>");
		for(int num :nums) {
			System.out.print(num + " ");
		}	
		System.out.println();
	}
}

