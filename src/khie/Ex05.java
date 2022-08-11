package khie;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 보조 스트림 관련 클래스
 * - 보조 스트림 : 다른 스트림과 연결되어 여러가지 편리한 기능을 제공해주는 스트림을 일컬음
 * - 보조 스트림은 중간에 메모리 버퍼(buffer)와 작업함으로써 실행 성능을 향상시킬 수 있음 
 * 	 예를 든다면 프로그램은 직접 하드디스크에 데이터를 보내지 않고 메모리 버퍼에 데이터를 보냄으로써 쓰기 속도가 향상됨
 *   버퍼는 데이터가 쌓이기만을 기다렸다가 버퍼가 꽉 차게 되면 데이터를 한꺼번에 하드디스크로 보내줌으로써 출력 횟수를 줄여줌
 * - 스트림의 기능(속도)을 향상시키는 클래스
 * - Bufferedxxx : 버퍼를 제공해주는 보조 스트림 클래스
 * - 버퍼(buffer) : CPU와 IO 간의 속도 차이 보완
 */

public class Ex05 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		InputStreamReader isr = new InputStreamReader(System.in);
		
		BufferedReader br = new BufferedReader(isr);
		// 끝이 Reader이면 buffered 클래스도 reader로 끝나야함 , inputstream이면 bufferedinputstream
		
		System.out.println("한 줄 문자열을 입력하세요....");
		
		// readLine() : 보조스트림에서 제공하는 한 줄을 입력받는 메서드
		String str = br.readLine();
		System.out.println("입력 받은 문자열 >>> "+str);
		
		br.close(); isr.close(); // 역순으로 닫아줘야함
		 

	}

}
