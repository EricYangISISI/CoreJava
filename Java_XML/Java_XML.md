Java JDK is built-in XML parsers, DOM and SAX.

**DOM XML Parser**
The DOM is the easiest way to use Java XML Parser. It parses an entire XML document and load it into memory, modeling it with object for easy model traversal. DOM Parser is slow and consume a lot memory if it load a XML document which contains a lot of data.

Note: DOM Parser is slow and consumes a lot of memory when it loads an XML document which contains a lot of data. 

A. Read a XML file

Input: sample-1.xml

    <?xml version="1.0"?>
    <school>
    	<student id="0001">
    		<firstname>Jack</firstname>
    		<lastname>Wang</lastname>
    		<nickname>J</nickname>
    		<rank>10</rank>
    	</student>
    	<student id="0100">
    		<firstname>Make</firstname>
    		<lastname>Zhang</lastname>
    		<nickname>fong</nickname>
    		<rank>06</rank>
    	</student>
    </school>

Codes: ./Dom_Parser/ReadXMLFile.java

Output:

    Root Element : school
    ---------------------------------------
    
    Element : student
    Student id : 0001
    First Name : Jack
    Last Name : Wang
    Nick Name : J
    rank : 10
    
    Element : student
    Student id : 0100
    First Name : Make
    Last Name : Zhang
    Nick Name : fong
    rank : 06

**B. Traverse a XML file**

Input: sample-1.xml
Codes: TraverseXML.java
Output: 

    Root Element : school
    
    Node Name =school --F:Start
    Node Value =
    	
    		Jack
    		Wang
    		J
    		10
    	
    	
    		Make
    		Zhang
    		fong
    		06
    	
    
    
    Node Name =student --F:Start
    Node Value =
    		Jack
    		Wang
    		J
    		10
    	
    Attribute Name :id
    Attribute Value :2
    
    Node Name =firstname --F:Start
    Node Value =Jack
    Node Name =firstname --F:End
    
    Node Name =lastname --F:Start
    Node Value =Wang
    Node Name =lastname --F:End
    
    Node Name =nickname --F:Start
    Node Value =J
    Node Name =nickname --F:End
    
    Node Name =rank --F:Start
    Node Value =10
    Node Name =rank --F:End
    Node Name =student --F:End
    
    Node Name =student --F:Start
    Node Value =
    		Make
    		Zhang
    		fong
    		06
    	
    Attribute Name :id
    Attribute Value :2
    
    Node Name =firstname --F:Start
    Node Value =Make
    Node Name =firstname --F:End
    
    Node Name =lastname --F:Start
    Node Value =Zhang
    Node Name =lastname --F:End
    
    Node Name =nickname --F:Start
    Node Value =fong
    Node Name =nickname --F:End
    
    Node Name =rank --F:Start
    Node Value =06
    Node Name =rank --F:End
    Node Name =student --F:End
    Node Name =school --F:End