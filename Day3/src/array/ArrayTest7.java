package array;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class ArrayTest7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] num = new int[5];
		//키보드로 입력받는다. 파일로 입력시는 file로 쓴다.
	//입력받는 단계
		for (int i = 0; i < num.length; i++) {
			System.out.print("점수 입력...>>  "); //점수입력 메시지를 보여준다.
			 num[i] = sc.nextInt(); //숫자를 입력받는다. int[]는 기 정의하였음.
		//5번 입력을 받는다.	
		}
	//출력하는 단계
		for (int n : num) {
			System.out.println("입력된 점수 값 "+n); //입력된 값을 보여준다.
			}
	//개별적으로 변수를 입력해서 비교하면 많은 코딩이 필요하지만, 배열을 이용해서 
	//반복문을 사용하면 간단히 최대값을 구할 수 있다.
		
//찾고싶은 값을 입력받아 위치를 확인하기
		System.out.print("찾고 싶은 값 입력 ");
        int find = sc.nextInt(); //sc의 기능을 활용
        
	//내가 원하는 값을 찾는 실습
		for (int i = 0; i < num.length; i++) {
			if(num[i] == find) {
				System.out.println("당신이 찾는 위치는 "+ (i+1));
				
	//최소값 찾기
		int mini = num[0]; //mini는 쓰레기값을 둘 수 없어서 첫번째 값을 우선 설정한다.
		for (int j = 0; j < num.length; j++) {
			if (num[j] < mini) {
				mini = num[j];
				
			}
		}		
		System.out.println("최솟값은  "+mini);
			}}
	
	//최고값 찾기
			int max = num[0]; //mini는 쓰레기값을 둘 수 없어서 첫번째 값을 우선 설정한다.
			for (int k = 0; k < num.length; k++) {
				if (num[k] > max) {
					max = num[k];
					
				}
			}		
			System.out.println("최고값은  "+max);
				}
			
		}
		



