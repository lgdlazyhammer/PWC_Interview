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
			// �����ĵ�����
			DocumentBuilderFactory dFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = dFactory.newDocumentBuilder();
			Document doc;
			doc = builder.parse(new File("src/econny/cn/parsexml/config.xml"));

			// ��ȡ�����������ı��ڵ�
			NodeList nl = doc.getElementsByTagName("className");
			Node classNode = nl.item(0).getFirstChild();
			String cName = classNode.getNodeValue();
			
			String temp = nl.item(2).getLastChild().getNodeValue();

			System.out.println(cName);
			System.out.println(temp);
			// ͨ����������ʵ�����󲢽��䷵��
			//Class c = Class.forName(cName);
			//Object obj = c.newInstance();
			//return obj;
		} catch (Exception e) {
			e.printStackTrace();
			//return null;
		}
	}

}
