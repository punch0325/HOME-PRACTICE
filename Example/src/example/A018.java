package example;

public class A018 {

	public static void main(String[] args) {
		
		// while������ ���� �ݺ��� ���� ��,
		// 99���� ��� �Ǹ� �����ϱ�
		
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
