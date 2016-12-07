package List01;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class ListDemo5 {

	public static void main(String[] args) {

		try {


			DocumentBuilderFactory factory=DocumentBuilderFactory.newInstance();
			DocumentBuilder builder=factory.newDocumentBuilder();
			Document document=	builder.parse(new File("NewFile.xml"));
			//直接访问文档元素的子节点
			Element root= document.getDocumentElement();
			// 通过名称获得属性值。
			System.out.println("cat="+root.getAttribute("cat"));
			// 按文档顺序返回包含在文档中且具有给定标记名称的所有 Element 的 NodeList
			//NodeList 接口提供对节点的有序集合的抽象，没有定义或约束如何实现此集合。DOM 中的 NodeList 对象是活动的。 

            //NodeList 中的项可以通过从 0 开始的整数索引进行访问。 

			// 以文档顺序返回具有给定标记名称的所有后代 Elements 的 NodeList
			NodeList list= root.getElementsByTagName("lan");
			
			for(int i=0;i<list.getLength();i++)
			{
				//返回集合中的第 index 个项。如果 index 大于或等于此列表中的节点数，则返回 null
				Element lan=(Element) list.item(i);
				System.out.println("-------");
				//通过元素名称获得属性值
				System.out.println("id="+lan.getAttribute("id"));
				//得到所有子节点的集合
				NodeList nlist=lan.getChildNodes();
				for(int j=0;j<nlist.getLength();j++)
				{
					Node c=nlist.item(j);
					if(c instanceof Element)
					{ 
						//节点名称和此节点及其后代的文本内容
						System.out.println(c.getNodeName()+"="+c.getTextContent());
					}
				}
			}



		} catch (ParserConfigurationException e) {

			e.printStackTrace();
		} catch (SAXException e) {

			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		}

	}

}
