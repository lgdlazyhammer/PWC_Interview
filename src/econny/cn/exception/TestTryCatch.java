package econny.cn.exception;

public class TestTryCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(test(1));
	}
	
	public static Integer test(Integer i){
		try{
			Integer.parseInt(null);
			return ++i;
		}catch(Exception e){
			System.out.println("run catch");
			String.valueOf(null);
			return ++i;
		}finally{
			System.out.println("run finally");
            //String.valueOf(null);
			return ++i;
		}
	}
	
	/*finally always run*/
	/*由于try语句里面抛出异常，程序转入catch语句块，catch语句在执行return语句之前执行finally，而finally语句有return,则直接执行finally的语句值，返回finally*/
	/*1 try、catch、finally语句中，在如果try语句有return语句，则返回的之后当前try中变量此时对应的值，此后对变量做任何的修改，都不影响try中return的返回值

	2 如果finally块中有return 语句，则返回try或catch中的返回语句忽略。

	3 如果finally块中抛出异常，则整个try、catch、finally块中抛出异常

	 

	所以使用try、catch、finally语句块中需要注意的是

	1 尽量在try或者catch中使用return语句。通过finally块中达到对try或者catch返回值修改是不可行的。

	2 finally块中避免使用return语句，因为finally块中如果使用return语句，会显示的消化掉try、catch块中的异常信息，屏蔽了错误的发生

	3 finally块中避免再次抛出异常，否则整个包含try语句块的方法回抛出异常，并且会消化掉try、catch块中的异常*/

}
