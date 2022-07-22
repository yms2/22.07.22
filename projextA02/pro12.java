package projextA02;

import java.util.Scanner;;

public class pro12 {

	public static void main(String[] args) {
		System.out.println("이름입력");
		Scanner in = new Scanner(System.in);
		
		String name = in.nextLine();
		
		System.out.println("나이 입력");
		String age = in.nextLine();
		
		System.out.println("사는 곳");
		String place = in.nextLine();
		
		System.out.println("일음:"+name+"나이:"+age+"사는 곳:"+place);
	}

}
