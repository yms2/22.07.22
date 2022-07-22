package project2;

public class day1 {

	public static void main(String[] args) {
		int myBirthYear = 1998;
		//myBirthYear라는 변수에 1998을 넣는다.
		int 출생년도 = 1998;
		int $intValue = 231;
		//특수문자는 _ $만 사용가능하다. 첫번째는 _ $ 영어만 가능. 두번째자리부터 숫자가능.
		//true false null가은것도 식별자로 사용 불가능.
		System.out.println(myBirthYear);
		System.out.println(출생년도);
		System.out.println($intValue);
		
		int intdata = 2147483647;
		System.out.println(intdata);
		
		byte byteval = 127;
		System.out.println(byteval);
		
		byte bytevall = -128;
		System.out.println(bytevall);
		
		float floatval = 1.12000000001f;
		System.out.println(floatval);
		//소수는 더블로 판단된다. 강제로 float형으로 하려면 뒤에 f를 넣어야됨.
		double doubleval = 12.12000000000001;
		System.out.println(doubleval);
		
		//정수는 int 소수는 double로 할당됨.
		
		//상수 마지막이라는 의미
		final double PI = 3.14;
		System.out.println(PI);
		
		short shortval = 32767;
		System.out.println(shortval);
	}

}
