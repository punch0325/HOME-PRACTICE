package example;

import java.util.Scanner;

public class A003 {

	public static void main(String[] args) {
		// 1~6�г�� �� 4�г� �̻��� 70�� �̻��̾�� �հ�!
		// 3�г� ���ϴ� 60�� �̻��̾�� �հ�!
		// 0~100 ������ ���ڰ� �ƴ� �� ���� ���!
	
	Scanner scan = new Scanner(System.in);
		
	
	
	
	    int score = 0;
		String year = "";
		
	 do {
			System.out.print("\n�г��� �Է��ϼ��� : ");
			year = scan.next();
			System.out.print("������ �Է��ϼ��� : ");
			score = scan.nextInt();
			
			scan.close(); 
			
			if (score>0&&score<=100) {
			   if (year.equals("1�г�")&&score>=60) {
				  System.out.println("�հݡ�");
			  }else if(year.equals("2�г�")&&score>=60) {
				  System.out.println("�հݡ�");
			  }else if(year.equals("3�г�")&&score>=60) {
				  System.out.println("�հݡ�");
			  }else if(year.equals("4�г�")&&score>=70) {
				  System.out.println("�հݡ�");
			  }else if(year.equals("5�г�")&&score>=70) {
				  System.out.println("�հݡ�");
			  }else if(year.equals("6�г�")&&score>=70) {
				  System.out.println("�հݡ�");
			  }else {
				  System.out.println("���հݡ�");
			  }
		   }else {
			   System.out.println("�Ǵ� �Ұ��Դϴ�.");
		   }
		}while(true);

		
		
		
		
		}

}	