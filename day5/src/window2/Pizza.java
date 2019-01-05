package window2;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Pizza {
	JFrame f;
    JLabel top, count;
    JButton b1, b2, b3;
    JTextField total;
    int sum = 0;
    int combo = 0;
    int potato = 0;
    int bulgogi = 0;
    JTextArea list;
    
public Pizza() { //p하고 ctrl+space
	//1. 부품복사 시작
	f = new JFrame();
	top = new JLabel("자바피자에 오신 것을 환영합니다.");
	count = new JLabel("개수");
	b1 = new JButton("콤보피자");
	b2 = new JButton("포테이토피자");
	b3 = new JButton("불고기피자");
	total = new JTextField(20);
	
	//1. 부품복사 완료
	FlowLayout flow = new FlowLayout();
    f.setLayout(flow);
    list = new JTextArea(3,30); //(3,30) 3줄 30행

    f.add(top);
	f.add(b1);
	f.add(b2);
	f.add(b3);
	f.add(count);
	f.add(total);
	f.add(list);
	
	b1.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
        sum++; //1씩 증가시켜      
		total.setText(sum+"");//sum은 int변수이므로 +""을 처리해주면 string 처리가 되어 작동할 수 있다.	
		combo++;
			list.setText("콤보 개수 "+combo+"개\n" //\n은 엔터의 의미
				 +	"포테이토 개수 "+potato+"개\n"
				 +  "불고기 개수 "+bulgogi+"개"				
					);
			
		}
	});
	
	b2.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			sum++;
			total.setText(sum+"");
			potato++;
			list.setText("콤보 개수 "+combo+"개\n" //\n은 엔터의 의미
					 +	"포테이토 개수 "+potato+"개\n"
					 +  "불고기 개수 "+bulgogi+"개"				
						);
		}
	});

	b3.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			sum++;
			total.setText(sum+"");
			bulgogi++;
			list.setText("콤보 개수 "+combo+"개\n" //\n은 엔터의 의미
					 +	"포테이토 개수 "+potato+"개\n"
					 +  "불고기 개수 "+bulgogi+"개"				
						);
		}
	});
	
    f.setSize(900, 150);


   f.setVisible(true);
}


public static void main(String[] args) {
Pizza p = new Pizza();
	}

}
