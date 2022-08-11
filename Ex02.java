package khie;

// "두번째 java program입니다. 콘솔 화면에 출력하고 있습니다."
// 라는 문자열을 화면에 출력하는 방법

public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("두 번째 java program입니다. 콘솔 화면에 출력하고 있습니다.");
		// 첫번째 방법
		System.out.println(); // 공백 줄
		
		// 두번째 방법
		System.out.print("두 번째 java program입니다.");
		System.out.println(" 콘솔 화면에 출력하고 있습니다.");
		System.out.println();
		
		// 세번째 방법
		System.out.println("두 번째 java program입니다." + " 콘솔 화면에 출력하고 있습니다.");
		// 연결의 의미
		
	}

}
