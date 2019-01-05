package window;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyDog {

	public static void main(String[] args) {
			JFrame f = new JFrame(); //JFrame은 기본값이 안보이는 것으로 되어 있다.
			f.setSize(600,600);//f.을 찍으면 하위 기능이 표시된다. setsize이하는 가로세로 크기임.
			JLabel l = new JLabel(); //레이블을 만든다.
			ImageIcon icon = new ImageIcon("lion.jpg"); //준비한 이미지 아이콘을 집어 넣는다.
			l.setIcon(icon);
			f.add(l); //레이블의 위치를 잡아준다.			
				
			
			
			
			f.setVisible(true);
	}

}
