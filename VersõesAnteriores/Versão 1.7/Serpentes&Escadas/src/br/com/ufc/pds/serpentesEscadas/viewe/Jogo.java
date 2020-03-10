package br.com.ufc.pds.serpentesEscadas.viewe;

import br.com.ufc.pds.serpentesEscadas.tabuleiro.TabuleiroController;
import br.com.ufc.pds.serpentesEscadas.tabuleiro.iObservadorTabuleiro;
import br.com.ufc.pds.serpentesEscadas.tabuleiro.iTabuleiroController;

public class Jogo implements iObservadorTabuleiro{
   
    private static boolean jogoAtivo = true;
    
    public static void main(String[] args) {
        iTabuleiroController ctrlTabuleiro = TabuleiroController.getInstance();
        
        ctrlTabuleiro.addObserver(new Jogo());
        //Define Casas e Jogadores
        iConfigJogo cfg = new ConfigJogo();
        ctrlTabuleiro = cfg.definirCasas(ctrlTabuleiro);
        ctrlTabuleiro = cfg.definirJogadores(ctrlTabuleiro);
                
        //Gameplay
        while(jogoAtivo)
            ctrlTabuleiro.nextRodada();
        
        
    }   

    @Override
    public void fimDeJogo() {
        jogoAtivo = false;
    }
}
