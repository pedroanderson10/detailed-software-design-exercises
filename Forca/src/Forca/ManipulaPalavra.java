package Forca;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ManipulaPalavra {

	public ManipulaPalavra() {
	}

	protected static String lerLinha(String fileWay, int numLinha) {

		String linha = "";

		try {

			FileReader arq = new FileReader("palavras.txt");
			BufferedReader ler = new BufferedReader(arq);

			for (int i = 1; i <= numLinha; i++)
				linha = ler.readLine();

		} catch (FileNotFoundException e) {
			System.out.println("Erro na abertura do arquivo");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Erro ao tentar ler o arquivo");
			e.printStackTrace();
		}
		return linha;
	}

	// Linha vai ser separada em 2.
	// obterPalavra tera os dados da palavra
	protected static String obterPalavra(String linha) {
		return (linha.split(" ", 2))[0];
	}

	// obterDica tera os dados da dica
	protected static String obterDica(String linha) {
		return (linha.split(" ", 2))[1];
	}
}
