package recursos;
import java.io.File;
import java.io.IOException;

import javax.xml.parsers.*;

import org.w3c.dom.*;
import org.xml.sax.SAXException;

public class Leitor {
/**
**/
	public Document documento;
	
	public Leitor(File f) {DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
	try{DocumentBuilder builder = factory.newDocumentBuilder();
	documento = builder.parse(f);} 
	catch(ParserConfigurationException e) {System.out.println("Não foi possível criar o builder");}
	catch(IOException e) {System.out.println("Arquivo não entrou");}catch(SAXException e) 
	{System.out.println("Problema no SAX");}
	
	}

	
	public NodeList lista(String f){NodeList nodes = documento.getElementsByTagName(f); return nodes;}

	public String lerNome(NodeList n, int i){return n.item(i).getNodeName();}
	
	public String lerAtributo(Node n, String s) {return ((Element)n).getAttribute(s);}
	
	public String lerValor(NodeList n, int i){return n.item(i).getTextContent();}
}
