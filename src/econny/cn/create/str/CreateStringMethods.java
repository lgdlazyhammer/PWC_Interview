package econny.cn.create.str;

public class CreateStringMethods {
	
	/*public static void main(String[] args) {

		String a = new String("b");// new String ��"abc"���� ���õĶ������ڴ�/���С�

		String b = "b";// ���õĶ�����ջ�����߽�String�أ��С�

		
		 * JVM����String���д���һ��String����洢"XYZ"��Ȼ����������new�ؼ��֣�
		 * �����ڴ��ϴ���һ��String����洢"XYZ"��
		 * 
		 * ��������String�����Ѿ�����"XYZ"�Ķ������Եڶ���new��䲻����String���д�������
		 * ��ֻ�����ڴ��ϴ���һ��String����
		 * 
		 * ��������ַ�����ӻ���String���д���һ��String����"XYZXYZ"�����������ô���s��
		 * 
		 * �����ܹ��ᴴ��4��String����
		 
		String s = new String("XYZ") + new String("XYZ");

		System.out.println(a == b);
	}*/
	
	public static void A() {
	    String str1 = "java";
	    String str2 = "java";
	    System.out.println(str1 == str2);  //true
	  }
	  public static void B() {
	    String str1 = new String("java");
	    String str2 = new String("java");
	    System.out.println(str1 == str2);  //false
	  }
	  public static void C() {
	    String str1 = "java";
	    String str2 = "blog";
	    String s = str1 + str2;
	    System.out.println(s == "javablog");  //false
	  }
	  public static void C2() {
	    String str1 = "javablog";
	    String str2 = "java"+"blog";    //�ڱ���ʱ���Ż���String str2 = "javablog";
	    System.out.println(str1 == str2);  //true
	  }
	  public static void D() {
	    String s1 = "java";
	    String s2 = new String("java");
	    System.out.println(s1.intern() == s2.intern());  //true
	  }

	  public static void E() {
	    String str1 = "java";
	    String str2 = new String("java");
	    System.out.println(str1.equals(str2));  //true
	  }
	  
	  public static void main(String[] args){
	    A();
	    B();
	    C();
	    C2();
	    D();
	    E();
	  }
}
