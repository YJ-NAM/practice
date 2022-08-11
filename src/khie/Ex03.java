package khie;

import java.io.IOException;
import java.io.InputStreamReader;

/*
 * java 스트림의 종류
 * 1. 바이트 스트림 관련 클래스
 *    - 바이트 스트림 방식으로 데이터를 입출력하는 클래스
 *      ==> xxxInputStream / xxxOutputStream
 * 2. 문자 스트림 관련 클래스
 *    - 문자 스트림 방식으로 데이터를 입출력하는 클래스
 *      ==> xxxReader / xxxWriter
 * 
 * 3. 바이트 스트림 -> 문자 스트림 변환 관련 클래스
 * 	  ==> InputStreamReader / OutputStreamWriter
 */

public class Ex03 {

	public static void main(String[] args) {
		System.out.println("입력 후 끝 이라고 입력하세요.");
		
		InputStreamReader isr = new InputStreamReader(System.in); // system.in 표준입력장치인 키보드로 입력 받으세요.
		
		try {
			while(true) {
				int readByte = isr.read();
				if(readByte == '끝') {
					break;
				}
				System.out.print((char)readByte);
			}
			// 
			isr.close(); // finally 아닌 여기에 추가하기도 함(코드 길어지니까)
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
//		finally {
//			// 입출력 스트림은 종료(close)시켜주는 것이 좋다!
//			try {
//				isr.close();
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//			
//		}
	}

}
