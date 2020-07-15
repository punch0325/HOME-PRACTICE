package example;

import java.util.Scanner;

public class A023 {

	public static void main(String[] args) {
		//정수를 무한 반복하여 입력 후 0이 되면 종료!
		//입력한 숫자의 총 개수와 합계 평균도 출력!
		
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력하세요. 0을 누르면 종료됩니다.");
		int num = 0;
		int count = 0;
		int sum = 0;
		int average = 0;
		boolean end = true;
		
		do {
			num = scan.nextInt();
			
			if (num > 0||num < 0) {
				sum+=num;
				count++;
			}else if (num == 0) {
				end = false;
				System.out.println("프로그램 종료");
			}
		}while (end);
		average = sum/count;
		System.out.println();
		System.out.println("총 입력 개수는 "+count+"입니다.");
		System.out.println("숫자 총 합계 : "+sum);
		System.out.println("숫자 총 평균 : "+average);
	
	
		scan.close();
	
	
	
	
	}

}
