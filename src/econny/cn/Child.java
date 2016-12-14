package econny.cn;

public class Child extends Parent {
	
	public Child(){
		System.out.println("child constructor.");
	}
	
	public static void doTestStatic(){
		System.out.println("child do test static.");
	}
	
	public void doTest(){
		System.out.println("child do test.");	
	}

}
