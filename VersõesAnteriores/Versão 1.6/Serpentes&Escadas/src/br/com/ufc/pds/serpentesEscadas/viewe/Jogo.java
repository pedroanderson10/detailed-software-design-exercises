package br.com.ufc.pds.serpentesEscadas.viewe;

import br.com.ufc.pds.serpentesEscadas.tabuleiro.TabuleiroController;
import br.com.ufc.pds.serpentesEscadas.tabuleiro.iTabuleiroController;
import java.util.Scanner;

public class Jogo {
    public static void main(String[] args) {
        iTabuleiroController ctrlTabuleiro = TabuleiroController.getInstance();
        
        //Define Casas e Jogadores
        iConfigJogo cfg = new ConfigJogo();
        ctrlTabuleiro = cfg.definirCasas(ctrlTabuleiro);
        ctrlTabuleiro = cfg.definirJogadores(ctrlTabuleiro);
                
        //Gameplay
        while(ctrlTabuleiro.nextRodada())
            new Scanner(System.in).nextLine();
    }   
}
