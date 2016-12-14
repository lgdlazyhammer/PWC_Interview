package econny.cn.multithread;

public class MyThreadTest {
	public static void main(String[] args) {
		new ThreadTest().start();
		new ThreadTest().start();
		new ThreadTest().start();
		new ThreadTest().start();
	}
}

class ThreadTest extends Thread {
	private int count = 10;

	public void run() {
		System.out.println(this.holdsLock(0));
		while (count > 0) {
			System.out.println(Thread.currentThread().getName() + "   " + count--);
		}
	}
}
