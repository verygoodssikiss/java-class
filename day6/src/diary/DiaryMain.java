package diary;

import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DiaryMain extends JFrame {
	private JTextField id;
	private JTextField pw;

	public DiaryMain() {
		getContentPane().setBackground(Color.ORANGE);
		//컨트롤+시프트+f(자동정리)
		setTitle("나의 일기장 시작화면");
		setSize(700,800);
		
		FlowLayout flow = new FlowLayout();
		getContentPane().setLayout(flow);
		
		JLabel label = new JLabel("아이디 : ");
		label.setFont(new Font("굴림", Font.BOLD, 16));
		getContentPane().add(label);
		
		id = new JTextField();
		getContentPane().add(id);
		id.setColumns(20);
		
		JLabel lblNewLabel_1 = new JLabel("패스워드 : ");
		lblNewLabel_1.setFont(new Font("굴림", Font.BOLD, 16));
		getContentPane().add(lblNewLabel_1);
		
		pw = new JTextField();
		getContentPane().add(pw);
		pw.setColumns(20);
		
		JButton login = new JButton("로그인");
		login.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String sId = "admin";
				String sPw = "1234";
				String gId = id.getText();
				String gPw = pw.getText();
				//String은 기초형이 아니므로 = 을 사용할 수 없다.
				if ((sId.equals(gId)) && (sPw.equals(gPw)) ) {
					JOptionPane.showMessageDialog(null, "로그인 ok");
					DiarySecond my = new DiarySecond();
					
				} else {
					JOptionPane.showMessageDialog(null, "로그인 not입니다. 재입력해주세요.");

				}
			}
		});
		login.setFont(new Font("굴림", Font.BOLD, 16));
		getContentPane().add(login);
		
		JButton reset = new JButton("리셋");
		reset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				id.setText("");
				pw.setText("");
			}
		});
		reset.setFont(new Font("굴림", Font.BOLD, 16));
		getContentPane().add(reset);
		
		JLabel lblNewLabel = new JLabel("");
		getContentPane().add(lblNewLabel);
		
		ImageIcon icon = new ImageIcon("일기장.png");
		lblNewLabel.setIcon(icon);
		
		setVisible(true);
	}
	
	
	public static void main(String[] args) {
		DiaryMain diary = new DiaryMain();
	}

}
