package cheerup0707;

public class EunbiPractice1 {

	public static void main(String[] args) {
		// while 문으로 무한 반복문 
		// 59까지 출력 후 종료하기
		
		int i = 1;
		boolean stop = true;
		while (stop) {
			System.out.println(i);
		    if (i == 59) {
		    	stop = false;
		    }
		    i++;
		}

	}

}
