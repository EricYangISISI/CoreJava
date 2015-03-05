import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;


public class ReadXMLFile {
	public static void main(String [] args){
		try {
			
			File xmlFile = new File("./data/sample-1.xml");
			
			DocumentBuilderFactory domFactory = DocumentBuilderFactory.newInstance();
			
				DocumentBuilder domBuilder = domFactory.newDocumentBuilder();
				
				Document doc = domBuilder.parse(xmlFile);
				
				doc.getDocumentElement().normalize();
				
				System.out.println("Root Element : " + doc.getDocumentElement().getNodeName());
				
				NodeList nList = doc.getElementsByTagName("student");
				
				
				System.out.println("---------------------------------------");
				
				for(int temp=0, length=nList.getLength(); temp<length; temp++ ){
					Node nNode = nList.item(temp);
					
					System.out.println("\nElement : " + nNode.getNodeName());
					
					if(nNode.getNodeType() == Node.ELEMENT_NODE){
						
						Element eElement = (Element) nNode;
						
						System.out.println("Student id : " + eElement.getAttribute("id"));
						System.out.println("First Name : " + eElement.getElementsByTagName("firstname").item(0).getTextContent());
						System.out.println("Last Name : " + eElement.getElementsByTagName("lastname").item(0).getTextContent());
						System.out.println("Nick Name : " + eElement.getElementsByTagName("nickname").item(0).getTextContent());
						System.out.println("rank : " + eElement.getElementsByTagName("rank").item(0).getTextContent());
					}
				}
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
