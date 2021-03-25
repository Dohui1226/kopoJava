package kr.ac.kopo.day04;
import java.util.Arrays;
public class ArrayMain02 {

	public static void main(String[] args) {
		//1,2,3,4,5를 가지는 배열  arr를 생성
		//arr배열의 원소 출력
		/*
		int[] arr =new int[5];
		for(int i=0; i<arr.length; i++) {
			arr[i]=i+1;
		}*/
		/*
		int[] arr = new int[] {1,2,3,4,5}; //참조변수 선언과 동시 초기화에만 가능
		*/
		//int[] arr = {1,2,4,5} 언제나 가능
		int[] arr =new int[] {1,2,3,4,5};
		System.out.println(arr);
		arr=new int[] {10,20,30,40,50,60,70};
		System.out.println(arr);
		
		//arr 배열의 원소 출력
		/*
		 * 세가지 바법이 있다.
		 * 1. 인덱스를 이용한 출력
		 * 2. 1.5버전의 for문을 이용한 출력
		 * 3. java.util.Arrays.tostring() 메소드를 이용한 출력
		 * 
		 */
		
		System.out.println("<방식1>");
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]+" ");
		}
		System.out.println();
		
		System.out.println("<방식2>");
		for(int num: arr) {
			System.out.print(num+" ");
		}
		System.out.println();
		System.out.println("<방식3>");
		System.out.println(Arrays.toString(arr));
		
	}	
	

}
