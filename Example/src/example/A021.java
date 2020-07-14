package example;

import java.util.Scanner;

public class A021 {

	public static void main(String[] args) {
		//do while문을 이용한 채팅 창 만들기!
		// 종료를 입력하면 채팅 끝~
		Scanner scan = new Scanner(System.in);
		boolean end = true;
		String chat = "";
		
		System.out.println("※내용을 입력하세요※");
		do {
			System.out.print("▷ ");
			chat = scan.nextLine();
			System.out.println("-"+chat);
			if (chat.equals("종료")) {
				end = false;
				System.out.println("\n채팅을 끝냅니다.");
			}
		}while(end);
		

		scan.close();
	}

}
