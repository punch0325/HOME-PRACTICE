package example;

import java.util.Scanner;

public class A009 {
	
	public static void main(String[] args) {
		// ������ ���� �����
		
		Scanner scan = new Scanner(System.in);
		
		String word = "";
		boolean stop = true;
		
		while (stop) {
			System.out.print("�ܾ �Է��ϼ��� : ");
			word = scan.nextLine();
			
			switch (word) {
			case "water" :
				System.out.println("'��' �̶�� ���Դϴ�.");
				break;
			case "bottle" :
				System.out.println("'��' �̶�� ���Դϴ�.");
				break;
			case "brush" :
				System.out.println("'��' �̶�� ���Դϴ�.");
				break;
			case "bag" :
				System.out.println("'����' �̶�� ���Դϴ�.");
				break;
			default :
				stop = false;
				System.out.println("�Է� �� ������ �����ϴ�.");
				break;
			}
		}
		
		scan.close();
		
		

	}

}
