package example;

import java.util.Scanner;

public class A006 {

	public static void main(String[] args) {
		// �Է��� ���ڰ� ����, �������� �Ǻ�

		Scanner scan = new Scanner(System.in);
		int num = 0;
		boolean stop = true;
		
		while (stop) {
			System.out.print("���ڸ� �Է��Ͻÿ� : ");
			num = scan.nextInt();
	
			if (num>0) {
				System.out.println("�������Դϴ١�");
				System.out.println();
			}else if (num == 0){
				stop = false;
				System.out.println("���α׷� ����");
			}else {
				System.out.println("�������Դϴ١�");
				System.out.println();
			}
		}  
		
		scan.close();
		
		
		
	}
	
}
