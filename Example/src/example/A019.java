package example;

public class A019 {

	public static void main(String[] args) {
		// while���� �̿��� ���� �ֻ��� �����!
		// ��, 6�� ������ �����ϱ�

		int squre = 0;
		boolean end = true;
				
		while(end) {
			squre = (int)(Math.random()*6)+1;
			System.out.println("���� : "+squre);
			
			if (squre == 6) {
				end = false;
				System.out.println("6�� ���Խ��ϴ�. �����մϴ�.");
			}
		}
		
		
		
		
	}

}
