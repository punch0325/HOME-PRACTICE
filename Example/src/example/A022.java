package example;

public class A022 {

	public static void main(String[] args) {
		//1-2+3-4+5-6+7.....�� ����ؼ� 100 �̻��� �� ��,
		//������ ������ ���ڸ� ���!
		
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
