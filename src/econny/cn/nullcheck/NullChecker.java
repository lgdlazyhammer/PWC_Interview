package econny.cn.nullcheck;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class NullChecker {

	private static final String String = null;

	public static void main(String[] args) {
		Map hashmap = new HashMap<Object,Object>();
		Set set = new HashSet();
		List<Object> list = new ArrayList<Object>();
		/*HashMap ��һ��ɢ�б����洢�������Ǽ�ֵ��(key-value)ӳ�䡣
		HashMap �̳���AbstractMap��ʵ����Map��Cloneable��java.io.Serializable�ӿڡ�
		HashMap ��ʵ�ֲ���ͬ���ģ�����ζ���������̰߳�ȫ�ġ�����key��value������Ϊnull�����⣬HashMap�е�ӳ�䲻������ġ�*/
		hashmap.put(null,null);
		hashmap.put(String,null);
		
		System.out.println(hashmap.get(null));
		
		set.add(null);
		
		list.add(null);
	}
}
