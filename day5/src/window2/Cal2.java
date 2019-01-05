package window2;

public class Cal2 {

	public void add(int x, int y) { 
		System.out.println("두 수의 합은"+ (x + y)); 
	}	
	
	public void minus(int x, int y) { 
    	System.out.println("두 수의 차는"+ (x - y));
	}
    
	public int mul(int x, int y) { //mul만 반환이 있는 형태로 수정함.
           return x*y;//x*y값을 넘겨주세요.라는 의미
	} 	
	
   	public void div(int x, int y) { 
    	System.out.println("두 수의 나눗셈은"+ (x / y));
	}
   	
   	public int myCal(int x, int y) {
   		return x + y + 100; // =을 사용하지 않는다.
   	}
}
