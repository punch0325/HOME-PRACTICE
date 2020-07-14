package example;

import java.util.Scanner;

public class A006 {

	public static void main(String[] args) {
		// 입력한 숫자가 정수, 음수인지 판별

		Scanner scan = new Scanner(System.in);
		int num = 0;
		boolean stop = true;
		
		while (stop) {
			System.out.print("숫자를 입력하시오 : ");
			num = scan.nextInt();
	
			if (num>0) {
				System.out.println("※정수입니다※");
				System.out.println();
			}else if (num == 0){
				stop = false;
				System.out.println("프로그램 종료");
			}else {
				System.out.println("※음수입니다※");
				System.out.println();
			}
		}  
		
		scan.close();
		
		
		
	}
	
}
