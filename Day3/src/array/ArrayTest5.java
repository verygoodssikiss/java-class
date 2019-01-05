package array;

public class ArrayTest5 {

	public static void main(String[] args) {
		// 배열에 들어갈 값을 미리 알고 있는 경우
		int[] n = {100,200,300}; //{}안에 변수값을 쭉 입력한다.
		System.out.println(n[0]);
		System.out.println(n.length); //length는 배열내 변수의 갯수를 알려준다.
		
		double[] eye = {0.9,0.5,1.5};
		for (int i = 0; i < eye.length; i++) {
			System.out.println(eye[i]);
		//i의 시작점, 언제까지 돌아, 1씩 증가값을 의미	
		// i가 0일때 한번 돌고, 1일때 한번 돌고, 2일때 한번 돌고, 3일때 종료함.
			
		for (double d : eye) {
//배열이름하나 쓰고 배열 인덱스가 하나씩 증가하고 eye의 변수의 갯수까지 반복하는 for의 이용상의 특성을
//이용하여 표준화함. 프린트는  d를 프린트하도록 함.
		System.out.println(d);
		}
		}
	}

}
