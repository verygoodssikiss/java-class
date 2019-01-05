package control;

import java.util.Scanner;

public class TestScanner3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 숫자를 입력하세요 : ");
		int num1=sc.nextInt();
		
		System.out.print("두번째 숫자를 입력하세요 : ");
		int num2=sc.nextInt();
		
		if (num1>num2) { System.out.println("첫번째 숫자가 두번째 숫자보다 큽니다.");
			
		} else if (num1<num2) {System.out.println("두번째 숫자가 첫번째 숫자보다 큽니다.");

		} else {System.out.println("첫번째 숫자와 두번째 숫자는 같습니다.");
				
		}
	}
	

}
