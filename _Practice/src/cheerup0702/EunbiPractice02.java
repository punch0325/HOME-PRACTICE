package cheerup0702;

import java.util.Scanner;

public class EunbiPractice02 {

	public static void main(String[] args) {
//	코리아 초등학교에서 1학년부터 6학년까지 중간고사 
//	시험을 보았다. 6학년은 70점 이상이면 합격, 
//	그 이외의 학년은 60점 이상이면 합격이다. 
//	이를 판단하는 프로그램을 작성해보자.
//	점수가 0미만 100초과이면 경고문구 출력!
		
		Scanner scan = new Scanner(System.in); 
		
		int num1 = 0;
		String str1 = "";
		String str2 = "";
		System.out.print("학년 입력 ▷ ");
		str1 = scan.next();
		System.out.print("점수 입력 ▷ ");
		num1 = scan.nextInt();
		
		if (num1>0&&num1<=100) {
			if (str1.equals("1학년")) {
				if (num1>=60) {
					str2 = "축하합니다!";
			   }else {
				    str2 = "노력하세요!";
			   }
		   }else if (str1.equals("2학년")) {
			   if (num1>=60) {
				    str2 = "축하합니다!";
			  }else {
				    str2 = "노력하세요!";
			  }
		   }else if (str1.equals("3학년")) {
			   if (num1>=60) {
				    str2 = "축하합니다!";
			  }else {
				    str2 = "노력하세요!";
			  }
		   }else if (str1.equals("4학년")) {
			   if (num1>=60) {
				    str2 = "축하합니다!";
			  }else {
				    str2 = "노력하세요!";
			  }
		   }else if (str1.equals("5학년")) {
			   if (num1>=60) {
				    str2 = "축하합니다!";
			  }else {
				    str2 = "노력하세요!";
			  }
		   }else if (str1.equals("6학년")) {
			   if (num1>=70) {
				    str2 = "축하합니다!";
			  }else {
				    str2 = "노력하세요!";
			  }
		   }
			System.out.println(str2);
	   }else {
		   System.out.println("경고! 경고! 입력 불가!");}
		
		
		
		scan.close();
		

	}

}
