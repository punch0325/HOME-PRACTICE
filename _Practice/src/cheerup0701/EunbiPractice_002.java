package cheerup0701;

import java.util.Scanner;

public class EunbiPractice_002 {

	public static void main(String[] args) {
		
		int grade , year = 0;
		Scanner scan = new Scanner(System.in);
		System.out.print("�г� �Է� �� ");
		year = scan.nextInt();
		System.out.print("���� �Է� �� ");
		grade = scan.nextInt();

		if (grade>=60&&year<=3) {
			System.out.println("�հ�!");
		}else if (grade>=70&&year==4) {
			System.out.println("�հ�!");
		}else {
			System.out.println("���հ�!");
		}
		
		scan.close();
		
	}

}
