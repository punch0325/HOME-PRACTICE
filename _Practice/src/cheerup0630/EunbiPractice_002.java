package cheerup0630;

public class EunbiPractice_002 {

	public static void main(String[] args) {
	
		int plus01, plus02, plusR=0;
		plus01 = 500;
		plus02 = 50;
		
		plusR = plus01++ * --plus02;
		System.out.println(plusR);//24500
		System.out.println(plus01);//501
		System.out.println(plus02);//49
		
		plusR = --plus01 / ++plus02;
		System.out.println("\n"+plusR);//10
		System.out.println(plus01);//500
		System.out.println(plus02);//50
		
		plusR = plus01++ + plus02--;
		System.out.println("\n"+plusR);//550
		System.out.println(plus01);//501
		System.out.println(plus02);//49
	}

}
