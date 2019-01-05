package window;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Game implements ActionListener{

	JButton s,r,p;
	JFrame f;
	
	
	public Game() {
    f = new JFrame();
    f.setTitle("나의 가위바위보");
    f.setSize(500, 500);
    
    s=new JButton();
    r=new JButton();
    p=new JButton();
   
	ImageIcon icon1 = new ImageIcon("ssisor.png");
	ImageIcon icon2 = new ImageIcon("rock.png");
	ImageIcon icon3 = new ImageIcon("paper.png");
	
	s.setIcon(icon1);
	r.setIcon(icon2);
	p.setIcon(icon3);

	FlowLayout flow = new FlowLayout();
	f.setLayout(flow);
	
	f.add(s);
	f.add(r);
	f.add(p);
	
	//Game game = new Game();
	s.addActionListener(this);
	r.addActionListener(this);
	p.addActionListener(this);
	
	f.setVisible(true);
	
	}
	//시작하려고 만든 부분
	public static void main(String[] args) {
		 new Game();
	}

	
	//처리하려고 만든 부분
	@Override
	public void actionPerformed(ActionEvent e) {
        
		Random random = new Random();
		int computer = random.nextInt(3); 
		//3을 포함하지 않는 0,1,2 를 발생시킴. 0:가위, 1:바위, 2:보
		
		if(e.getSource()== s ) {//내가 가위		
			if(computer == 0 ) {//컴퓨터가 가위
			f.setTitle("비겼음");
			if(computer == 1 ) {//컴퓨터가 바위
			f.setTitle("컴퓨터 승");
		    if(computer == 2 ) {//컴퓨터가 보
			f.setTitle("내가 승");
			}
			}
		}
	}

        if(e.getSource()== r ) {//내가 바위		
			if(computer == 0 ) {//컴퓨터가 가위
			f.setTitle("내가 승");
			if(computer == 1 ) {//컴퓨터가 바위
			f.setTitle("비겼음");
		    if(computer == 2 ) {//컴퓨터가 보
			f.setTitle("컴퓨터 승");
			}
	}
        
        if(e.getSource()== p ) {//내가 보		
        	if(computer == 0 ) {//컴퓨터가 가위
    		f.setTitle("컴퓨터 승");
    		if(computer == 1 ) {//컴퓨터가 바위
    		f.setTitle("내가 승");
    		if(computer == 2 ) {//컴퓨터가 보
    		f.setTitle("비겼음");
    			}
        }
	}
	}}}}}

