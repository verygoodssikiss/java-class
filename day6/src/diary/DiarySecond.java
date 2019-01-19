package diary;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.JTextArea;
import java.awt.Font;

public class DiarySecond extends JFrame {
	private JTextField notext;
	private JTextField titleText;

	public DiarySecond() {
		setTitle("나의 일기장 입력화면");
		setSize(400, 600);
		getContentPane().setLayout(null); // flowlayout대신 absolutelayout을 이용하였음.

		JLabel label = new JLabel("");
		label.setBounds(26, 10, 207, 199);
		label.setIcon(new ImageIcon("C:\\Users\\pc\\Downloads\\일기장2.png"));
		getContentPane().add(label);

		JLabel no = new JLabel("번호");
		no.setBounds(26, 249, 56, 15);
		getContentPane().add(no);

		notext = new JTextField();
		notext.setBounds(116, 246, 252, 21);
		getContentPane().add(notext);
		notext.setColumns(10);

		JLabel lblNewLabel = new JLabel("제목");
		lblNewLabel.setBounds(26, 284, 56, 15);
		getContentPane().add(lblNewLabel);

		titleText = new JTextField();
		titleText.setBounds(116, 281, 252, 21);
		getContentPane().add(titleText);
		titleText.setColumns(20);

		JLabel lblNewLabel_1 = new JLabel("내용");
		lblNewLabel_1.setBounds(26, 319, 37, 15);
		getContentPane().add(lblNewLabel_1);
		
		JTextArea contentText = new JTextArea();
		contentText.setFont(new Font("맑은 고딕", Font.PLAIN, 13));
		contentText.setBounds(112, 315, 256, 236);
		getContentPane().add(contentText);


		JButton save = new JButton("일기저장");
		save.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String noT = notext.getText();
				String titleT = titleText.getText();
				String contentT = contentText.getText();
				//컨트롤+알트+화살표아래(복사 : 블록안잡고)
				//컨트롤+C, 컨트롤+V(복사 : 블록잡고)
				//ctrl+shift+f(format) : 문법적으로 이상이 없을 경우 코딩을 정리해준다.
				try {
					FileWriter f = new FileWriter("c:/diary/" + noT + ".txt");
					//url인 경우 URL url =new URL("http://www.kb.com"); 처럼 컴퓨터에 알려줘야 한다.
					//IPAddress("210.12.88.7");
					
					f.write(noT+"\r\n"); //f파일에 써주기를 시작한다.(스트림(stream)을 만든다.)
					f.write(titleT+"\r\n"); //f파일에 써주기를 시작한다.(스트림(stream)을 만든다.)
					f.write(contentT+"\r\n"); //f파일에 써주기를 시작한다.(스트림(stream)을 만든다.)
					f.flush();//"ok"까지만 쓰고 나머지는 다 밀어버려. 더 채우지 않는다는 의미.
					f.close();//stream을 종료한다. close를 하지 않으면 stream이 남아있게 된다.

					//입력후 입력란 지우기
					notext.setText("");
					titleText.setText("");
					contentText.setText("");
					
					
					JOptionPane.showMessageDialog(null, "저장완료");//저장후 저장완료 메시지 표시함.
	
					
				} catch (Exception e2) {
					JOptionPane.showMessageDialog(null, "저장중 에러가 발생하였습니다.");//저장후 저장완료 메시지 표시함.
				
				}
				// file프로그램을 이용하여 드라이브, 폴더를 인식시켜준다.
				// 이후 FileWriter를 이용하여 쓸 수 있도록 만들어 준다.
				// noT를 결합하여 파일을 만들어 준다.
				// try catch문을 이용하여 에러에 대한 처리를 한다.

			}
		});
		save.setBounds(272, 207, 96, 23);
		getContentPane().add(save);

		JButton read = new JButton("일기읽기");
		read.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String noT = notext.getText(); 
				try {
					FileReader f2 = new FileReader("c:/diary/"+noT+".txt"); //c: -> c드라이버 /-> 그 아래
					BufferedReader reader = new BufferedReader(f2);
					String noR = reader.readLine();
					String titleR = reader.readLine();
					String contentR = reader.readLine();
					
					notext.setText(noR); //읽어온 값을 텍스트필드에 표시함.
					titleText.setText(titleR);
					contentText.setText(contentR);
					
					//읽어온 값의 차이를 두기 위해 글자색을 변경시킴.
					notext.setForeground(Color.RED);
					titleText.setForeground(Color.BLUE);
					contentText.setForeground(Color.CYAN);
					
					//BufferedReader는 stream으로 연결된 파일을 통째로 가져오는 부품임.
					JOptionPane.showMessageDialog(null, "파일읽기 성공.");//저장후 저장완료 메시지 표시함.
				
				} catch (Exception e2) { 
			//Exception은 그 외의 경우를 모두 잡아주겠다는 뜻. 혹시 filenotfound로 표시되는 경우 그보다 제한적으로 잡아주겠다는 뜻임.
					JOptionPane.showMessageDialog(null, "파일읽기 실패.");//저장후 저장완료 메시지 표시함.
				}
				//읽어올 수 있는 강물을 만듦.
				
			}
		});
		read.setBounds(272, 174, 96, 23);
		getContentPane().add(read);

		
		setVisible(true);

	}

	public static void main(String[] args) {
		DiarySecond diary2 = new DiarySecond();
	}
}
