package khie;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;

public class Ex04 {

	public static void main(String[] args) {
		
		try {
			Reader reader = new FileReader("C:\\NCS\\workspace(java)\\11_File_IO\\src\\khie\\Ex03.java");
			// Reader 추상클래스 때문에 객체 생성 불가능 filereader를 참조한다
			while(true) {
				int readByte = reader.read();
				if(readByte == -1) {
					break;
				}
				System.out.print((char)readByte);
			}
			reader.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
