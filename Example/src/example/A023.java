package example;

import java.util.Scanner;

public class A023 {

	public static void main(String[] args) {
		//������ ���� �ݺ��Ͽ� �Է� �� 0�� �Ǹ� ����!
		//�Է��� ������ �� ������ �հ� ��յ� ���!
		
		Scanner scan = new Scanner(System.in);
		System.out.println("���ڸ� �Է��ϼ���. 0�� ������ ����˴ϴ�.");
		int num = 0;
		int count = 0;
		int sum = 0;
		int average = 0;
		boolean end = true;
		
		do {
			num = scan.nextInt();
			
			if (num > 0||num < 0) {
				sum+=num;
				count++;
			}else if (num == 0) {
				end = false;
				System.out.println("���α׷� ����");
			}
		}while (end);
		average = sum/count;
		System.out.println();
		System.out.println("�� �Է� ������ "+count+"�Դϴ�.");
		System.out.println("���� �� �հ� : "+sum);
		System.out.println("���� �� ��� : "+average);
	
	
		scan.close();
	
	
	
	
	}

}
