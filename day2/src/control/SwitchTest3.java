package control;

import java.util.Date;
import java.util.Scanner;

public class SwitchTest3 {

		public static void main(String[] args) {
			Date date = new Date(); //일자가 자동으로 입력될 수 있도록 date 기능을 복사해서 가져옴
			
			int month =date.getMonth()+1; //실제 월과 차이점을 보정
			System.out.println(month + "월");
			switch (month) {
			case 2:
				System.out.println("28일까지");
				break;
				
			case 1: case 3: case 5: case 7: case 8: case 10: case 12:
				System.out.println("31일까지");
				break;                       
				
			default :
				System.out.println("30일까지");
				break;   
					
	}
}
}