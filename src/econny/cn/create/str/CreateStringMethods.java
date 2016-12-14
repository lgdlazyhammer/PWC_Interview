package econny.cn.create.str;

public class CreateStringMethods {
	
	/*public static void main(String[] args) {

		String a = new String("b");// new String （"abc"）； 引用的对象在内存/堆中。

		String b = "b";// 引用的对象在栈（或者叫String池）中。

		
		 * JVM先在String池中创建一个String对象存储"XYZ"，然后由于遇到new关键字，
		 * 再在内存上创建一个String对象存储"XYZ"；
		 * 
		 * 接着由于String池中已经有了"XYZ"的对象，所以第二个new语句不会在String池中创建对象，
		 * 而只会在内存上创建一个String对象；
		 * 
		 * 最后两个字符串相加会在String池中创建一个String对象"XYZXYZ"，并将其引用传给s。
		 * 
		 * 所以总共会创建4个String对象
		 
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
	    String str2 = "java"+"blog";    //在编译时被优化成String str2 = "javablog";
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
