package example;

public class A018 {

	public static void main(String[] args) {
		
		// while문으로 무한 반복문 만든 후,
		// 99까지 출력 되면 종료하기
		
		boolean stop = true;
		int num = 0;
		while (stop) {
			num++;
			System.out.println(num);
			if (num == 99) {
				stop = false;
			}
			
		}

	}

}
