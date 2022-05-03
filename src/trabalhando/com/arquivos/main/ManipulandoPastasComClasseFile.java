package trabalhando.com.arquivos.main;

import java.io.File;
import java.util.Scanner;

public class ManipulandoPastasComClasseFile {

	public static void main(String[] args) {
		
		//C:\Users\adria\OneDrive\Documentos\CURSOS UDEMY\REFAZENDO - Java COMPLETO 2020 Programação Orientada a Objetos + Projetos\17 Trabalhando com arquivos
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o diretório: ");
		String diretorioDigitado = sc.nextLine();
		
		File diretorio = new File(diretorioDigitado);
		
		//Listando todas as pastas de um diretório
		File[] pastas = diretorio.listFiles(File::isDirectory);
		System.out.println("PASTAS:");
		for(File pasta : pastas) {
			System.out.println(pasta);
		}
		
		//Listando todos os arquivos de um diretório
		File[] arquivos = diretorio.listFiles(File::isFile);
		System.out.println("ARQUIVOS:");
		for(File arquivo : arquivos) {
			System.out.println(arquivo);
		}
		
		boolean sucesso = new File(diretorioDigitado + "\\pastaCriadaPorUmProgramaJava").mkdir();
		System.out.println("Pasta criada com sucesso!" + sucesso);
		
		sc.close();
	}

}
