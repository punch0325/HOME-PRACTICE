package example;

import java.util.Scanner;

public class A005 {

	public static void main(String[] args) {
		// �� �ڸ� �� �Է� �޾� ���� ū �� ���

		Scanner scan = new Scanner(System.in);
		int num1 = 0;
		int num2 = 0;
		int num3 = 0;
		
		
	 do {
			System.out.println("���ڸ� �Է��ϼ�����");
			num1 = scan.nextInt();
			num2 = scan.nextInt();
			num3 = scan.nextInt();
			
			if (num1>num2&&num1>num3) {
				System.out.println("LARGEST : "+num1);
			}else if (num2>num1&&num2>num3) {
				System.out.println("LARGEST : "+num2);
			}else {
			    System.out.println("LARGEST : "+num3);		
			}
		    System.out.println();
			scan.close();
		}while (true);

	
	
	
	}

}
