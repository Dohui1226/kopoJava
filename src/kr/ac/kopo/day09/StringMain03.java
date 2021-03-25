package kr.ac.kopo.day09;

public class StringMain03 {

	public static void main(String[] args) {
		
		//String str ="hello";
		//String str2="hello";
		
		String str =new String("hello");
		String str2=new String("Hello");
		
		//위랑 결과가 다르다. 아래는 주소비교 -> 동등비교가 필요하다.
		
		if(str == str2) {
			System.out.println("str == str2");
		}else {
			System.out.println("str !=str2");
		}
		
		//문자열 비교
		boolean bool =str.equals(str2);//str에 있는 문자열과 str2 가 같나? 같으면 T, 다르면 F
										//대소문자도 같아야함
		boolean bool2 =str.equalsIgnoreCase(str2);//대소문자는구분없이 같은 문자열인지 확인함
		if(bool) {
			System.out.println("equals(): str == str2");
		}else {
			System.out.println("equals(): str!=str2");
		}
		if(bool2) {
			System.out.println("equalsIgnoreCase():str == str2");
		}else {
			System.out.println("equalsIgnoreCase():str!=str2");
		}
		
		str="hello !!!!!";
		str2="hello world";
		//시작문자열 비교
		
		String sub= "hello";
		bool =str.startsWith(sub);//시작문자열이 sub로 시작되나? 맞으면 t, 아니면 f
		if(bool) {
			System.out.println("["+str+"]은 ["+sub+"]문자열로 시작한다.");
		}else {
			System.out.println("["+str+"]은 ["+sub+"]문자열로 시작하지 않는다.");
		}
		
		//확장자 비교(끝 문자열 비교)
		str ="hello.txt";
		bool =str.endsWith(".txt");
		if(bool) {
			System.out.println("["+str+"]은 텍스트 파일입니다.");
		}else {
			System.out.println("["+str+"]은 텍스트 파일이 아닙니다.");
		}
		
		//순서 비교(사전순) ,길이와는 상관이 없다.
		str="boat";
		str2="board";
		
		int compare =str.compareTo(str2);// 리턴값은 정수 0: 같음, -1: 유니코드가 더 작음 비교보다 앞쪽
		if(compare==0) {
			System.out.println(str+"=="+str2);
		}else if(compare<0) {
			System.out.println(str+"<"+str2);
		}else {// compare>0
			System.out.println(str+">"+str2);
		}
		
		String[ ] names = {"강길동","홍길동","홍길순","김길동","윤길동","박철홍","홍길동"};
		
		System.out.println("이름이 홍길동인 사람 검색");
		for(int i=0; i<names.length; i++){
			if(names[i].equals("홍길동"))
				System.out.println(names[i]);
		}
		System.out.println("홍씨성을 가진 사람 검색");
		for(String name :names) {
			if(name.startsWith("홍")) {
				System.out.println(name);
			}
		}
		System.out.println("이름이 길동인 사람 검색");
		for(String name: names) {
			if(name.endsWith("길동")) {
				System.out.println(name);
			}
		}	
		System.out.println("홍이 포함된 사람 검색");
		for(String name: names) {//위치 상관 없이 포함된 문자열이 존재하는지
			if(name.contains("홍")) {
				System.out.println(name);
			}
		}
		
		str ="hello world";
		System.out.println("문자열:"+ str);
		
		int searchIdx = str.indexOf("o");//"o"가 몇번째 인덱스에서 시작하나?
										//"p"를 넣으면 str에 존재하지 않으므로 -1반환
		System.out.println("\"o\"lastIndex() 위치:"+searchIdx);
		
		searchIdx =str.indexOf("o",5);//5번째 시작부터
		System.out.println("\"o\" IndexOf(5)위치:"+searchIdx);
		
		searchIdx =str.lastIndexOf("o");
		System.out.println("\"o\" lastIndexOf()위치:"+searchIdx);
		
		str ="hello world";
		char ch ='l';
		System.out.println("<"+str+"에서 "+ch+"위치");
		searchIdx = str.indexOf(ch);
		while(searchIdx != -1) {
			System.out.println("검색된 위치:"+searchIdx);
			searchIdx = str.indexOf(ch, searchIdx+1);
		}
		//=================================================
		System.out.println("<"+str+"에서 "+ch+"위치");
		searchIdx=-1;
		while((searchIdx =str.indexOf(ch,searchIdx+1))!=-1) {
			System.out.println("검색된 위치:"+searchIdx);
			
		}
	}
		
}

