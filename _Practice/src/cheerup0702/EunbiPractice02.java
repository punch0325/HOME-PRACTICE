package cheerup0702;

import java.util.Scanner;

public class EunbiPractice02 {

	public static void main(String[] args) {
//	�ڸ��� �ʵ��б����� 1�г���� 6�г���� �߰���� 
//	������ ���Ҵ�. 6�г��� 70�� �̻��̸� �հ�, 
//	�� �̿��� �г��� 60�� �̻��̸� �հ��̴�. 
//	�̸� �Ǵ��ϴ� ���α׷��� �ۼ��غ���.
//	������ 0�̸� 100�ʰ��̸� ����� ���!
		
		Scanner scan = new Scanner(System.in); 
		
		int num1 = 0;
		String str1 = "";
		String str2 = "";
		System.out.print("�г� �Է� �� ");
		str1 = scan.next();
		System.out.print("���� �Է� �� ");
		num1 = scan.nextInt();
		
		if (num1>0&&num1<=100) {
			if (str1.equals("1�г�")) {
				if (num1>=60) {
					str2 = "�����մϴ�!";
			   }else {
				    str2 = "����ϼ���!";
			   }
		   }else if (str1.equals("2�г�")) {
			   if (num1>=60) {
				    str2 = "�����մϴ�!";
			  }else {
				    str2 = "����ϼ���!";
			  }
		   }else if (str1.equals("3�г�")) {
			   if (num1>=60) {
				    str2 = "�����մϴ�!";
			  }else {
				    str2 = "����ϼ���!";
			  }
		   }else if (str1.equals("4�г�")) {
			   if (num1>=60) {
				    str2 = "�����մϴ�!";
			  }else {
				    str2 = "����ϼ���!";
			  }
		   }else if (str1.equals("5�г�")) {
			   if (num1>=60) {
				    str2 = "�����մϴ�!";
			  }else {
				    str2 = "����ϼ���!";
			  }
		   }else if (str1.equals("6�г�")) {
			   if (num1>=70) {
				    str2 = "�����մϴ�!";
			  }else {
				    str2 = "����ϼ���!";
			  }
		   }
			System.out.println(str2);
	   }else {
		   System.out.println("���! ���! �Է� �Ұ�!");}
		
		
		
		scan.close();
		

	}

}
