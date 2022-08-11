package khie;

public class Ex06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		System.out.printf(); ==> format
//		형식(양식)에 맞춰 출력하는 메서드
		
		System.out.printf("%d+%d=%d\n", 10, 20, 10+20); //d->decimal의 약자(C언어에서 파생)
		
		System.out.printf("%o\n", 10);
		
		System.out.printf("%x\n", 10);
		// 0~9, 10(a), 11(b)~ 15(f) 출력
		
		System.out.printf("%s\n", "문자열 출력");
		
		System.out.printf("%f\n", 3.2582);
		
		System.out.printf("%.2f\n", 3.2582);
		// 소숫점 2자리까지만 출력, 반올림 있음
		
		// 형식("%정수.소수점자릿수f")
		// ==> 정수는 숫자만큼 출력되고,
//			   소수점 아래는 소수점자릿수까지만 출력됨
		System.out.printf("%4.2f\n", 1234123.2582);
		
		System.out.printf("%d\n", 1000000000);
		
		System.out.printf("%,d\n", 1000000000);
		
			   
		

	}

}
