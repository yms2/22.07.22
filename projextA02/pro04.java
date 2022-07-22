package projextA02;

public class pro04 {

	public static void main(String[] args) {
		//형 변환
		//문자 -> 정수로
		char c='A';
		int int_c=(int)c;
		System.out.println(int_c);

		//정수 -> 실수  double 8bit int 4bit
		double double_int=(double)int_c;
		System.out.println(double_int);
		
		//정수 -> 문자
		int c1=65;
		char char_c1 =(char)c1;
		System.out.println(char_c1);
		
		
		//실수 -> 정주
		double d =3.64;
		int int_d =(int)d;
		System.out.println(int_d);
		
		byte byte1 = 127;
		short short1=(short)byte1;
		short1=(short)(short1+1L); //short와 int 더하면 int가 된다.
		//1뒤에 L을 붙이면 롱으로 출력된다 이유는 short는 int나 long보다 작기 때문이다. 
		System.out.println(short1);
		byte byte2 =(byte) short1;
		System.out.println(byte2);
	}

}
