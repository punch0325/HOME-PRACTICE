package example;

import java.util.Scanner;

public class A001 {

	public static void main(String[] args) {
		// ������ ���� �����! (B05)
		
		Scanner scan = new Scanner(System.in);
		
		int num1, num2 ;
		int result = 0;
		num1 = 0;
		num2 = 0;
		System.out.print("ù��° ���ڸ� �Է��ϼ���. �� ");
		num1 = scan.nextInt();
		System.out.print("�ι�° ���ڸ� �Է��ϼ���. �� ");
		num2 = scan.nextInt();

		result = num1+num2;
		System.out.println("�ڴ��� "+result+"�Դϴ�.");
		
		scan.close();
	}

}
