package cheerup0701;

import java.util.Scanner;

public class EunbiPractice_002 {

	public static void main(String[] args) {
		
		int grade , year = 0;
		Scanner scan = new Scanner(System.in);
		System.out.print("학년 입력 ▶ ");
		year = scan.nextInt();
		System.out.print("점수 입력 ▶ ");
		grade = scan.nextInt();

		if (grade>=60&&year<=3) {
			System.out.println("합격!");
		}else if (grade>=70&&year==4) {
			System.out.println("합격!");
		}else {
			System.out.println("불합격!");
		}
		
		scan.close();
		
	}

}
