package goody.calendar;

import java.util.Scanner;

public class Calendar4 {

	public static void main(String[] args) {
		
//		�ݺ�Ƚ���� �Է��ϼ���.
//		3 (����)
//
//		���� �Է��ϼ���.
//		1
//		2
//		3
//
//		1���� 31�ϱ��� �ֽ��ϴ�.
//		2���� 28�ϱ��� �ֽ��ϴ�.
//		3���� 31�ϱ��� �ֽ��ϴ�.
		
		System.out.println("�ݺ�Ƚ���� �Է��ϼ���.");
		Scanner scanner = new Scanner(System.in);
		int times = scanner.nextInt();
		int[] month = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
		System.out.println("���� �Է��ϼ���.");
		
		for(int i=0; i<times; i++) {
			
		int input = scanner.nextInt();
		int maxday = month[input-1];
		System.out.println(input + "���� " + maxday + "�ϱ��� �ֽ��ϴ�.");
		
		}
		
	
		
//		int i = 0;
//		while(i<times) {
//			int monthi = scanner.nextInt();
//			i++;
//			System.out.println(monthi + "���� nn�ϱ��� �ֽ��ϴ�.");
//			}
//			
//	
	
	}

}
