package goody.calendar;

import java.util.Scanner;

public class Calendar5 {

	public static void main(String[] args) {


		Scanner scanner = new Scanner(System.in);
		int[] monthdays = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
		while(true) {
		System.out.println("���� �Է��ϼ���.");
		int input = scanner.nextInt();
		
			if(input > 0 && input < 13) {
				int maxday = monthdays[input-1];
				System.out.println(input + "���� " + maxday + "�ϱ��� �ֽ��ϴ�.");
			}
			else {
				break;
			}
		}
		
		System.out.println("Have a nice day!");

	}

}
