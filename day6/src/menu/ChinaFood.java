package menu;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
//ctrl + shift+ o(영문 오) 자동완성때 자동완성이 되지 않았을때 본 단축기를 실행시킨다.
public class ChinaFood extends JFrame{
	private JTextField textField; //자바는 하나 상속하면 2개 상속은 불가하다.
	private JTextField textField_1;
    
	int count = 0; //전체 짬뽕,짜장면의 카운트를 저장할 수 있는 변수를 class { 아래 지정해 준다. 
	final int price = 5000; //final을 붙이므로 변수가 변하지 않도록 막아준다.
	JLabel label;
	
	public ChinaFood() {
		getContentPane().setBackground(Color.YELLOW);
	 setSize(800,600);
	 setTitle("주문하세요...");
	 
	 ImageIcon icon = new ImageIcon("중국집.png"); //string은 " "를 사용한다.
	 
	 
     FlowLayout flow = new FlowLayout(); 
     //레이아웃이 물흐르듯이 되어야 하는데 이미 JFrame이 상속되었으므로 2개를 동시에 상속할 수 없어 Flow는 복사하여 사용한다.
     getContentPane().setLayout(flow);
     
     JButton btnNewButton = new JButton("짜장면");
     btnNewButton.addActionListener(new ActionListener() {
     	public void actionPerformed(ActionEvent e) {
     		count++; //count를 1씩 증가시킨다.
     		textField.setText(count+""); //+""를 추가하여 int를 String으로 변환한다.
     		textField_1.setText(count*price+"");
     		ImageIcon icon2 = new ImageIcon("짜장면.png"); //string은 " "를 사용한다.
     		label.setIcon(icon2);
     		
     	}
     });
     btnNewButton.setBackground(Color.YELLOW);
     btnNewButton.setForeground(Color.BLUE);
     btnNewButton.setFont(new Font("SansSerif", Font.PLAIN, 15));
     btnNewButton.setToolTipText("짜장면 하나가 추가됨");
     getContentPane().add(btnNewButton);
     
     JButton btnNewButton_1 = new JButton("우동");
     btnNewButton_1.addActionListener(new ActionListener() {
     	public void actionPerformed(ActionEvent e) {
     		count++; //count를 1씩 증가시킨다.
     		textField.setText(count+""); 
     		textField_1.setText(count*price+"");
     		ImageIcon icon2 = new ImageIcon("우동.png"); //string은 " "를 사용한다.
     		label.setIcon(icon2);
     	}
     });
     btnNewButton_1.setFont(new Font("맑은 고딕", Font.PLAIN, 16));
     btnNewButton_1.setForeground(Color.GREEN);
     btnNewButton_1.setToolTipText("우동을 추가함.");
     getContentPane().add(btnNewButton_1);
     
     JButton button = new JButton("짬뽕");
     button.addActionListener(new ActionListener() {
     	public void actionPerformed(ActionEvent e) {
     		count++; //count를 1씩 증가시킨다.
     		textField.setText(count+""); 
     		textField_1.setText(count*price+"");
     		ImageIcon icon2 = new ImageIcon("짬뽕.png"); //string은 " "를 사용한다.
     		label.setIcon(icon2);
     	}
     });
     button.setFont(new Font("맑은 고딕", Font.PLAIN, 16));
     button.setToolTipText("짬뽕을 하나 추가함.");
     getContentPane().add(button);
     
     JLabel lblNewLabel = new JLabel("개수");
     lblNewLabel.setForeground(Color.RED);
     lblNewLabel.setFont(new Font("맑은 고딕", Font.BOLD, 16));
     lblNewLabel.setToolTipText("개수를 표시함");
     getContentPane().add(lblNewLabel);
     
     textField = new JTextField();
     getContentPane().add(textField);
     textField.setColumns(10);
     
     JLabel lblNewLabel_1 = new JLabel("금액");
     getContentPane().add(lblNewLabel_1);
     
     textField_1 = new JTextField();
     getContentPane().add(textField_1);
     textField_1.setColumns(10);
     
     label = new JLabel();
     getContentPane().add(label);
     label.setIcon(icon);
     
          
     
	
     setVisible(true);
	
	}
	
	
	
	public static void main(String[] args) {
//static안에 코드를 집어넣으면 실행하려는 것들도 모두 static이 되어야 한다. <- 골치아프다. 메모리를 많이 사용한다. 모든 것을 static으로 사용하는 것은 힘들다.
		ChinaFood china = new ChinaFood();
		
		
		
	}

}
