package example;

import java.util.Scanner;

public class A024 {

	public static void main(String[] args) {
		//UP & DOWN 게임 만들기!
		
		System.out.println("★UP & DOWN★");
		System.out.println();
		
		Scanner scan = new Scanner(System.in);
		
		int num1 = 0;
		int num2 = 0;
		int count = 0;
		boolean end = true;
		num1 = (int)(Math.random()*100)+1;
		
		while (end) {	
			System.out.print("1-100 까지의 숫자 중 하나를 입력하세요  : ");
			num2 = scan.nextInt();
			
			if (num1 > num2) {
				System.out.println("※UP!");
				count++;
			}else if (num1 < num2) {
				System.out.println("※DOWN!");
				count++;
			}else if (num1 == num2) {
				end = false;
				count++;
				System.out.println("성공입니다♥");
			}
		} 
		System.out.println("총 시도 횟수는 "+count+"번!");
	
		scan.close();
	
	}

}
