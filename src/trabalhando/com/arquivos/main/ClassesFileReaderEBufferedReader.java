package trabalhando.com.arquivos.main;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ClassesFileReaderEBufferedReader {

	public static void main(String[] args) {
		
		String diretorio  = "C:\\Users\\adria\\OneDrive\\Documentos\\CURSOS UDEMY\\REFAZENDO - Java COMPLETO 2020 Programação Orientada a Objetos + Projetos\\17 Trabalhando com arquivos\\in.txt";
		FileReader fr     = null;
		BufferedReader br = null;
		
		try {
			fr = new FileReader(diretorio);
			br = new BufferedReader(fr);
			
			String linha = br.readLine();
			while(linha != null) {
				System.out.println(linha);
				linha = br.readLine();
			}
		} catch(IOException e) {
			System.out.println("Erro: " + e.getMessage());
		}finally {
			try {
				if(br != null) {
					br.close();
				}
				if(fr != null) {
					fr.close();
				}
			} catch(IOException e) {
				e.printStackTrace();
			}
		}
	}

}
