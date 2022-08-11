package khie;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

/*
 * 1. FileInputStream / FileOutputStream
 * 	  - 1바이트 단위로 파일을 처리하는 바이트 기반 입출력 파일 스트림
 * 	  - 그림(이미지), 오디오 파일, 비디오 파일 등 모든 종류의 파일 처리 가능
 * 
 * 2. FileReader / FileWriter
 *    - 2바이트 단위로 파일을 처리하는 문자 기반 입출력 파일 스트림
 *    - 문자 단위로 파일을 처리하기 때문에 그림, 오디오 파일들은 처리 불가능
 *    
 * 
 */

public class Ex06 {

	public static void main(String[] args) throws Exception {
		
		long start, end;
		
		// 1. 바이트 스트림만을 이용하여 데이터(이미지 파일) 읽어오기
		
		FileInputStream fis = new FileInputStream("C:/test/Koala.jpg");
		start = System.nanoTime();
		
		while(fis.read() != -1) {}
		
		end = System.nanoTime();
		
		System.out.println("바이트 스트림만을 이용한 경우 >>> "+(end-start)+"ns");
		System.out.println();
		
		fis.close();
		
		
		// 2. 바이트 스트림에 보조 스트림을 이용하여 데이터(이미지 파일) 읽어오기
		
		FileInputStream fis1 = new FileInputStream("C:/test/Koala.jpg");
		BufferedInputStream bis = new BufferedInputStream(fis1);
		
		start = System.nanoTime();
		
		while(bis.read() != -1) {}
		
		end = System.nanoTime();
		
		System.out.println("보조 스트림을 이용한 경우 >>> "+(end-start)+"ns");
		System.out.println();
		
		bis.close(); fis1.close();
		
	}

}
