package example;

import java.util.Scanner;

public class A002 {

	public static void main(String[] args) {
		// ���� ����!
//		1. 100���� �ʰ��ϴ� ���� �Է��� �Է¹����� �ʰ��Ͽ����ϴ�. ��� 
//		2. ���� ó�� 95~100 : ����� ������ A+ �Դϴ�. 
//		   90~94 : ����� ������ A �Դϴ�. 
//		   85~89 : ����� ������ B+ �Դϴ�. 
//		   80~84 : ����� ������ B �Դϴ�. ~~~~~ 
//		   65~69 : ����� ������ D+ �Դϴ�. 
//		   60~64 : ����� ������ D �Դϴ�. 
//		   60 �̸� : ����� ������ F�Դϴ�.
//		3. print ���� ��3���� ���˴ϴ�. 
		
		Scanner scan = new Scanner(System.in);
		
		int num1 = 0;
		String result = "";
		System.out.print("������ �Է����ּ���. �� ");
		num1 = scan.nextInt();
		
		if (num1>=0&&num1<=100){
			if (num1>=90) {
				if(num1>=95) {
					result = "A+";
			   }else {
				    result = "A";
			   }
		   }else if (num1>=80) {
			   if (num1>=85) {
				    result = "B+";
			  }else {
				    result = "B";
			  }
		   }else if (num1>=70) {
			   if (num1>=75) {
				    result = "C+";
			  }else {
				    result = "C";
			  }
		   }else if (num1>=60) {
			   if (num1>=65) {
				    result = "D+";
			  }else {
				    result = "D";
			  }
		   }else {
			   result = "F";
		   } System.out.println(result+"�����Դϴ�.");
		}else {
			System.out.println("���Է� ����! �ٽ� �Է��ϼ���!");
		}
		
		scan.close();
		
		

	}

}
