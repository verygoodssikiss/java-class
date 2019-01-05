package control;

import java.util.Scanner;

public class TestScanner5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("음식종류를 선택하세요 1)짬뽕 2)회 3)라면");
	      int food = sc.nextInt(); 
	    //String "짬뽕"을 입력시키면 연산이 되지 않아서 숫자로 변환시켜줘야 하므로 단순히 숫자로 입력값을 지정하고 있음.
	    if (food==1) {System.out.println("중국집으로 가요");
			
		} else if(food==2){ System.out.println("일식집으로 가요");

		} else if(food==3) {System.out.println("분식집으로 가요");
		} else {System.out.println("안먹어요");
		
			}
	

}
}
