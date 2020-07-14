package example;

public class A014 {

	public static void main(String[] args) {
		// 짝수를 제외한 1~100까지의 합
		
		int sum = 0;
		for (int i = 1; i<=100; i++) {
			if (i % 2 != 0) {
				sum+=i;
				if (i<99) {
					System.out.print(i+"+");
				}else {
					System.out.println(i+"=");
				}
			}
		}System.out.println(sum);
		
		
		
		
		
		
		
		
		
	}

}
