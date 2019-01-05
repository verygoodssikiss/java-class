package array;

public class ArrayTest2 {

	public static void main(String[] args) {
     String[] names = new String[5]; //"names는 String 배열 타입 변수다." 라는 의미
     names[0] = "김아무개";
     names[1] = "박아무개";
     names[2] = "송아무개";
     names[3] = "정아무개";
     names[4] = "이아무개";
     
     System.out.println(names.length); //몇개 변수인가.
     System.out.println(names[names.length-1]); 
     //마지막값(위치값)을 찍고 싶으면 전체갯수에서 마지막의 위치를 찾는다.
     //0에서 시작하므로 전체갯수에서-1을 해준다. 
	}

}
