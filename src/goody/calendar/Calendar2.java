package goody.calendar;

import java.util.Scanner;

public class Calendar2 {

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
		int[] month31 = {1, 3, 5, 7, 8, 10, 12};
		int[] month30 = {4, 6, 9, 11};
		int day = 29;
		
		
		
		for(int i=0; i<month31.length; i++) {
			if(month31[i] == input) {
				day = 31;
			}
		}
		for(int i=0; i<month30.length; i++) {
			if(month30[i] == input) {
				day = 30;
			}
		}
		
		
		if(input < 1 || input > 12) {
			System.out.println("1���� 12������ ���� �Է����ּ���.");
		}else {
			System.out.println(input + "���� " + day + "�ϱ��� �ֽ��ϴ�.");
		}
			
		
		
	}

}
