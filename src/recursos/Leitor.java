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
	DocumentBuilder builder;
	
	public Leitor() throws ParserConfigurationException{DocumentBuilderFactory factory=DocumentBuilderFactory.newInstance();
	factory.setValidating(true); factory.setIgnoringElementContentWhitespace(true);
	factory.setIgnoringComments(true);
	this.builder = factory.newDocumentBuilder();}
	
	public Document ler(File f) throws NullPointerException {try{documento = builder.parse(f); return documento;
	}catch(IOException e){return null;}catch(SAXException e){return null;}catch(IllegalArgumentException e){return null;}
	}

	public NodeList lista(String f){NodeList nodes = documento.getElementsByTagName(f); return nodes;}

	public String lerNome(NodeList n, int i){return n.item(i).getNodeName();}
	
	public String lerValor(NodeList n, int i){return n.item(i).getTextContent();}
}
