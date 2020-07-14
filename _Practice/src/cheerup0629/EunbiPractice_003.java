package cheerup0629;

public class EunbiPractice_003 {

	public static void main(String[] args) {
	
		int number1, number2 = 0;
		boolean result1;
		
		number1 = 10;
		number2 = 5;
		
		result1 = number1 == number2;
		System.out.println(result1);
		result1 = number1 != number2;
		System.out.println(result1);
		
		String num1, num2 = "";
		num1 = "·ê·ç¶ö¶ó";
		num2 = "·ê·ç¶ö¶ó";
        
		result1 = num2.equals(num1);
		System.out.println(result1);
	}

}
