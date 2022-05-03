package trabalhando.com.arquivos.main;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class LendoArquivoComClasseFileEScanner {
	/*
	 * Lêr arquivo e mostrar na tela as informações lidas.
	 */
	public static void main(String[] args) {
		
		File file = new File("C:\\Users\\adria\\OneDrive\\Documentos\\CURSOS UDEMY\\REFAZENDO - Java COMPLETO 2020 Programação Orientada a Objetos + Projetos\\17 Trabalhando com arquivos\\in.txt");
		Scanner sc = null;
		try {
			sc = new Scanner(file);
			while(sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
		}catch(IOException e) {
			System.out.println("Erro: " + e.getMessage());
		}finally {
			if(sc != null) {
			   sc.close();
			}
			
		}
		
	}

}
