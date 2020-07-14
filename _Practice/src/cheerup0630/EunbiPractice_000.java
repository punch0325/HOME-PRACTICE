package cheerup0630;

public class EunbiPractice_000 {

	public static void main(String[] args) {
		//대입 연산자 연습
		
		String local_01 = "";
		String local_02 = "";
		
		local_01 = "안녕하세요  ~   ";
		local_02 = "김은비 입니다.";
		
		local_01+=local_02;
		System.out.println(local_01);
		System.out.println(local_02);
		
		int variable1, variable2 = 0;
		variable1 = 30;
		variable2 = 20;
		
		variable1 += variable2;
		System.out.println(variable1);//50
		System.out.println(variable2);//20
		
		variable1 -= variable2;
		System.out.println(variable1);//30
		System.out.println(variable2);//20
		
		variable1 *= variable2;
		System.out.println(variable1);//600
		System.out.println(variable2);//20
		
		variable1 /= variable2;
		System.out.println(variable1);//30
		System.out.println(variable2);//20
		
		variable1 %= variable2;
		System.out.println(variable1);//10
		System.out.println(variable2);//20
		
		
		

	}

}
