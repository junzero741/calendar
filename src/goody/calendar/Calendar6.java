package goody.calendar;

import java.util.Scanner;

public class Calendar6 {

	public static void main(String[] args) {
//		1���� �Ͽ��Ϸ� ���ص� �����ϴ�.
//		-1�� �Է¹ޱ� ������ �ݺ� �Է¹޴´�.
		
//		���� �Է��ϼ���.
//		> 3
//		�� �� ȭ �� �� �� ��
//		--------------------
//		 1  2  3  4  5  6  7
//		 8  9 10 11 12 13 14
//		15 16 17 18 19 20 21
//		22 23 24 25 26 27 28
//		29 30 31
//		���� �Է��ϼ���.
//		> -1
//		Bye~
//		int[] monthdays = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

		
		Scanner scanner = new Scanner(System.in);
		
		
		while(true) {
			
			System.out.println("���� �Է��ϼ���.");
			int input = scanner.nextInt();
			
			if(input > 0 && input < 13) {
				printCalendar(input);
			}
			
			else {
				break;
			}
		}
		

			System.out.println("Bye~");
		
		

	}

	public static void printCalendar(int input) {
		
		System.out.println("�� �� ȭ �� �� �� ��");
		System.out.println("--------------------");
		System.out.println(" 1  2  3  4  5  6  7");
		System.out.println(" 8  9 10 11 12 13 14");
		System.out.println("15 16 17 18 19 20 21");
		System.out.println("22 23 24 25 26 27 28");
		
		if(input == 4 || input == 6|| input == 9 || input == 11) {
		System.out.println("29 30");
		} else if(input == 2) {
		System.out.println("29");
		} else {
		System.out.println("29 30 31");	
		}
		
		
	}

}
