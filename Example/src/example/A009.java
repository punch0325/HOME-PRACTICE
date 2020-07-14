package example;

import java.util.Scanner;

public class A009 {
	
	public static void main(String[] args) {
		// 간단한 사전 만들기
		
		Scanner scan = new Scanner(System.in);
		
		String word = "";
		boolean stop = true;
		
		while (stop) {
			System.out.print("단어를 입력하세요 : ");
			word = scan.nextLine();
			
			switch (word) {
			case "water" :
				System.out.println("'물' 이라는 뜻입니다.");
				break;
			case "bottle" :
				System.out.println("'병' 이라는 뜻입니다.");
				break;
			case "brush" :
				System.out.println("'빗' 이라는 뜻입니다.");
				break;
			case "bag" :
				System.out.println("'가방' 이라는 뜻입니다.");
				break;
			default :
				stop = false;
				System.out.println("입력 된 내용이 없습니다.");
				break;
			}
		}
		
		scan.close();
		
		

	}

}
