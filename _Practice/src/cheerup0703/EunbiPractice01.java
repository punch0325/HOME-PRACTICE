package cheerup0703;

import java.util.Scanner;

public class EunbiPractice01 {

	public static void main(String[] args) {
		
		// 구구단 자동 출력기
		
		int num1 = 0;
		int num2 = 0;
		int num3 = 0;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("구구단 : " );
		num3 = scan.nextInt();
		
		scan.close();
		
		for (num1 = 1; num1 <= 9; num1++) {
			num2=num1*num3;
			System.out.print(num3+"x"+num1+"=");
			System.out.println(num2);
		}
		
		
		
		

	}

}
