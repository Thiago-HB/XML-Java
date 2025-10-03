package recursos;
import org.w3c.dom.*; 
import java.io.*;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

public class Sobreescritor {
Document dom;
TransformerFactory transformerFactory = TransformerFactory.newInstance();
Transformer transformer;
DOMSource source = new DOMSource(dom);
	public Sobreescritor(Document d) {try{dom = d; transformer = transformerFactory.newTransformer();}
	catch(TransformerConfigurationException e) {}};
	
	public void mudarValor(NodeList n, int i, String s) {n.item(i).setTextContent(s);}
	
	
	StreamResult result;
	
	public void escrever(File f) throws TransformerException{result = new StreamResult(f);
    transformer.transform(source, result);}
	
}
