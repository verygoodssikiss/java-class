package window2;

import java.util.Scanner;

public class MyShop2 {

	public static void main(String[] args) {
          int price = 5000;
          Scanner sc = new Scanner(System.in);
          System.out.println("주문하실 인원을 입력해주세요");
          System.out.print("주문 인원 :  ");
          int input = sc.nextInt();
                    
          Cal2 cal2 = new Cal2();
          //직전 실습에서의 cal에는 x+y의 합만 표시하고 끝나므로 합계값을 활용할 수 있도록 별도 변수값에 넣어두어야 한다.
          int sum = cal2.mul(input, price);//cal2에서 계산해서 여기로 리턴됨.리턴된 값을 같은 int 변수인 sum에 넣어줌.
          //if + ctrl + space바 ifelse 선택. 코딩에서 자동완성기능을 많이 활용하여야 한다. 날코딩 지양. 툴반나반.
          if (sum>=20000) {
        	  System.out.println("내실 금액은   " + (sum - 3000) + "원");
			} else {
			  System.out.println("내실 금액은   " + (sum + "원"));
			}
		
	}

}
