package window2;

import java.util.Scanner;

public class MyShop3 {

	public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          System.out.println("첫번째 수를 입력해주세요");
          System.out.print("첫번째 수 :  ");
          int input1 = sc.nextInt();

          System.out.println("두번째 수를 입력해주세요");
          System.out.print("두번째 수 :  ");
          int input2 = sc.nextInt();
          
          Cal2 cal2 = new Cal2();
          
          int result = cal2.myCal(input1, input2);

       	  System.out.println("계산결과는   " + (result*100) + "입니다.");
		
	}

}
