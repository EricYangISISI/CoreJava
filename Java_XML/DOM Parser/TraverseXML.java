import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;


public class TraverseXML {
	
	public static void main(String [] args){
		try{
			
			File file = new File("./data/sample-1.xml");
			DocumentBuilder docBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
			
			Document doc = docBuilder.parse(file);
			
			System.out.println("Root Element : " + doc.getDocumentElement().getNodeName());
			
			if(doc.hasChildNodes()){
				printNote(doc.getChildNodes());
			}
		} catch (Exception e){
			System.out.println(e.getMessage());
		}
		
	}

	private static void printNote(NodeList childNodes) {
		
		for(int count=0, length=childNodes.getLength(); count<length; count++){
			
			Node tempNode = childNodes.item(count);
			
			if(tempNode.getNodeType()==Node.ELEMENT_NODE){
				
				//print out node name and value
				
				System.out.println("\nNode Name =" + tempNode.getNodeName() + " --F:Start");
				System.out.println("Node Value =" + tempNode.getTextContent());
				
				if(tempNode.hasAttributes()){
					//get attributes name and value
					NamedNodeMap nodeMap = tempNode.getAttributes();
					
					for(int i=0, nodeLength=nodeMap.getLength(); i<nodeLength; i++){
						
						Node node = nodeMap.item(i);
						System.out.println("Attribute Name :" + node.getNodeName());
						System.out.println("Attribute Value :" + node.getNodeType());
					}
				}
				
				if(tempNode.hasChildNodes()){
					printNote(tempNode.getChildNodes());
				}
				
				System.out.println("Node Name =" + tempNode.getNodeName() + " --F:End"); 
			}
			
		}
		
	}
}
