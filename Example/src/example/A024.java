package example;

import java.util.Scanner;

public class A024 {

	public static void main(String[] args) {
		//UP & DOWN ���� �����!
		
		System.out.println("��UP & DOWN��");
		System.out.println();
		
		Scanner scan = new Scanner(System.in);
		
		int num1 = 0;
		int num2 = 0;
		int count = 0;
		boolean end = true;
		num1 = (int)(Math.random()*100)+1;
		
		while (end) {	
			System.out.print("1-100 ������ ���� �� �ϳ��� �Է��ϼ���  : ");
			num2 = scan.nextInt();
			
			if (num1 > num2) {
				System.out.println("��UP!");
				count++;
			}else if (num1 < num2) {
				System.out.println("��DOWN!");
				count++;
			}else if (num1 == num2) {
				end = false;
				count++;
				System.out.println("�����Դϴ٢�");
			}
		} 
		System.out.println("�� �õ� Ƚ���� "+count+"��!");
	
		scan.close();
	
	}

}
