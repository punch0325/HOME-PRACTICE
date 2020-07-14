package example;

import java.util.Scanner;

public class A002 {

	public static void main(String[] args) {
		// 학점 계산기!
//		1. 100점을 초과하는 점수 입력은 입력범위를 초과하였습니다. 출력 
//		2. 학점 처리 95~100 : 당신의 학점은 A+ 입니다. 
//		   90~94 : 당신의 학점은 A 입니다. 
//		   85~89 : 당신의 학점은 B+ 입니다. 
//		   80~84 : 당신의 학점은 B 입니다. ~~~~~ 
//		   65~69 : 당신의 학점은 D+ 입니다. 
//		   60~64 : 당신의 학점은 D 입니다. 
//		   60 미만 : 당신의 학점은 F입니다.
//		3. print 문은 딱3번만 사용됩니다. 
		
		Scanner scan = new Scanner(System.in);
		
		int num1 = 0;
		String result = "";
		System.out.print("학점을 입력해주세요. ▶ ");
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
		   } System.out.println(result+"학점입니다.");
		}else {
			System.out.println("※입력 오류! 다시 입력하세요!");
		}
		
		scan.close();
		
		

	}

}
