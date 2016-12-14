package econny.cn.multithread;

public class RectMain {

	public static void main(String[] args){
		Rect rect1 = new Rect();
		Rect rect2 = new Rect();
		Rect rect3 = new Rect();
		new Thread(rect1).start();
		new Thread(rect1).start();
		new Thread(rect1).start();
	}
}
