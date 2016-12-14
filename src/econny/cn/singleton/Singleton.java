package econny.cn.singleton;

public class Singleton {
	/* 1、单例类只能有一个实例。
	　　2、单例类必须自己创建自己的唯一实例。
	　　3、单例类必须给所有其他对象提供这一实例。*/
	private Singleton() {
	}

	private static Singleton single = null;

	// 静态工厂方法
	public static synchronized Singleton getInstance() {
		if (single == null) {
			single = new Singleton();
		}
		return single;
	}
}
