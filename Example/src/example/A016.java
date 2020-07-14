package example;

public class A016 {

	public static void main(String[] args) {
     // 4x + 5y = 60을 만족하는 x와 y값을 구하기!

		
		for (int x = 1; x<=100; x++) {
			for (int y = 1; y<=100; y++) {
				if ((4*x)+(5*y) == 60) {
					System.out.print("x의 값 : "+x+" / ");
					System.out.println("y의 값 : "+y);
				}
			}
		}
	
	
	
	
	
	
	}

}
