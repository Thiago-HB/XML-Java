package recursos;
import java.io.File;
import java.io.IOException;

import javax.xml.parsers.*;

import org.w3c.dom.*;
import org.xml.sax.SAXException;

public class Leitor {
/**
**/
	Document documento;
	
	public Leitor(File f) {DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
	try{DocumentBuilder builder = factory.newDocumentBuilder();
	documento = builder.parse(f);
	System.out.println("Foi possível criar o builder");} 
	catch(ParserConfigurationException e) {System.out.println("Não foi possível criar o builder");}
	catch(IOException e) {System.out.println("O arquivo não entrou");}catch(SAXException e) 
	{System.out.println("Erro no SAX");}
	
	}

	public NodeList lista(String f){NodeList nodes = documento.getElementsByTagName(f); return nodes;}

	public String lerNome(NodeList n, int i){return n.item(i).getNodeName();}
	
	public String lerValor(NodeList n, int i){return n.item(i).getTextContent();}
}

