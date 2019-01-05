package control;

import java.util.Random;

public class RandomTest2 {

	public static void main(String[] args) {
		// 랜덤숫자 10개를 만들어서 모두 더하기.
		int sum=0;
		Random r = new Random();
		for (int i = 0; i < 10; i++) {
			int num=r.nextInt(3);//3보다 작은 값을 발생시킴. 0부터 2까지만 발생시킴.
			System.out.println(num);
			sum = sum+num;
		}
		System.out.println(sum);
	}

}
