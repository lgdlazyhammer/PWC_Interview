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
		/*HashMap 是一个散列表，它存储的内容是键值对(key-value)映射。
		HashMap 继承于AbstractMap，实现了Map、Cloneable、java.io.Serializable接口。
		HashMap 的实现不是同步的，这意味着它不是线程安全的。它的key、value都可以为null。此外，HashMap中的映射不是有序的。*/
		hashmap.put(null,null);
		hashmap.put(String,null);
		
		System.out.println(hashmap.get(null));
		
		set.add(null);
		
		list.add(null);
	}
}
