package example;

import java.util.Scanner;

public class A001 {

	public static void main(String[] args) {
		// 간단한 계산기 만들기! (B05)
		
		Scanner scan = new Scanner(System.in);
		
		int num1, num2 ;
		int result = 0;
		num1 = 0;
		num2 = 0;
		System.out.print("첫번째 숫자를 입력하세요. ☞ ");
		num1 = scan.nextInt();
		System.out.print("두번째 숫자를 입력하세요. ☞ ");
		num2 = scan.nextInt();

		result = num1+num2;
		System.out.println("★답은 "+result+"입니다.");
		
		scan.close();
	}

}
