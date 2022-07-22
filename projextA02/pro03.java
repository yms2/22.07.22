package projextA02;

public class pro03 {

	public static void main(String[] args) {
		int sum =10 + 20; //int + int
		int value = 10;//int => int
		
		int value1 = sum + value; //int + int
		System.out.println(value1);
		
		long sum1 = (long)(10L+10L+10L+10L+10L+10L+10L+2147483648L);
		long sum2 = (long)(10+10+10+10+10+10+10+10+2147483637);
		long sum3 = (long)(10L+10L+10L+10+10+10+10+10+2147483637);
		long sum4 = (long)(2147483637+10L+10L+10L+10+10+10+10+10);
		
		int sum5 =  (10+10+10+10+10+10+10+10+2147483637);
		System.out.println(sum1);
		System.out.println(sum2);
		System.out.println(sum3);
		System.out.println(sum4);
		System.out.println(sum5);

		
		//int 일때는 int로 나타내는대 sum5의 값은 int를 벗어나기 때문에 -로 표시되고
		//long으로 저장을 했지만 L을 붙이지 않으면 long함수로 표현되는 것이 아니라 int함수로 표현되기 때문에 L을 하나라도 붙여줘야된다.
	}

}
