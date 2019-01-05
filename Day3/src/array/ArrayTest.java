package array;

public class ArrayTest {

	public static void main(String[] args) {
		int[] n = new int[100]; 
		n[0] = 100;
		n[1] = 200;
		n[99] = 900; //입력되지 나머지 변수에는 
		System.out.println(n[0]); //n[0]변수에 있는 값이 표시된다.
		System.out.println(n[1]); //n[0]변수에 있는 값이 표시된다.
		System.out.println(n[99]); //n[0]변수에 있는 값이 표시된다.
		System.out.println(n[88]); //n[0]변수에 있는 값이 표시된다.
	}

}
