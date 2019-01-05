package control;

public class ForTest {

	public static void main(String[] args) {
		int sum = 0; //누적을 위해서 별도의 변수를 지정해줘야 한다. 그리고 값을 비워두면 안되므로 0을 입력해준다.
		//변수값 상태의 경우의 수
		// 1) 값을 넣지 않았을 때(쓰레기값 : 이전 프로그램이 사용하던 이상한 값이 들어가 있음.)
        // 2) 초깃값을 넣어줬을 때
        // 3) 변경된 값이 들어갔을 때 -> 변수값을 주의해서 살펴보아야 함.

		for (int i = 1; i <= 1000; i++) {
			sum =sum + i; }
			//만약에 SUM+I로만 표현한다면 첫번째 연산시의 SUM의 값은 저장되지 않고 0+1인 상태이다. 그래서 sum으로 입력될 수 있게
			//sum= sum+i 로 지정해주어야 한다.
		System.out.println("1부터 1000까지의 합은"+sum);
		}
	}


