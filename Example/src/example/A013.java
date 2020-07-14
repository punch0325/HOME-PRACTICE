package example;

public class A013 {

	public static void main(String[] args) {
		// 1~100사이의 3과 5의 공배수를 구하기

		for (int i = 1; i<=100; i++) {
			if (i % 3 == 0) {
				if (i % 5 == 0) {
					System.out.println(i);
				}
			}
		}
		
		
		
		
	}

}
