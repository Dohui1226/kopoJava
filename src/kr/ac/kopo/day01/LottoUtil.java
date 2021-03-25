// 선언부

package kr.ac.kopo.day01;
import java.util.Random;


/**  - 문서 주석문
 * 
 * 로또와 관련된 기능을 제공하는 기능클래스
 * @author 홍길동
 *
 */


//

// 참조클래스 : 단독 실행 x 
public class LottoUtil {

	// 내용부 (멤버변수)
	 private int lottoNum;
	 
	 /**
	  * 오늘의 로또확률을 출력해주는 메소드
	  */
	
	// 메소드 
	public void todayLotto() {
		
		Random r = new Random() ;
		System.out.println("오늘의 로또 확률 : " + r.nextInt(101) + "%입니다");
	}
	
	/**
	 * 1 - 45 사이의 로또 번호를 알려주는 메소드
	 * @return 추출된 로또번호
	 */
	
	public int getNum() {
		Random r = new Random() ;
		return r.nextInt(45) + 1; 			// 1 ~ 45 사이의 로또번호 추출
				}

}

//선언부 