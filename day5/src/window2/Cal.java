package window2;

public class Cal {

	public void add(int x, int y) { //이 add 함수는 반드시 2개의 변수값이 들어와야 한다.
		System.out.println("두 수의 합은"+ (x + y)); //()를 넣어 x+y에 우선순위를 부여한다.
	}	
	
	public void minus(int x, int y) { 
    	System.out.println("두 수의 차는"+ (x - y));
	}
    
	public void mul(int x, int y) { 
    	System.out.println("두 수의 곱은" + (x * y));
	} 	
	
   	public void div(int x, int y) { 
    	System.out.println("두 수의 나눗셈은"+ (x / y));
	}
}
