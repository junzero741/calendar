package goody.calendar;

import java.util.Scanner;

public class Calendar3 {

	public static void main(String[] args) {
		
//		월을 입력하면 그 달이 몇일로 구성되어 있는지 출력하는 프로그램 작성하기
//		입력결과 예시
//		달을 입력하세요.
//		3 (엔터)
//		3월은 31일까지 있습니다.
		
		System.out.println("달을 입력하세요.");
		Scanner scanner = new Scanner(System.in);
		int input = scanner.nextInt();
		int[] maxdays = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
		int max = maxdays[input - 1];
		System.out.println(input + "월은 " + max + "일까지 있습니다.");
	}

}
