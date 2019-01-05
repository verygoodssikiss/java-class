package control;

import java.util.Scanner;

public class IfTest3 {

	public static void main(String[] args) {
	 
		Scanner sc = new Scanner(System.in); 
		System.out.print("아이디 입력해주세요.>>");
		int input1 = sc.nextInt(); //스캐너에 있는 nextInt라는 기능을 이용함.
		System.out.println("당사의 입력한 아이디는 "+input1+"입니다.");
		// 패스워드 입력
		System.out.print("패스워드를 입력해주세요.>>");
		int input2 = sc.nextInt();
		System.out.println("당신의 입력한 아이디는 " +input2+"입니다.");
		
	    if(input1 == 1000 && input2==2500) {System.out.println("로그인ok");}
		else { System.out.println("로그인not");}
		
	}

}
