package projextA02;

import java.util.Scanner;

public class pro11 {

	public static void main(String[] args) {

		
		System.out.println("이름,도시,나이,체중,독신여부를 빈칸으로 분리하여 입력하세요");
		
		Scanner scanner = new Scanner(System.in);
		String name = scanner.next();
		System.out.println("이름은"+name+",");
		
		String city = scanner.next();
		System.out.println("도시는"+city+",");
		
		int age = scanner.nextInt();
		
		System.out.print("나이는"+age+"살,");
		
		double weight = scanner.nextDouble();
		System.out.println("체중은"+weight+"kg,");
		
		boolean single = scanner.nextBoolean();
		System.out.println("독신여부는"+single+"입니다.");
		
	}

}
