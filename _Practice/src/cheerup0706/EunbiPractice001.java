package cheerup0706;

public class EunbiPractice001 {

	public static void main(String[] args) {
		// 중첩 for문으로 구구단 만들기~!
		
		for (int i = 2 ; i <10; i++) {
			for (int j = 1; j <10; j++) {
				System.out.print(" "+i+"X");
				System.out.print(j);
			    System.out.print("="+i*j );
			}System.out.println("  \n");
		}

		
	}

}
