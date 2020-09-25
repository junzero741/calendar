package goody.calendar;

import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
		
//		두 수를 입력하세요.
//		5 10 (엔터)
//		두 수의 합은 15입니다.
		
		System.out.println("두 수를 입력하세요.");
		Scanner scanner = new Scanner(System.in);
		int input = scanner.nextInt();
		int input2 = scanner.nextInt();
		int sum = input + input2;
		
		System.out.println("두 수의 합은 " + sum + "입니다.");
		
		
		
	}

}
