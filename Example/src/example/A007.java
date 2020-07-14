package example;

import java.util.Scanner;

public class A007 {
	
	public static void main(String[] args) {
		// 입력한 숫자가 짝수인지 홀수인지 판별

		Scanner scan = new Scanner(System.in);
		int num = 0;
		boolean end = true;
		
		do {
			System.out.print("숫자를 입력하세요 : ");
			num = scan.nextInt();
			
			if(num<=0) {
				end = false;
				System.out.println("다시 입력하세요.");
			}else if (num % 2 == 0) {
				System.out.println("짝!수!");
				System.out.println();
			}else {
				System.out.println("홀!수!");
				System.out.println();
			}
			
		}while(end);
	scan.close();
	
	
	
	
	}

}
