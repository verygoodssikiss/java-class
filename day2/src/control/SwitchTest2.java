package control;

import java.util.Date;
import java.util.Scanner;

public class SwitchTest2 {

		public static void main(String[] args) {
			Date date = new Date(); //일자가 자동으로 입력될 수 있도록 date 기능을 복사해서 가져옴
			int hour = date.getHours();
			int min = date.getMinutes();
			int sec = date.getSeconds();
			int year =date.getYear()+1900;//기준년도를 추가한다.
			int month =date.getMonth()+1; //실제 월과 차이점을 보정
			int day =date.getDay();
			int day2=date.getDate();//일자를 추출한다.
						
			System.out.println(hour + "시");
			System.out.println(min + "분");
			System.out.println(sec + "초");
			System.out.println(year + "년");
			System.out.println(month + "월");
			System.out.println(day2 + "일");
			// System.out.println(day + "일"); //day는 요일의 의미이므로 다른 변수가 필요하다.
			switch (day) {
			case 0:
				System.out.println("일요일");
				break;
			case 1:
				System.out.println("월요일");
				break;
			case 2:
				System.out.println("화요일");
				break;
			case 3:
				System.out.println("수요일");
				break;
			case 4:
				System.out.println("목요일");
				break;
			case 5:
				System.out.println("금요일");
				break;
			default :
				System.out.println("토요일");
				break;
					
	}
}
}