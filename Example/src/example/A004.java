package example;

import java.util.Scanner;

public class A004 {
	
	public static void main(String[] args) {
		// �ʸ� �Է��� ��,��,�ʷ� ȯ���ϱ�

		Scanner scan = new Scanner(System.in);
		
		int time = 0;
		
		int hour = 0;
		int min = 0;
		int sec = 0;
		
	
		
		do{
			System.out.print("�ʸ� �Է��ϼ��� : ");
			time = scan.nextInt();
			
			hour = time/60/60;
			min = time/60%60;
			sec = time%60;
			
			System.out.println(time+"�ʴ� "+hour+"�� "+min+"�� "+sec+"���̴�.");
			System.out.println();
		
			scan.close();
		}while (true);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
