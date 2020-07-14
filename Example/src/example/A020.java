package example;

public class A020 {

	public static void main(String[] args) {
		// 랜덤 주사위 2개를 던졌을 때 합이 6 나오면 종료하기!

		int game1 = 0;
		int game2 = 0;
		boolean stop = true;
		
		while (stop) {
			game1 = (int)(Math.random()*6)+1;
			System.out.print("◆주사위 :"+game1);
			game2 = (int)(Math.random()*6)+1;
			System.out.println(" ◇주사위 :"+game2);
			
			if (game1+game2 == 6) {
				stop = false;
				System.out.println("주사위의 합이 6입니다. 성공입니다!");
			}
		}
	}

}
