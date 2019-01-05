package control;

import java.util.Scanner;

public class TestScanner {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("태어난 연도 : ");
		int year = sc.nextInt(); //모든 입력값은 컴퓨터에서는 String으로 인식하므로 변환하는 절차가 필요하다.
		int age = 2018-year+1;
				if (age >=19) {System.out.println("성인입니다.");
				}
				else {System.out.println("미성년입니다.");}
	
			
		
	}
	

}
