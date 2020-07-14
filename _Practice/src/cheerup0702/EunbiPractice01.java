package cheerup0702;

import java.util.Scanner;

public class EunbiPractice01 {

	public static void main(String[] args) {
	// 숫자 3개 중 가장 큰 수 출력하기
		
		int num1, num2, num3, maxR = 0;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요 : ");
		num1 = scan.nextInt();
		num2 = scan.nextInt();
		num3 = scan.nextInt();
		
		if (num1>num2) {
			if (num1>num3) {
				maxR = num1;
		   }else {
			   maxR = num3;
		   }
		}else if (num1<num2) {
			if(num2>num3) {
				maxR = num2;
		    }else { 
		    	maxR = num3;
		    }
		}
		
		System.out.println("최대값은 " + maxR + " 입니다!");
	
		scan.close();
	

	}

}
