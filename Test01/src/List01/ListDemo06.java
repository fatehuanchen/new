package List01;

import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class ListDemo06 {

	public static void main(String[] args) {
		DocumentBuilderFactory factory= DocumentBuilderFactory.newInstance();
		try {
			DocumentBuilder builder=factory.newDocumentBuilder();
		    Document document =	builder.parse("NewFile.xml");
		    Element root=  document.getDocumentElement();
		   System.out.println("cat="+root.getAttribute("cat"));
		  NodeList list= root.getElementsByTagName("lan");
		  for(int i=0;i<list.getLength();i++)
		  {
			   Element lan=(Element) list.item(i);
			  System.out.println("-----");
			  System.out.println("id="+lan.getAttribute("id"));
			 NodeList clist=  lan.getChildNodes();
			 for(int j=0;j<clist.getLength();j++)
			 {    Node c=clist.item(j);
			      if(c instanceof Element)
				 System.out.println(c.getNodeName()+"="+c.getTextContent());
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
