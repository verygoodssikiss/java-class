package window2;

public class TV {
//정적특징(상태)->변수
//모양, 받침대 
String shape;
boolean stand; //받침이 있다 없다.

//동적특징(동작)->메소드
//채널변경하다, TV켜다.
public void change(int ch) { //int의  ch를 넣을 수 있게 된다. ch값을 지정하게 되면 반드시 입력해야 한다.
	System.out.println(ch+ "채널변경하다.");
}
public void turnOn() {
	System.out.println("TV를 켜다");
}
}
