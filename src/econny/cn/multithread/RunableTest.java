package econny.cn.multithread;

public class RunableTest {
	
	public static void main(String[] args) {
		MyThreadTestInter test = new MyThreadTestInter();
		new Thread(test).start();
		new Thread(test).start();
		new Thread(test).start();
		new Thread(test).start();
	}
}

class MyThreadTestInter implements Runnable {
	private int count = 10;

	public void run() {
		while (count > 0) {
			System.out.println(Thread.currentThread().getName() + "   " + count--);
		}
	}
}
