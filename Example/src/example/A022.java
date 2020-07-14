package example;

public class A022 {

	public static void main(String[] args) {
		//1-2+3-4+5-6+7.....을 계산해서 100 이상이 될 때,
		//계산식의 마지막 숫자를 출력!
		
		int num1 = 0;
		int num2 = 0;
		int sum = 0;
		int m = 0;
		boolean end = true;
		
		do {
			
			sum+=num1;
			if(sum >= 100) {
				end = false;
				System.out.println(num1);
			}
		}while(end);
		
		
		

	}

}
