package goody.calendar;

import java.util.Scanner;

public class Calendar {

	public static void main(String[] args) {

//		���� �Է��ϸ� �� ���� ���Ϸ� �����Ǿ� �ִ��� ����ϴ� ���α׷� �ۼ��ϱ�
//		�Է°�� ����
//		���� �Է��ϼ���.
//		3 (����)
//		3���� 31�ϱ��� �ֽ��ϴ�.
		
//		1��: 31��   2��:29	3��:31	4��:30��		5��:31��		6��:30��		7��:31��		8��:31��		9��:30��		10��:31��	11��:30��	12��:31��

		System.out.println("���� �Է��ϼ���.");
		Scanner scanner = new Scanner(System.in);
		int input = scanner.nextInt();
		int[] month = new int[12];
		int day = 31;
		
		
		if(input == 4 || input == 6 || input == 9 || input == 11) {
			day = 30;
		}else if(input == 2) {
			day = 29;
		}else if(input < 1 || input > 12) {
			System.out.println("�������� �ʴ� ���Դϴ�.");
		}
		
		System.out.println(input + "���� " + day + "�ϱ��� �ֽ��ϴ�.");
		
		
	}

}
