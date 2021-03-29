package kr.ac.kopo.day16;

public interface Printer {

	public void print();
}


class LGPrinter implements Printer{
	
	 void print() {
		System.out.println("재정의");
	}
}
