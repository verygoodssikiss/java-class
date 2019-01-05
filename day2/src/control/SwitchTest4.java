package control;

import java.util.Date;
import java.util.Scanner;

public class SwitchTest4 {

		public static void main(String[] args) {
			Date date = new Date(); //일자가 자동으로 입력될 수 있도록 date 기능을 복사해서 가져옴
			
			int month =date.getMonth()+1; //실제 월과 차이점을 보정
			System.out.println(month + "월");
			switch (month) {
			case 11: case 12: case 1: case 2: //case는 옆으로 붙일 수 있다.
				System.out.println("겨울");
				break;                        //여러달을 묶어서 정의하므로 브레이크를 적절히 활용하여 간결한 코딩할 수 있다.   
			case 3:  case 4:  case 5: case 6:
				System.out.println("봄");
				break;
			case 7:  case 8:  case 9: case 10:
				System.out.println("여름");
				break;
						default :
				System.out.println("가을");
				break;   
					
	}
}
}