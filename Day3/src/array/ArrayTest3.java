package array;

public class ArrayTest3 {

	public static void main(String[] args) {
    double[] eye = new double[3];
     eye[0] = 1.0;
     eye[1] = 1.2;
     eye[2] = 1.5;
     
     System.out.println(eye[0]); //첫번째 시력값
     System.out.println(eye[eye.length-1]);//마지막 시력값
	}

}
