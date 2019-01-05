package window2;

public class MyRoom {

	public static void main(String[] args) {
		dog dog = new dog();
		dog.leg =4; //.은 접근연산자라고 한다. 다리는 4개라고 변수값을 입력해준다.
		dog.tail = true;
		
		dog.bark(); //함수는 사용한다고 호출하기만 하면 된다.
		dog.shake();
		
		System.out.println(dog.leg);
		System.out.println(dog.tail);
		
		System.out.println("-------------------------");

	    TV tv1= new TV();
	    tv1.shape ="네모";
	    tv1.stand = true;
	    
	    tv1.turnOn();
	    tv1.change(100);
	    
	    TV tv2= new TV(); //tv1을 만들면 이후 tv2는 복사해서 쉽게 만들 수 있다.
	    tv2.shape ="다이아몬드";
	    tv2.stand = false;
	    
	    tv2.turnOn();
	    tv2.change(200);

	    System.out.println("-----------------");
	    System.out.println(tv1);
	    System.out.println(tv2);
	
	
	
	}

}
