package window;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyPicture2 implements ActionListener{

	static JButton b1;  
	static JButton b2; 
	static JLabel img; 
	// 참고로 static을 많이 사용하는 것은 메모리를 많이 사용하므로 좋은 코드가 아니다.
	
	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setTitle("나의 그래픽 프로그램"); 
		f.setSize(500, 500); 
		
		JLabel l = new JLabel("나의 라이온"); 
		JLabel t = new JLabel("사랑스런 나의 라이온"); 
		img = new JLabel(); //반응처리 부분에 적용될 수 있도록 img 변수를 밖으로 빼준다. 
		ImageIcon icon = new ImageIcon("lion.jpg"); 
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow); 
		img.setIcon(icon); 
	    b1 = new JButton("다른 강아지로"); 
	    b2 = new JButton("원래 강아지로"); 
			    
	    MyPicture2 pic = new MyPicture2();
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

	@Override
	public void actionPerformed(ActionEvent e) {
		//getsource는 어디서 정보가 왔는지 확인해주는 메소드임.
		if(e.getSource()==b1) {
			ImageIcon icon1 = new ImageIcon("apitch.jpg");
            img.setIcon(icon1);			
	}
		{
			if(e.getSource()==b2) {
				ImageIcon icon2 = new ImageIcon("lion.jpg");
	            img.setIcon(icon2);	
		}

}}
}