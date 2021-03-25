package kr.ac.kopo.day02;

public class IFMain01 {

	public static void main(String[] args) {
	
		int a =10, b=5;
		/*
		 *
		 *a가 b보다 크다면 a출력
		 *a가 b보다 작다면 b출력
		 *a와 b가 같다면 0 출력
		 */
		
		System.out.println(a>b? a: (a<b?b:0));
		if (a>b) {
			System.out.println(a);
		}else { //a <=b
			if(a<b) {
				System.out.println(b);
			}else {// a==0
				System.out.println(0);
			}
		}
		
		if(a>=b) {
			if(a==b) {
				System.out.println(0);
			}else {
				System.out.println(a);
			}
		}else{
			System.out.println(b);
		}
		
		/*
		System.out.println("가장 큰 수는 : " +(a>b?a:b));
		
		if(a>b)
		{
			System.out.println("가장 큰 수는: "+a);
		}else {
			System.out.println("가장 큰 수는: "+b);}
		*/
		
	}

}
