package example;

public class A010 {
	
	public static void main(String[] args) {
		// 1 ~ 10까지 합하고 
		// 1+2+3+4+5+6+7+9+10=55 형태로 출력하기
		
		int i = 0;
		int sum = 0;
		for (i = 1 ; i <= 10; i++) {
			sum+=i;
			if (i<10) {
				System.out.print(i+"+");
			
			}else {
				System.out.print(i+"=");
			}
		}System.out.print(sum);

	}

}
