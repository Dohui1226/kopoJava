package kr.ac.kopo.day04;

public class ArrayMain03 {

	public static void main(String[] args) {
		//int[][] arr;
		//스택에 있는 변수임. 출력 불가
		int[][] arr=new int[2][4];
		arr[0]= new int[5];
		arr[1]= new int[3];
		//int[][] arr=new int[2][]; 이걸로 출력하면 1. null로 됨 2. error
		System.out.println("arr:"+arr);
		System.out.println("arr.length:"+arr.length);
		
		for(int i =0; i<arr.length; i++) {
			System.out.println("arr["+i+"]:"+arr[i]);
			System.out.println("arr["+i+"].length:"+arr[i].length);
		}

	}

}
