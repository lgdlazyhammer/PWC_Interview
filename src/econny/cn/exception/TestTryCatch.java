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
	/*����try��������׳��쳣������ת��catch���飬catch�����ִ��return���֮ǰִ��finally����finally�����return,��ֱ��ִ��finally�����ֵ������finally*/
	/*1 try��catch��finally����У������try�����return��䣬�򷵻ص�֮��ǰtry�б�����ʱ��Ӧ��ֵ���˺�Ա������κε��޸ģ�����Ӱ��try��return�ķ���ֵ

	2 ���finally������return ��䣬�򷵻�try��catch�еķ��������ԡ�

	3 ���finally�����׳��쳣��������try��catch��finally�����׳��쳣

	 

	����ʹ��try��catch��finally��������Ҫע�����

	1 ������try����catch��ʹ��return��䡣ͨ��finally���дﵽ��try����catch����ֵ�޸��ǲ����еġ�

	2 finally���б���ʹ��return��䣬��Ϊfinally�������ʹ��return��䣬����ʾ��������try��catch���е��쳣��Ϣ�������˴���ķ���

	3 finally���б����ٴ��׳��쳣��������������try����ķ������׳��쳣�����һ�������try��catch���е��쳣*/

}
