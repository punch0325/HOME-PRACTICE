package example;

import java.util.Scanner;

public class A021 {

	public static void main(String[] args) {
		//do while���� �̿��� ä�� â �����!
		// ���Ḧ �Է��ϸ� ä�� ��~
		Scanner scan = new Scanner(System.in);
		boolean end = true;
		String chat = "";
		
		System.out.println("�س����� �Է��ϼ����");
		do {
			System.out.print("�� ");
			chat = scan.nextLine();
			System.out.println("-"+chat);
			if (chat.equals("����")) {
				end = false;
				System.out.println("\nä���� �����ϴ�.");
			}
		}while(end);
		

		scan.close();
	}

}
