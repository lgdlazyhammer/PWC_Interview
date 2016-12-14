package econny.cn.parsexml;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class XmlParser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			// 创建文档对象
			DocumentBuilderFactory dFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = dFactory.newDocumentBuilder();
			Document doc;
			doc = builder.parse(new File("src/econny/cn/parsexml/config.xml"));

			// 获取包含类名的文本节点
			NodeList nl = doc.getElementsByTagName("className");
			Node classNode = nl.item(0).getFirstChild();
			String cName = classNode.getNodeValue();
			
			String temp = nl.item(2).getLastChild().getNodeValue();

			System.out.println(cName);
			System.out.println(temp);
			// 通过类名生成实例对象并将其返回
			//Class c = Class.forName(cName);
			//Object obj = c.newInstance();
			//return obj;
		} catch (Exception e) {
			e.printStackTrace();
			//return null;
		}
	}

}
