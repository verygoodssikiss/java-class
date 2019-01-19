package inherit;

public class MyHome {

	public static void main(String[] args) {
    SuperMan superMan = new SuperMan(); //super라고 변수를 정의하면 예약어라서 사용할 수 없다. superMan으로 변경해서 사용한다.
    superMan.name = "클라크"; //원래 person에 있던 특성이다.
    superMan.age = 100; //원래 person에 있던 특성이다.
    
    superMan.speed = 100; //Man에 있던 특성이다.
    superMan.high = 1000; //Superman에 있던 특성이다.
    
    superMan.smile();
    superMan.run();
    superMan.fly();
    
    
    
		
		
		
	}

}
