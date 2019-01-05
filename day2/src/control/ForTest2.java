package control;

public class ForTest2 {

	public static void main(String[] args) {
		int sum = 1; //1부터 20까지 곱하기. 초기값을 1로 지정해야 한다.

		for (int i = 1; i <= 5; i++) {
			sum =sum * i; }
			//sum= sum+i 로 지정해주어야 한다.
		System.out.println("1부터 5까지의 곱은"+sum);
		}
	}


