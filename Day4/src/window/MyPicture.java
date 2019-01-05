package window;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyPicture implements ActionListener{

	static JButton b1;  //static에서 정의된 변수이므로 맞춰준다.
	static JButton b2; //아무곳에서나 쓸 수 있도록 전체지역으로 변수를 빼준다.
	
	public static void main(String[] args) {
        //1. 틀을 만든다.
		JFrame f = new JFrame();
		f.setTitle("나의 그래픽 프로그램"); //method = 함수
		f.setSize(500, 500); //프레임의 사이즈를 설정한다.
		
		JLabel l = new JLabel("나의 라이온"); //2. 레이블을 만든다.
		JLabel t = new JLabel("사랑스런 나의 라이온"); //추가실습 : 하단에 글자 넣기.
		JLabel img = new JLabel(); //3. 또 다른 레이블을 만든다.
		ImageIcon icon = new ImageIcon("lion.jpg"); //4.이미지를 불러온다.
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow); //f에서 flow를 사용할래.
		img.setIcon(icon); //이미지라는 레이블에 아이콘을 끼워넣은 것임.
	    b1 = new JButton("나를 누르세요"); //버튼을 만든다.
	    b2 = new JButton("또 나를 누르세요"); //버튼을 만든다.
		// 버튼만 반응처리할 거라고 지정한다.addActionListener를 만들어 준다.()안에는 반응 처리할
	    // 것을 입력해준다.
	    
	    MyPicture pic = new MyPicture();
	    b1.addActionListener(pic);
	    b2.addActionListener(pic);
			
		f.add(l);
		f.add(img);
		f.add(t);
		f.add(b1);
		f.add(b2);
		
		f.setVisible(true); 
				//f를 보이도록 한다. true로 해야지 보인다. visible은 항상 맨끝에 위치하도록 한다.
		
								
	}

	@Override //재정의해서 사용했다는 의미임.
	public void actionPerformed(ActionEvent e) {
		//getSource는 어디서 정보가 왔는지 확인해주는 메소드임.
		if(e.getSource()==b1) {
        System.out.println("나를 눌렀군요");		
	}
		{
			if(e.getSource()==b2) {
	        System.out.println("나를 또또 눌렀군요");		
		}

}}
}