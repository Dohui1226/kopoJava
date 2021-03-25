package kr.ac.kopo.day09.homework09;

import java.util.Scanner;

public class StringUtil { static Scanner sc = new Scanner(System.in);


public boolean isUpperChar(char c){//메소드 및 문자열 1번
	 boolean bool=false; 
  if(65<=c && c<=90) {
 	 bool= true;
  }
  return bool;
}

public boolean isLowerChar(char c){//메소드 및 문자열 2번
	  boolean bool=false; 
   if(c>90) {
 	  bool= true;
   }
   return bool;
}

public int max(int i, int j){//메소드 및 문자열 3번
   if(i>j) 
      return i;
   else 
      return j;
}

public int min(int i, int j){//메소드 및 문자열 4번
   if(i>j) 
      return j;
   else 
      return i;
}

public StringBuffer reverseString(String str){//5번
	   StringBuffer sb = new StringBuffer();
   for(int i=0 ;i<str.length(); i++) {
 		   sb.append(str.charAt(str.length()-i-1)); 
   		}
   return sb;
}

public String toUpperString(String str){//메소드 및 문자열 6번
	   String str2="";

	   for(int i =0; i < str.length(); i ++) {
			char c = str.charAt(i);
			if(c > 96) {
				 str2 = str2 + (char)(c-32);
			}
			else {
				str2 +=c;
				}
			}
	   		return str2;
}

public String toLowerString(String str){//메소드 및 문자열 7번
	   String str2="";
	   
	   for(int i =0; i < str.length(); i ++) {
			char c = str.charAt(i);
			if(65<=c && c<=90) {
				 str2 = str2 + (char)(c+32);
			}
			else {
				str2 +=c;
			}
		}
	   		return str2;
}

public static char getChar() {
   System.out.print("문자를 입력하세요(따옴표 없이): ");
   char c =  sc.nextLine().charAt(0);
   return c;
}

public int getInt( ) {
   System.out.print("숫자를 입력하세요: ");
   int i = sc.nextInt();
   sc.nextLine();
   return i;
}

public String getString() {
   System.out.print("문자열을 입력하세요: ");
   String str = sc.nextLine();
   return str;
   
}

void printUtil() {
System.out.println("메소드 및 문자열 7문제"); 	 
printline();
System.out.printf("해당 문자는 대문자이다 :"+this.isUpperChar(StringUtil.getChar()));
this.printline();
System.out.printf("해당 문자는 소문자이다 :"+this.isLowerChar(StringUtil.getChar()));
this.printline();
System.out.printf("큰수는 %d",this.max(getInt(),getInt()));
this.printline();
System.out.printf("작은수는 %d",this.min(getInt(),getInt()));
this.printline();
System.out.print("거꾸로 변경:"+this.reverseString(getString()));
this.printline();
System.out.print("대문자로 변경:"+this.toUpperString(getString()));
this.printline();
System.out.print("소문자로 변경:"+this.toLowerString(getString()));
this.printline();


}

void printline() {
	   System.out.println("\n========================================");
}

public static int checkChar(String strData, char ch) {
	   int cnt=0;
	   for(int i=0; i<strData.length(); i++) {
		   if(strData.charAt(i)==ch) {
			   cnt++;
		   }
	   }
	   return cnt;
}

public static StringBuffer removeChar(String oriStr, char delChar) {
	   StringBuffer sb = new StringBuffer();
	   for(int i=0; i< oriStr.length(); i++) {
		   if(delChar==oriStr.charAt(i)) {
			   continue;
		   }
		   else {
			   sb.append(oriStr.charAt(i));
			   
		   }
	   }
	   return sb;
}
	
}




