package example;

import java.util.Scanner;

public class A003 {

	public static void main(String[] args) {
		// 1~6학년들 중 4학년 이상은 70점 이상이어야 합격!
		// 3학년 이하는 60점 이상이어야 합격!
		// 0~100 사이의 숫자가 아닐 시 오류 출력!
	
	Scanner scan = new Scanner(System.in);
		
	
	
	
	    int score = 0;
		String year = "";
		
	 do {
			System.out.print("\n학년을 입력하세요 : ");
			year = scan.next();
			System.out.print("점수를 입력하세요 : ");
			score = scan.nextInt();
			
			scan.close(); 
			
			if (score>0&&score<=100) {
			   if (year.equals("1학년")&&score>=60) {
				  System.out.println("합격★");
			  }else if(year.equals("2학년")&&score>=60) {
				  System.out.println("합격★");
			  }else if(year.equals("3학년")&&score>=60) {
				  System.out.println("합격★");
			  }else if(year.equals("4학년")&&score>=70) {
				  System.out.println("합격★");
			  }else if(year.equals("5학년")&&score>=70) {
				  System.out.println("합격★");
			  }else if(year.equals("6학년")&&score>=70) {
				  System.out.println("합격★");
			  }else {
				  System.out.println("불합격☆");
			  }
		   }else {
			   System.out.println("판단 불가입니다.");
		   }
		}while(true);

		
		
		
		
		}

}	