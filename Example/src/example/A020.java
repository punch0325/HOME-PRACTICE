package example;

public class A020 {

	public static void main(String[] args) {
		// ���� �ֻ��� 2���� ������ �� ���� 6 ������ �����ϱ�!

		int game1 = 0;
		int game2 = 0;
		boolean stop = true;
		
		while (stop) {
			game1 = (int)(Math.random()*6)+1;
			System.out.print("���ֻ��� :"+game1);
			game2 = (int)(Math.random()*6)+1;
			System.out.println(" ���ֻ��� :"+game2);
			
			if (game1+game2 == 6) {
				stop = false;
				System.out.println("�ֻ����� ���� 6�Դϴ�. �����Դϴ�!");
			}
		}
	}

}
