package window;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class MyCalculator implements ActionListener{
	//ActionListener(클래스)는 인터페이스(매서드 라는 정의만 되어 있고 내 라고 한다.
						//mothod안에 처리할 내용을 내가 정의한다는 의미.
	static JLabel l1,l2, result ;
	static JTextField t1, t2;
	static JButton plus, minus, mul, div;  //전체적으로 사용할 변수 정의하기.
	
	
	public static void main(String[] args) {
     JFrame f = new JFrame();
     f.setTitle("나의 계산기");
     f.setSize(240, 480);
     l1 = new JLabel("숫자1>>");
     l2 = new JLabel("숫자2>>");
     result = new JLabel("X");
     Font font = new Font("궁서",Font.BOLD, 100);
     result.setFont(font);  
     
     t1 = new JTextField(15); //입력란을 10자로 만든다.
     t2 = new JTextField(15);
     
     plus = new JButton("<<<<<더하기>>>>>");
     minus = new JButton("<<<<<빼기>>>>>");
     mul = new JButton("<<<<<곱하기>>>>>");
     div = new JButton("<<<<<나누기>>>>>");
     plus.setForeground(Color.blue);//버튼 글자(앞부분) 색깔 지정해주기
     plus.setBackground(Color.cyan);//버튼 배경(뒷부분) 색깔 지정해주기
     

     FlowLayout flow = new FlowLayout();
     f.setLayout(flow);
 
     f.add(l1);
     f.add(t1);
     f.add(l2);
     f.add(t2);
     f.add(plus);
     f.add(minus);
     f.add(mul);
     f.add(div);
     f.add(result);
     
     MyCalculator cal = new MyCalculator(); 
     plus.addActionListener(cal);
     minus.addActionListener(cal);
     mul.addActionListener(cal);
     div.addActionListener(cal);
     //먼저 MyCalculator에 임의로 addActionListener의 기능을 심어주고(implement Actionlistener).
     //이후 MyCalculator의 기능을 복사해서 사용하는 cal에 복사하며(new).
     //plus라는 버튼 기능은 addActionListener를 cal에서 정의한다.
     
     f.setVisible(true);
	}


	@Override //overwrite랑 같은 의미.
	public void actionPerformed(ActionEvent e) {
		String n1 = t1.getText(); 
		String n2 = t2.getText(); 
		//모든 프로그램의 입출력은 String이다. 갖고 올 수 있으나 계산은 안된다. 
		int num1 = Integer.parseInt(n1); //new하지 않고도 string을 int로 변경해 줌.
		int num2 = Integer.parseInt(n2); //n2를 분석해서 parse가 분석해줘.라는 의미.
        // 값을 가지고 오는 것은 모든 연산에서 동일한 선행작업이므로 현재 위치 아래이 if를 입력해 준다.
		if(e.getSource()==plus) {
		//System.out.println("두수의 합은  "+ (num1+num2));
		result.setText(num1+num2+""); 
		//""를 붙여준 것은 숫자+스트링은 스티링이라는 속성을 이용하여 최종결과를 string으로 만들기 위한 편법이다.
		}
		if(e.getSource()==minus) {
			//System.out.println("두수의 차은  "+ (num1-num2));
			result.setText(num1-num2+""); 
			}
		if(e.getSource()==mul) {
			//System.out.println("두수의 곱은  "+ (num1*num2));
			result.setText(num1*num2+""); 
			}
		if(e.getSource()==div) {
			//System.out.println("두수의 나누기는  "+ (num1/num2));
			result.setText(num1/num2+""); 
			}
		
		
		
		
	}

}
