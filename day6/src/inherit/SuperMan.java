package inherit;

public class SuperMan extends Man{ //superman은 기본적으로 man의 정적,동적특징 각 3개씩을 기본적으로 상속받는다.
	//정적특징 - high
	int high;
	
	//동적특징 - fly
    public void fly() {
    	run(); //이미 상속받아 사용할 수 있다.
    	System.out.println("날다");
    }
}
