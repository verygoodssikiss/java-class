package control;

import java.util.Scanner;

public class TestScanner2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 : ");
		String name = sc.next();
	
		System.out.print("나이 : ");
		int age = sc.nextInt();
	
		System.out.print("혈액형 : ");
		String blood = sc.next();
		System.out.print("키 : ");
		int height = sc.nextInt();
	
		System.out.print("몸무게 : ");
		double weight = sc.nextDouble();
		
		System.out.println("내 이름은 "+ name);
		System.out.println("내 나이는 "+ age);
		System.out.println("내 혈액형은 "+ blood);
		System.out.println("내 키는 "+ height);
		System.out.println("내 몸무게는 "+ weight);
		
	}
	

}
