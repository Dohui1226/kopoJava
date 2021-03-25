package kr.ac.kopo.day09.homework09;

public class StringUtilMain {

	public static void main(String[] args) {
		StringUtil util =new StringUtil();
	    util.printUtil();
	    
	    System.out.println("문자열 2문제");
	    System.out.println("\n========================================");
		System.out.print(StringUtil.checkChar("Hello World Java", StringUtil.getChar())+"리턴");
		 System.out.println("\n========================================");
		System.out.println(StringUtil.removeChar("Hello World Java", StringUtil.getChar())+"리턴");


	}

}
