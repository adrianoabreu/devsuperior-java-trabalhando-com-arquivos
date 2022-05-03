package trabalhando.com.arquivos.main;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import trabalhando.com.arquivos.entidades.Produto;

public class ExercicioPropostoTrabalhandoComArquivos {
	/*
	 * Fazer um programa para ler o caminho de um arquivo .csv
	 * contendo os dados de itens vendidos. Cada item possui um
	 * nome, preço unitário e quantidade, separados por vírgula. Você
	 * deve gerar um novo arquivo chamado "summary.csv", localizado
	 * em uma subpasta chamada "out" a partir da pasta original do
	 * arquivo de origem, contendo apenas o nome e o valor total para
	 * aquele item (preço unitário multiplicado pela quantidade),
	 * conforme exemplo.
	 */
	public static void main(String[] args) throws ParseException {
		
		//C:\Users\adria\OneDrive\Documentos\CURSOS UDEMY\REFAZENDO - Java COMPLETO 2020 Programação Orientada a Objetos + Projetos\17 Trabalhando com arquivos\in.csv
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Produto> lista = new ArrayList<>();
		
		System.out.println("Entre com o caminho do arquivo .csv: ");
		String diretorioDigitado = sc.nextLine();
		
		File diretorio = new File(diretorioDigitado);
		String dir = diretorio.getParent(); // obtendo diretório digitado
		
		boolean sucesso  = new File(dir + "\\out").mkdir();
		
		String criandoNovoArquivo = dir + "\\out\\summary.csv"; // criando novo arquivo summary.csv na subpasta out. 
		
		// Leitura do arquivo in.csv
		try (BufferedReader br = new BufferedReader(new FileReader(diretorioDigitado))) {
			
			String linha = br.readLine();

			while(linha != null) {
				String[] campos    = linha.split(",");
				String nome        = campos[0];
				Double valor       = Double.parseDouble(campos[1]);
				Integer quantidade = Integer.parseInt(campos[2]);
				
				lista.add(new Produto(nome,valor,quantidade));
				
				linha = br.readLine();

			}
			
			// Escrevendo o novo arquivo summary.csv
			try (BufferedWriter bw = new BufferedWriter(new FileWriter(criandoNovoArquivo))) {

				for (Produto item : lista) {
					bw.write(item.getNome() + "," + String.format("%.2f", item.total()));
					bw.newLine();
				}

				System.out.println(criandoNovoArquivo + " Criado!");
				
			} catch (IOException e) {
				System.out.println("Erro ao escrever arquivo: " + e.getMessage());
			}
			
			
		}catch(IOException e) {
			System.out.println("Erro ao ler arquivo: " + e.getMessage());
		}
				
		sc.close();
	}

}
