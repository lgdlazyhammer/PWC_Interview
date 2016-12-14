package econny.cn.multithread;

public class Rect implements Runnable{

	private int x = 10;
	private int y = 10;
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		this.x += 6;
		this.y += 6;
		
		System.out.println(Thread.currentThread().getName());
		System.out.println(x+"  "+y);
	}
}
