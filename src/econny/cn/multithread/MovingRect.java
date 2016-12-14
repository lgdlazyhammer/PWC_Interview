package econny.cn.multithread;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MovingRect extends JPanel implements Runnable {

	private int x = 10;
	private int y = 10;
	
	public static void main(String[] args){
		JFrame frame = new JFrame();
		frame.setSize(800,600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocation(250,50);
		frame.add(new MovingRect());
		frame.setVisible(true);
	}
	
	public MovingRect(){
		this.setSize(800,600);
		this.setLocation(10, 10);
		
		Thread t = new Thread(this);
		t.start();
		
		this.setVisible(true);
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true){
			this.x += 8;
			this.y += 6;
			try{
				Thread.sleep(200);
			}catch(InterruptedException e){
				e.printStackTrace();
			}
			this.repaint();
		}
	}
	
	@Override
	public void paint(Graphics g){
		super.paint(g);
		Color c = g.getColor();
		g.setColor(Color.RED);
		
		g.fillRect(x, y, 15, 15);
		g.fillRect(Math.abs(800-x), Math.abs(600-y), 15, 15);
		g.setColor(c);
	}

}
