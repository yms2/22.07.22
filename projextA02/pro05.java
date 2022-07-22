package projextA02;

public class pro05 {

	public static void main(String[] args) {
		char name1 = '유';
		char name2 = '민';
		char name3 = '성';
		System.out.println(""+name1+name2+name3);// ""은 문자열이라고 지정하는 것을 말한다.
//		System.out.println(name1);
//		System.out.println(name2);
//		System.out.println(name3);
		System.out.println();
		
		
		String name = "유민성";
		System.out.println(name1 + name2 + name3);
		System.out.println(name);
		System.out.println(name + name1 + name2 + name3);
		
		System.out.println(10+20+"안녕하세요");
		System.out.println("안녕하세요"+10+20);
		
		System.out.println(10+30+40+"HI");
		System.out.println("HI"+(10+30+40));
		System.out.println(10+30+"HI"+40);
		//연산자가 문자의 앞에있을 때는 계산이 되지만 뒤에 위치해 있으면 계산이 되지 않고 나타난다.
		//괄호를 안에 있으면 계산이 된다.
		System.out.println(10+30+"HI"+40*100);
		// 곱하기가 더하기보다 우선이기 때문에 곱하기연산이 된다.
		
		System.out.println("("+10+20+")");
		System.out.println((10+20));
		System.out.println();
		char c1 = '가';
		char c2 = '나';
		System.out.println(""+c1+c2);
		System.out.println(c1+c2);
		
		String str = 10+20+"안녕하세요";// int 30과 문자열을 더해서 문자열이 된다.
		System.out.println(str);
		String str1 = "안녕하세요"+10+20;
		System.out.println(str1);
		
		System.out.println(10); //10진수
		System.out.println(017); //8진수
		System.out.println(0x1F); //16진수
		System.out.println(0b010101010); //2진수
		
		char c = '\u0041';
		System.out.println(c);
		char cc = '\u0042';
		System.out.println(cc);
		char cc2='\uae00';
		System.out.println(cc2);
		
		String string1 = "안녕\t안녕하세요\t나는\n\"유민성\"입니다.";
		System.out.println(string1);
		String string2 = "안녕\b안녕하세요\t나는\n\"유민성\"입니다.";
		System.out.println(string2);
		
		boolean b1 = true;
		boolean b2 = false;
		System.out.println(b1);
		System.out.println(b2);
		
		
		boolean b3 = (10>1);
		boolean b4 = (10 == 100);
		boolean b5 = (10>1);
		boolean b6 = (10<1);
		System.out.println(b3);
		System.out.println(b4);
		System.out.println(b5);
		System.out.println(b6);
		
		String s1=null;
		String s2="";
		int[] a1=null;//int[]은 배열이다. 주소를 가진
		System.out.println(s1);
		System.out.println(a1);
		
		
		
		
		
		
		
		
	}

}
