package window2;

public class dog {
//	※ 강아지를 객체로 볼 경우 
//	- 정적특징(상태) : 꼬리가 있다. 다리갯수는 4개다. =>변수로 만든다.
	
	boolean tail;
	int leg;
	
//	- 동적특징(동작) : 짖다, 꼬리를 흔든다. => 함수(메소드)로 만든다.
	public void bark() { //bark다음에 ()괄호가 있어야 함수로 인지한다.
		//처리되는 내용을 중괄호 아래에 넣는다. 
		System.out.println("멍멍!!");
	}
	
	public void shake() {
		System.out.println("꼬리를 막 흔들다");
	}
	}


