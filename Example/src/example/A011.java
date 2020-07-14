package example;

import java.util.Scanner;

public class A011 {

	public static void main(String[] args) {
		// scanner와 for문을 이용한 구구단 자동 출력기

		Scanner scan = new Scanner(System.in);
		int num1 = 0;
		int num2 = 0;
		int num3 = 0;
		
		System.out.print("구구단 : ");
	    num2 = scan.nextInt();
	    
	    scan.close();
	    
	    for(num1 = 1; num1 <= 9; num1++) {
	    	num3=num1*num2;
	    	System.out.println(num2+"x"+num1+"="+num3);
	    }
		
		
		
		
		
		
	}

}
