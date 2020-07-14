package example;

public class A017 {

	public static void main(String[] args) {

		// 중첩 for문으로 구구단 2~9단 출력하기!

		for (int i = 2; i<=9; i++) {
			for (int j = 1; j<=9; j++) {
				System.out.print(i+"X");
				System.out.print(j+"="+i*j+" ");
			}System.out.println();
		}
	}

}
