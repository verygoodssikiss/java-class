package control;

import java.util.Scanner;

public class TestScanner6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("음식종류를 선택하세요 1)짬뽕 2)회 3)라면");
		int food=sc.nextInt();
		switch(food) {
		case 1: 
			System.out.println("중국집으로 가요");//콜론 사용
			break; //브레이크를 걸어줘야 이후 내용이 출력되지 않는다.
		case 2: 			
			System.out.println("일식집으로 가요");
			break;
		case 3: 
			System.out.println("분식집으로 가요");
			break;
		default: //마지막 else에 해당하는 제어문
			System.out.println("안먹어요");
			break;
		}
	

}
}
