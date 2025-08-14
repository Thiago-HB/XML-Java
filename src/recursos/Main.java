package recursos;

import java.io.File;

import org.w3c.dom.NodeList;

public class Main {

	public static void main(String[] args) {
	File f = new File("C:\\Users\\thiag\\Desktop\\Projetos\\Jogo-teste\\save.xml");
		Leitor leitor = new Leitor(f);
		NodeList nodes = leitor.lista("*");
		System.out.println(leitor.lerValor(nodes, 0));

	}

}
