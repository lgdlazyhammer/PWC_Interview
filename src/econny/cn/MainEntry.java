package econny.cn;

public class MainEntry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child child = new Child();
		child.doTest();
		
		Child.doTestStatic();
		child.doTestStatic();
	}

}
