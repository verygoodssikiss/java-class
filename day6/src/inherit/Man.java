package inherit;

public class Man extends Person{ //Person을 확장해서 Man을 만들겠다.
	//정적특징 - speed
	int speed;
	
	//동적특징 - run
    public void run() {
		System.out.println("달리다");
	}
}
