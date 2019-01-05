package array;

import java.util.Scanner;

public class Movie {

	public static void main(String[] args) {
		int[] seat = new int[10]; 
		//무한루프 밖에 있으므로 처음에만 0의 값을 갖게 되고 이후에는 루프안에서 갖게 된 값이 표시된다.
		Scanner sc = new Scanner(System.in); // 좌석번호를 입력해야 하므로 Scanner 기능을 불러온다.
		// new 부분은 반복되지 않도록 제일 위로 올려준다.
		// 예매를 계속 무한 반복으로 실행시켜주기 위해서 while(true)를 이용한다.
		while (true) {
			System.out.println("----------------------");
			for (int i = 0; i < seat.length; i++) {
				System.out.print(" " + (i + 1));

			}
			System.out.println(); // 한줄을 구분짓기위해서 본 명령어를 추가로 입력해준다.
			System.out.println("----------------------");
			// 예매상태 찍어주기
			for (int i = 0; i < seat.length; i++) {
				System.out.print(" " + seat[i]);
			}
			// 좌석 예매하기
			System.out.println(); // 한줄을 구분짓기위해서 본 명령어를 추가로 입력해준다.
			System.out.println(); // 한줄을 구분짓기위해서 본 명령어를 추가로 입력해준다.
			System.out.print("예매하고 싶은 좌석번호를 입력하세요");
			System.out.println("종료는 0을 입력하세요");
			System.out.println(); // 한줄을 구분짓기위해서 본 명령어를 추가로 입력해준다.
			System.out.print("좌석번호  ");
			int number = sc.nextInt();
			if (number == 0) {
				System.out.println("프로그램을 종료하겠습니다.");break;
			}
			if (seat[number - 1] == 0) {
				System.out.println("예매가능한 자리입니다.");
				System.out.println("예매를 진행하겠습니다.");
				seat[number - 1] = 1;
				System.out.println("예매 완료되었습니다.");

			} else {
				System.out.println("이미 예약된 자리입니다.");
				System.out.println("다른 자리를 입력해주세요.");
			}
		}

	}
}// 맨 마지막에서 ctrl+shift+f 를 누르면 코딩을 정리해준다.
