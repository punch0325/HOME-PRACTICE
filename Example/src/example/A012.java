package example;

import java.util.Scanner;

public class A012 {

	public static void main(String[] args) {
		// 더하기 시작과 마지막을 임의로 설정하면
		// 그에 맞는 합과 더하기 계산식을 출력하기!(E03)

		Scanner scan = new Scanner(System.in);
		int start = 0;
		int end = 0;
		int sum = 0;
		
		System.out.print("덧셈 시작 숫자를 입력하세요 : ");
		start = scan.nextInt();
		System.out.print("덧셈 마지막 숫자를 입력하세요 : ");
		end = scan.nextInt();
		
		if (start<end) {
			
			for (int i = start; i <=end; i++) {
				sum+=i;
				
				if (i<end&&i>=0) {
					System.out.print(i+"+");
				}else if (i<0) {
					System.out.print("("+i+")"+"+");
				}else{
					System.out.print(i+"=");
				}
			}
			System.out.println(sum);
			System.out.println(start+"부터"+end+"까지의 합은 "+sum+"입니다!");
			
		}else {
			System.out.println("숫자 입력 오류!");
		}
		
		scan.close();
		
		
		
		
	}

}
