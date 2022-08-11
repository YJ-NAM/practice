package khie;

import java.io.IOException;

public class Ex02 {

	public static void main(String[] args) {
	
		System.out.println("한 줄을 입력하세요.....");	// 한글 입력 시 바이트스트림이 아니라 문자스트림 방식 써야함 아니면 깨짐
			
		try {
			while(true) {
				int num = System.in.read(); //system.in -> 표준입력장치로 읽은 내용
				if(num == '\n') { 	// 엔터를 쳤느냐, 유니코드 값이 있음
					break;
				}
				System.out.print((char)num);
				}
		}catch (IOException e) {
				// TODO Auto-generated catch block
			e.printStackTrace();
			} 
				
		
	}

}
