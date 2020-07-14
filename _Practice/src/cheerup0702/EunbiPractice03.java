package cheerup0702;

public class EunbiPractice03 {

	public static void main(String[] args) {

		System.out.println("▼▽로또 번호 자동 추출▽▼");

		int lotto1 = 0;
		int lotto2 = 0;
		int lotto3 = 0;
		int lotto4 = 0;
		int lotto5 = 0;
		int lotto6 = 0;
		lotto1 = (int) (Math.random() * 45) + 1;
		lotto2 = (int) (Math.random() * 45) + 1;
		lotto3 = (int) (Math.random() * 45) + 1;
		lotto4 = (int) (Math.random() * 45) + 1;
		lotto5 = (int) (Math.random() * 45) + 1;
		lotto6 = (int) (Math.random() * 45) + 1;
		System.out.print(" " + lotto1);
		System.out.print(" " + lotto2);
		System.out.print(" " + lotto3);
		System.out.print(" " + lotto4);
		System.out.print(" " + lotto5);
		System.out.print(" " + lotto6);

	}

}
