package inherit; //소속이 제일 위에 들어간다.

public class Person {
//사람이라고 한다면 정적특징, 동적특징을 정의할 수 있다.
	//정적특징 : 이름, 나이(변수)
    String name;
    int age;
    
	//동적특징 : 걸어다니다, 웃다(메소드)
    public void walk() {
    	System.out.println("걷다");
    }
    public void smile() {
    	System.out.println("웃다");
    }
}
