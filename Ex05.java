package khie;

public class Ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 숫자 + 숫자 ==> 숫자(+의 역할은 덧셈 의미)
		System.out.println(10 + 2);
		
		// 문자 + 숫자 ==> 문자(+의 역할은 연결(결합) 의미)
		System.out.println("10"+2);
		
		// 숫자 + 문자 ==> 문자(+의 역할은 연결(결합) 의미)
		System.out.println(10+"2");
		
		// 문자 + 문자 ==> 문자(+의 역할은 연결(결합) 의미)
		System.out.println("10"+"2");
		
		System.out.println("a >>> " + 10 + 2);
		
		// 우선적으로 처리해야 할 게 있으면 괄호 필요
		System.out.println("a >>> " + (10 + 2));


	}

}
