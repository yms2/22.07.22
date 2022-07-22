package projextA02;

public class pro09 {

	public static void main(String[] args) {
		int a =1;
		System.out.println(a++);
		System.out.println(++a);
		
		int b=0;
		System.out.println("b="+b+"a="+a);
		b = ++a;
		System.out.println("b="+b+"a="+a);
		b = a++;
		System.out.println("b="+b+"a="+a);
	}

}
