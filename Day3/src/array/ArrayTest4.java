package array;

public class ArrayTest4 {

	public static void main(String[] args) {
		// 배열에 들어갈 값을 미리 알고 있는 경우
	   String[] fname = {"미진","영수","영희"};
	     
		for (String d : fname) {
			
		
		System.out.println(d);}
		
		//----------------------------------------------
		int[] m = new int[100];
		m[0] = 100;
		m[54] = 200;
		m[99] = 300;
		System.out.println(m.length);
		System.out.println(m[0]);
		System.out.println(m[54]);
		System.out.println(m[99]);
		System.out.println(m[0]+" "+m[54]+" "+m[99]);
		//+연산자가 ","를 대신해서 사용할 수 있다.
		
		//-----------------------------------------------
		String[] c = new String[100];
		c[0] = "hello";
		c[1] = "java";
		c[c.length-1] ="spring";
		System.out.println(c[0]);
		System.out.println(c[1]);
		System.out.println(c[c.length-1]);
		//+연산자가 ","를 대신해서 사용할 수 있다.
		
		}
}



