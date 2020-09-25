package goody.calendar;

import java.util.Scanner;

public class Calendar {

	public static void main(String[] args) {

//		월을 입력하면 그 달이 몇일로 구성되어 있는지 출력하는 프로그램 작성하기
//		입력결과 예시
//		달을 입력하세요.
//		3 (엔터)
//		3월은 31일까지 있습니다.
		
//		1월: 31일   2월:29	3월:31	4월:30일		5월:31일		6월:30일		7월:31일		8월:31일		9월:30일		10월:31일	11월:30일	12월:31일

		System.out.println("달을 입력하세요.");
		Scanner scanner = new Scanner(System.in);
		int input = scanner.nextInt();
		int[] month = new int[12];
		int day = 31;
		
		
		if(input == 4 || input == 6 || input == 9 || input == 11) {
			day = 30;
		}else if(input == 2) {
			day = 29;
		}else if(input < 1 || input > 12) {
			System.out.println("존재하지 않는 달입니다.");
		}
		
		System.out.println(input + "월은 " + day + "일까지 있습니다.");
		
		
	}

}
