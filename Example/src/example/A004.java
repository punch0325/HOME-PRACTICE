package example;

import java.util.Scanner;

public class A004 {
	
	public static void main(String[] args) {
		// 초를 입력후 시,분,초로 환산하기

		Scanner scan = new Scanner(System.in);
		
		int time = 0;
		
		int hour = 0;
		int min = 0;
		int sec = 0;
		
	
		
		do{
			System.out.print("초를 입력하세요 : ");
			time = scan.nextInt();
			
			hour = time/60/60;
			min = time/60%60;
			sec = time%60;
			
			System.out.println(time+"초는 "+hour+"시 "+min+"분 "+sec+"초이다.");
			System.out.println();
		
			scan.close();
		}while (true);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
