package trabalhando.com.arquivos.main;

import java.io.File;
import java.util.Scanner;

public class InformacoesDoCaminhoDoArquivo {

	public static void main(String[] args) {
		
		//C:\Users\adria\OneDrive\Documentos\CURSOS UDEMY\REFAZENDO - Java COMPLETO 2020 Programa��o Orientada a Objetos + Projetos\17 Trabalhando com arquivos\in.txt
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o diret�rio:");
		String diretorioDigitado = sc.nextLine();
		
		File diretorio = new File(diretorioDigitado);
		
		System.out.println("getPath:  " + diretorio.getPath()); // acessa o diret�rio + o arquivo.
		System.out.println("gtParent: " + diretorio.getParent()); // acessa somente o diret�rio onde est� localizado o arquivo.
		System.out.println("getName:  " + diretorio.getName()); // acessa somente o nome do arquivo do diret�rio digitado.
		
		sc.close();
		
	}

}
