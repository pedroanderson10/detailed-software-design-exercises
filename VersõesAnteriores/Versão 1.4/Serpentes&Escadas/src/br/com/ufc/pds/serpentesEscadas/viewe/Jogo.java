package br.com.ufc.pds.serpentesEscadas.viewe;

import br.com.ufc.pds.serpentesEscadas.tabuleiro.TabuleiroController;
import java.util.Scanner;

public class Jogo {
    public static void main(String[] args) {
        TabuleiroController ctrlTabuleiro = new TabuleiroController();
        
        //Define Casas
        DefinirJogo def = new DefinirJogo();
        def.definirCasas(ctrlTabuleiro);
        
        //Define Jogadores
        def.definirJogadores(ctrlTabuleiro);
                
        //Gameplay
        while(ctrlTabuleiro.nextRodada())
            new Scanner(System.in).nextLine();
    }   
}
