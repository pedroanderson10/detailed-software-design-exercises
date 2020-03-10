package Forca;

import java.util.Scanner;
import java.util.ArrayList;


public class Main {

	public static void main(String[] args) {
		Jogo jogo = new Jogo();
		// Separação de linha
		String linha = ManipulaPalavra.lerLinha("palavra.txt", (int) (Math.random() * 30) + 1);
		String palavra = ManipulaPalavra.obterPalavra(linha);
		String dica = ManipulaPalavra.obterDica(linha);
		System.out.println(palavra);
		jogo.preencher_array(palavra.length());
		
		// Jogo
		Scanner scan = new Scanner(System.in);
		ArrayList<String> tentativas = new ArrayList<String>();
		do {
			System.out.println("\nDica : " + dica);
			System.out.println("Tentativas restantes: " + jogo.getNum_erros());
			System.out.println("Tentativas : " + tentativas);
			jogo.printar_array();
			System.out.println("\nInsira uma letra :");
			String letra = scan.next();
			jogo.compara(letra,palavra);
			tentativas.add(letra);
			jogo.deu_forca();
		 }while(!jogo.deu_forca() && jogo.conferir());
		System.out.println("\nVc acertou a palavra !!!!!");
		jogo.printar_array();
	}

}
