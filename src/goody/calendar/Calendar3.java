package goody.calendar;

import java.util.Scanner;

public class Calendar3 {

	public static void main(String[] args) {
		
//		���� �Է��ϸ� �� ���� ���Ϸ� �����Ǿ� �ִ��� ����ϴ� ���α׷� �ۼ��ϱ�
//		�Է°�� ����
//		���� �Է��ϼ���.
//		3 (����)
//		3���� 31�ϱ��� �ֽ��ϴ�.
		
		System.out.println("���� �Է��ϼ���.");
		Scanner scanner = new Scanner(System.in);
		int input = scanner.nextInt();
		int[] maxdays = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
		int max = maxdays[input - 1];
		System.out.println(input + "���� " + max + "�ϱ��� �ֽ��ϴ�.");
	}

}
