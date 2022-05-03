package trabalhando.com.arquivos.main;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ClassesFileWriterEBufferedWriter {

	public static void main(String[] args) {
		
		String[] linhas = new String[] {"Adriano","Vera","Andre","Chris"};
		
		String diretorio = "C:\\Users\\adria\\OneDrive\\Documentos\\CURSOS UDEMY\\REFAZENDO - Java COMPLETO 2020 Programação Orientada a Objetos + Projetos\\17 Trabalhando com arquivos\\out.txt";
		
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(diretorio, true))){
			for(String linha : linhas) {
				bw.write(linha);
				bw.newLine();
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}

}
