package cheerup0701;

import java.util.Scanner;

public class EunbiPractice_001 {

	public static void main(String[] args) {
		int score = 0;
		String grade = "";
		Scanner scann= new Scanner(System.in);
		System.out.print("������ �Է��ϼ��� : ");
		score = scann.nextInt();
		
		if (score<=100) {
		  if (score>=95) {
			grade ="A+";
		  }else if (score>=90) {
			grade ="A";
		  }else if (score>=85) {
			grade = "B+";
		  }else if (score>=80) {
			grade ="B";
		  }else if (score>=75) {
			grade = "C+";
		  }else if (score>=70) {
			grade = "C";
		  }else if (score>=65) {
			grade = "D+";
		  }else if (score>=60) {
			grade = "D";
		  }else {
			grade ="F";	
		  }System.out.println("����� ������ " + grade+" !!");
		}else {System.out.println("�Է� �Ұ�");}
		
		
     scann.close();

	}

}
