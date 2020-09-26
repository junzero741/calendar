package goody.calendar;

import java.util.Scanner;

public class Calendar4 {

	public static void main(String[] args) {
		
//		반복횟수를 입력하세요.
//		3 (엔터)
//
//		월을 입력하세요.
//		1
//		2
//		3
//
//		1월은 31일까지 있습니다.
//		2월은 28일까지 있습니다.
//		3월은 31일까지 있습니다.
		
		System.out.println("반복횟수를 입력하세요.");
		Scanner scanner = new Scanner(System.in);
		int times = scanner.nextInt();
		int[] month = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
		System.out.println("월을 입력하세요.");
		
		for(int i=0; i<times; i++) {
			
		int input = scanner.nextInt();
		int maxday = month[input-1];
		System.out.println(input + "월은 " + maxday + "일까지 있습니다.");
		
		}
		
	
		
//		int i = 0;
//		while(i<times) {
//			int monthi = scanner.nextInt();
//			i++;
//			System.out.println(monthi + "월은 nn일까지 있습니다.");
//			}
//			
//	
	
	}

}
