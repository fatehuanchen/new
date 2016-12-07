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
			//ֱ�ӷ����ĵ�Ԫ�ص��ӽڵ�
			Element root= document.getDocumentElement();
			// ͨ�����ƻ������ֵ��
			System.out.println("cat="+root.getAttribute("cat"));
			// ���ĵ�˳�򷵻ذ������ĵ����Ҿ��и���������Ƶ����� Element �� NodeList
			//NodeList �ӿ��ṩ�Խڵ�����򼯺ϵĳ���û�ж����Լ�����ʵ�ִ˼��ϡ�DOM �е� NodeList �����ǻ�ġ� 

            //NodeList �е������ͨ���� 0 ��ʼ�������������з��ʡ� 

			// ���ĵ�˳�򷵻ؾ��и���������Ƶ����к�� Elements �� NodeList
			NodeList list= root.getElementsByTagName("lan");
			
			for(int i=0;i<list.getLength();i++)
			{
				//���ؼ����еĵ� index ������ index ���ڻ���ڴ��б��еĽڵ������򷵻� null
				Element lan=(Element) list.item(i);
				System.out.println("-------");
				//ͨ��Ԫ�����ƻ������ֵ
				System.out.println("id="+lan.getAttribute("id"));
				//�õ������ӽڵ�ļ���
				NodeList nlist=lan.getChildNodes();
				for(int j=0;j<nlist.getLength();j++)
				{
					Node c=nlist.item(j);
					if(c instanceof Element)
					{ 
						//�ڵ����ƺʹ˽ڵ㼰�������ı�����
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
