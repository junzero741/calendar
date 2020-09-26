package goody.calendar;

import java.util.Scanner;

public class Calendar5 {

	public static void main(String[] args) {
//		월을 입력하세요.
//		> 3
//		3월은 31일까지 있습니다.
//		월을 입력하세요.
//		> 2
//		2월은 28일까지 있습니다.
//		월을 입력하세요.
//		> -1
//		Have a nice day!

		Scanner scanner = new Scanner(System.in);
		int[] monthdays = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
		while(true) {
		System.out.println("월을 입력하세요.");
		int input = scanner.nextInt();
		
			if(input > 0 && input < 13) {
				int maxday = monthdays[input-1];
				System.out.println(input + "월은 " + maxday + "일까지 있습니다.");
			}
			else {
				break;
			}
		}
		
		System.out.println("Have a nice day!");

	}

}
