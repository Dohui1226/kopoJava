package kr.ac.kopo.day13;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
/*
abstract class Calendar{
	static Calendar getInstance() {
		return new GregorianC();
	}
}
*/
public class DateMain {

	public static void main(String[] args) {
		
		Calendar c = Calendar.getInstance();
		/*System.out.println("c:"+c);
		
		int year =c.get(Calendar.YEAR);
		int month =c.get(Calendar.MONTH)+1; //0~11
		int date=c.get(Calendar.DATE);
		int day =c.get(Calendar.DAY_OF_WEEK);// 일(1)~토(7)
		String[] dayArr= {"", "일","월","화","수","목","금","토"};
		
		System.out.println("오늘은"+year+"년"+month+"월"+date+"일("+dayArr[day]+")");
		
		//2021sus 5월 5일 무슨요일 일까?
		c.set(2021,5-1,5); //MONTH는 0~11값이 나오므로 5-1을 해야함
		day = c.get(Calendar.DAY_OF_WEEK);
		System.out.println("2021년 5월 5일은"+dayArr[day]+"요일입니다.");
		
		//5월의 마지막 날이 몇일
		int lastday= c.getActualMaximum(Calendar.DAY_OF_MONTH);
		System.out.println("5월은"+lastday+"일로 구성되어 있습니다.");

		//2월의 마지막날이 몇일?
		c.set(c.MONTH,2-1);
		lastday= c.getActualMaximum(Calendar.DAY_OF_MONTH);
		System.out.println("5월은"+lastday+"일로 구성되어 있습니다.");
		*/
		
		//Calendar 객체를 date형태로 변경 -> getTime();
		Date d =c.getTime();
		
		String pattern ="yyyy년-MM월-dd일 HH시:mm분:ss초(E)";
		SimpleDateFormat sdf =new SimpleDateFormat(pattern);
		String data =sdf.format(new Date());// 데이터 포맷은 데이트형만 가능 (Calendar x)
											// 리턴타입 String
		System.out.println(data);
		
		data =sdf.format(d);
		System.out.println(data);
		
		
		/*
		 * 
		 
		//오늘은 2021년 3월 24일 입니다.
		Date d =new Date();
		System.out.println("d:"+d);
		
		int year =d.getYear() + 1900;//가로 줄은 Deprecated의 의미
									      //1900년 1월 1일 부터 시작
		int month = d.getMonth()+1;//0부터 시작
		int date = d.getDate()+1; 
		
		System.out.println("오늘은 "+year+"년 "+month+"월 "+date+"일 입니다.");
		*/

	} 

}
