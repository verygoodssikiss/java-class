package control;

import java.util.Random;

public class RandomTest {

	public static void main(String[] args) {
		// 컴퓨터와 가위 바위 보 게임 만들기. 랜덤 부품 사용하기.
        Random r = new Random();
        int num=r.nextInt(3);//3보다 작은 값을 발생시킴. 0부터 2까지만 발생시킴.
        System.out.println(num);
	}

}
