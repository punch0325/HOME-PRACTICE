package example;

public class A022 {

	public static void main(String[] args) {
		//1-2+3-4+5-6+7.....�� ����ؼ� 100 �̻��� �� ��,
		//������ ������ ���ڸ� ���!
		
		int num1 = 0;
		int num2 = 0;
		int sum = 0;
		int m = 1;
		boolean end = true;
		
		do {
			sum+=num2;
			if (sum>=100) {
				end = false;
			}else {
				num1++;
				num2 = m*num1;
				m = -m;
				System.out.println(num2);
			}
		}while(end);
		System.out.println();
		System.out.println("�հ� : "+sum);
		System.out.println("������ �հ� �� : "+num2);

	}

}
