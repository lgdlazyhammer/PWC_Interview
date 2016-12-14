package econny.cn.singleton;

public class Singleton {
	/* 1��������ֻ����һ��ʵ����
	����2������������Լ������Լ���Ψһʵ����
	����3�������������������������ṩ��һʵ����*/
	private Singleton() {
	}

	private static Singleton single = null;

	// ��̬��������
	public static synchronized Singleton getInstance() {
		if (single == null) {
			single = new Singleton();
		}
		return single;
	}
}
