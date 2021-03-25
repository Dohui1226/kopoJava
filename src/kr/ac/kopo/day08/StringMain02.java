package kr.ac.kopo.day08;

import java.util.Scanner;

public class StringMain02 {

	public static void main(String[] args) {
		
		//char[] chars= {'H', 'e', 'l','l','o',' ','w','o','r','l','d'};
		//String s =new String(chars);
		String str ="Hello World";
		char[] chars =new char[str.length()];
		//for(int i=0; i<str.length(); i++) {
		//	chars[i]=str.charAt(i);
		//}
		//str.getChars(0, 0, chars, 0);
		
		str.getChars(3, 9, chars, 0);
		System.out.println("["+str+"]의 길이:"+str.length());
		System.out.println("0번째에 위치한 문자:"+str.charAt(0));
		System.out.println("7번째에 위치한 문자:"+str.charAt(7));
		
		Scanner sc =new Scanner(System.in);
		System.out.println("문자를 입력:");
		char c =sc.nextLine().charAt(0);
		//String input =sc.nextLine(); //"A"
		//char c = input.charAt(0);
		
	}

}
