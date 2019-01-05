package window2;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class MyAge {
	
	JFrame f; //선언. 이걸 사용할 거야. 선언의 위치가 사용할 수 있는 범위임. 선언을 포함하는 중간괄호안에서 다사용할 수 있음.
              //선언의 역할은 메모리 준비를 뜻함.

	JLabel top, name, year, age, result;
	JButton confirm;
	JTextField n,y,a; //이름 연령 나이를 입력받는 텍스트 필드를 사용함.
	
	public MyAge() {
   
	f= new JFrame(); //위에 JFrame f;를 사용했으므로 아래에서는 사용하지 않는다.
    f.setSize(280, 200);
    top = new JLabel("<<<<<<성인인증 프로그램입니다>>>>>>");
    name = new JLabel("이름");
    year = new JLabel("생년");
    age = new JLabel("나이");
    result = new JLabel();
    confirm = new JButton("인증");
    n=new JTextField(20);
    y=new JTextField(20);
    a=new JTextField(20);

    FlowLayout flow = new FlowLayout();
    f.setLayout(flow); //folw를 셋팅하는 기능은 f에 있음.
    
    f.add(top);
    f.add(name);
    f.add(n);
    f.add(year);
    f.add(y);
    f.add(age);
    f.add(a);
    f.add(confirm);
    f.add(result);
    
    result.setForeground(Color.BLUE);
    top.setForeground(Color.BLUE);
    confirm.setForeground(Color.green);    
    confirm.setBackground(Color.yellow);    
    
    confirm.addActionListener(new ActionListener() { //confirm에 반응 처리를 붙여(addActionListener) 
    	//new ActionListener + ctrl + space 하여 Actionlistener를 선택하면 @Override가 자동으로 완성된다.
		//이후 이벤트 처리할 것은 actionPerformed에 입력하면 된다.
		@Override
		public void actionPerformed(ActionEvent e) {
          String name = n.getText(); //입력한 값을 가져와서 name에 넣어준다. 그냥 가져오므로 ()에 값이 없다.
          result.setText(name + "님"); //입력한 값은 result에 setText로 넣어주기. name을 가져오므로 ()에 값이 있다.
          String year = y.getText();
          int yearInt = Integer.parseInt(year); //분석해서 year를 int로 변환하라.
          int age = 2019 - yearInt + 1;
          a.setText(age+"");
          
          if (age>=10) {
        	  result.setText(name + "님은 성인");
			
		} else { 
              result.setText(name + "님은 미성인");

		}
          //위의 name, age는 위에서도 정의되었으나 actionperformed에서 정의해 주었으므로 이 안에서만 사용 가능하다.
          
		}
	});
    
    f.setVisible(true);
     
     
		
	}

	public static void main(String[] args) {
		MyAge myage = new MyAge(); //앞의 Myage는 타입, 뒤의 new Myage()는 상기의 메소드임.
	}

}
