package fotf_DDF;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.testng.TestNG;
import org.w3c.dom.DOMException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class XmlUtil {
	public static void createXml() throws Exception{
		try{
			// Create Object for Utility Class
			String xlFilePath="Switches\\Flags.xls";
			//byte[] xlPath = String.getBytes(xlFilePath);
			
			ExcelLib excel =new ExcelLib(xlFilePath);
			
			// initialization of Drivers
			DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
			
			DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
			
			Document document= documentBuilder.newDocument();
			
			// Get the Flagged Cells with value = "EXECUTE" from Excel file
			excel.getFlaggedMethods("Switch");
			
			// Get the number of parameter to be created in XML
			int totalnoofelementsflaggedtorun = excel.flaggedMethod.size();
			
			// Type the suite Tag Element in the XML file
			Element rootElementSuite=document.createElement("suite");
			
			// Type the parameter set of lines in the XML file
			for(int elementcounter=1; elementcounter<= totalnoofelementsflaggedtorun; elementcounter++){
				
				Element rootElementParameter=document.createElement("parameter");
				
				String[] flagElement=excel.flaggedMethod.get(elementcounter).toString().split(";");
				
				rootElementParameter.setAttribute("name", flagElement[0]);
				rootElementParameter.setAttribute("value", flagElement[1]);
				rootElementSuite.appendChild(rootElementParameter);
			}
			// Type the root elements in the XML file
			Element rootElementTest=document.createElement("test");
			Element rootElementClass=document.createElement("classes");
			Element childElementClass=document.createElement("class");
			
			// Assign attribute to the root elements
			childElementClass.setAttribute("name", "fotf_Config.Basedriver");
			
			Element rootElementgroups= document.createElement("methods");
			
			//Assign Attribute to the root elements
			rootElementSuite.setAttribute("name", "SeleniumJavaFramework");
			rootElementTest.setAttribute("name", "testing");
			
			// Append values to the root elements
			rootElementSuite.appendChild(rootElementTest);
			rootElementTest.appendChild(rootElementClass);
			rootElementClass.appendChild(childElementClass);
			childElementClass.appendChild(rootElementgroups);
			document.appendChild(rootElementSuite);
			
			// Obtain the column value flag = "Y" in a loop
			for(int elementcounter=1; elementcounter<= totalnoofelementsflaggedtorun; elementcounter++){
				String element="include";
				Element em=document.createElement(element);
				String[] flagElement=excel.flaggedMethod.get(elementcounter).toString().split(";");
				em.setAttribute("name", flagElement[0]);
				rootElementgroups.appendChild(em);
			}
			// Generate the file.
			FileWriter fstream = new FileWriter("Switches\\testng.xml");
			BufferedWriter out = new BufferedWriter(fstream);
			
			// Generate the requried XML output file
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer= transformerFactory.newTransformer();
			DOMSource source=new DOMSource(document);
			
			// Print all the Generated XML in the File Object
			StreamResult result=new StreamResult(fstream);
			
			// Close the Generated file
			out.close();
		}catch(DOMException e){
			e.printStackTrace();
		}
		
	}
	public static void autoRunXml(){
		// Create a list
		List<String> files = new ArrayList<String>();
		
		// Add the required xml files to the list
		files.add("Switches\\testng.xml");
		
		// Create object for TestNG
		TestNG tng=new TestNG();
		
		// Add the list of the file to create a suite
		tng.setTestSuites(files);
		
		// Run the Suite
		tng.run();
	}
}
