package example;

import java.util.Scanner;

public class A007 {
	
	public static void main(String[] args) {
		// �Է��� ���ڰ� ¦������ Ȧ������ �Ǻ�

		Scanner scan = new Scanner(System.in);
		int num = 0;
		boolean end = true;
		
		do {
			System.out.print("���ڸ� �Է��ϼ��� : ");
			num = scan.nextInt();
			
			if(num<=0) {
				end = false;
				System.out.println("�ٽ� �Է��ϼ���.");
			}else if (num % 2 == 0) {
				System.out.println("¦!��!");
				System.out.println();
			}else {
				System.out.println("Ȧ!��!");
				System.out.println();
			}
			
		}while(end);
	scan.close();
	
	
	
	
	}

}
