package example;

import java.util.Scanner;

public class A012 {

	public static void main(String[] args) {
		// ���ϱ� ���۰� �������� ���Ƿ� �����ϸ�
		// �׿� �´� �հ� ���ϱ� ������ ����ϱ�!(E03)

		Scanner scan = new Scanner(System.in);
		int start = 0;
		int end = 0;
		int sum = 0;
		
		System.out.print("���� ���� ���ڸ� �Է��ϼ��� : ");
		start = scan.nextInt();
		System.out.print("���� ������ ���ڸ� �Է��ϼ��� : ");
		end = scan.nextInt();
		
		if (start<end) {
			
			for (int i = start; i <=end; i++) {
				sum+=i;
				
				if (i<end&&i>=0) {
					System.out.print(i+"+");
				}else if (i<0) {
					System.out.print("("+i+")"+"+");
				}else{
					System.out.print(i+"=");
				}
			}
			System.out.println(sum);
			System.out.println(start+"����"+end+"������ ���� "+sum+"�Դϴ�!");
			
		}else {
			System.out.println("���� �Է� ����!");
		}
		
		scan.close();
		
		
		
		
	}

}
