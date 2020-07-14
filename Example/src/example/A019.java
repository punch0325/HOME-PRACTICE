package example;

public class A019 {

	public static void main(String[] args) {
		// while문을 이용한 랜덤 주사위 만들기!
		// 단, 6이 나오면 종료하기

		int squre = 0;
		boolean end = true;
				
		while(end) {
			squre = (int)(Math.random()*6)+1;
			System.out.println("숫자 : "+squre);
			
			if (squre == 6) {
				end = false;
				System.out.println("6이 나왔습니다. 종료합니다.");
			}
		}
		
		
		
		
	}

}
