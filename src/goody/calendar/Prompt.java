package goody.calendar;

import java.util.Scanner;

public class Prompt {

	private final static String PROMPT = "cal> ";

	public void rumprompt() {

		Scanner scanner = new Scanner(System.in);
		Calendar cal = new Calendar();

		int month = 1;
		int year = 1;
		
		while (true) {
			System.out.println("������ �Է��ϼ���");
			System.out.println(PROMPT);
			year = scanner.nextInt();
			System.out.println("���� �Է��ϼ���");
			System.out.println(PROMPT);
			month = scanner.nextInt();
			
			if (month == -1) {
				break;
			}

			if (month > 12) {
				continue;
			}
			
			
			cal.printCalendar(year, month);
			
		}

		System.out.println("Bye~");
		scanner.close();
	}

	public static void main(String[] args) {
		// �� ����
		Prompt p = new Prompt();
		p.rumprompt();
	}
}