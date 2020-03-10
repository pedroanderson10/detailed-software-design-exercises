
package br.com.ufc.pds.serpentesEscadas.viewe;

import br.com.ufc.pds.serpentesEscadas.casa.TipoCasa;
import br.com.ufc.pds.serpentesEscadas.jogador.Jogador;
import br.com.ufc.pds.serpentesEscadas.tabuleiro.iTabuleiroController;

public class ConfigJogo implements iConfigJogo {
    @Override
    public iTabuleiroController definirCasas(iTabuleiroController ctrlTabuleiro){
        // 7 RANDOM
        ctrlTabuleiro.setCasa(TipoCasa.RANDOM, 3);
        ctrlTabuleiro.setCasa(TipoCasa.RANDOM, 20);
        ctrlTabuleiro.setCasa(TipoCasa.RANDOM, 25);
        ctrlTabuleiro.setCasa(TipoCasa.RANDOM, 51);
        ctrlTabuleiro.setCasa(TipoCasa.RANDOM, 71);
        ctrlTabuleiro.setCasa(TipoCasa.RANDOM, 79);
        ctrlTabuleiro.setCasa(TipoCasa.RANDOM, 85);
        // 8 ESCADAS
        ctrlTabuleiro.setCasa(TipoCasa.ESCADA, 2, 36);
        ctrlTabuleiro.setCasa(TipoCasa.ESCADA, 5, 15);
        ctrlTabuleiro.setCasa(TipoCasa.ESCADA, 13, 31);
        ctrlTabuleiro.setCasa(TipoCasa.ESCADA, 26, 54);
        ctrlTabuleiro.setCasa(TipoCasa.ESCADA, 38, 42);
        ctrlTabuleiro.setCasa(TipoCasa.ESCADA, 40, 84);
        ctrlTabuleiro.setCasa(TipoCasa.ESCADA, 68, 86);
        ctrlTabuleiro.setCasa(TipoCasa.ESCADA, 88, 90);
        // 7 COBRAS
        ctrlTabuleiro.setCasa(TipoCasa.COBRA, 14, 8);
        ctrlTabuleiro.setCasa(TipoCasa.COBRA, 41, 16);
        ctrlTabuleiro.setCasa(TipoCasa.COBRA, 48, 11);
        ctrlTabuleiro.setCasa(TipoCasa.COBRA, 56, 45);
        ctrlTabuleiro.setCasa(TipoCasa.COBRA, 74, 46);
        ctrlTabuleiro.setCasa(TipoCasa.COBRA, 87, 35);
        ctrlTabuleiro.setCasa(TipoCasa.COBRA, 96, 64);
        
        return ctrlTabuleiro;
    }
    
    @Override
    public iTabuleiroController definirJogadores(iTabuleiroController ctrlTabuleiro){
        ctrlTabuleiro.addJogador(new Jogador("Pedro"));
        ctrlTabuleiro.addJogador(new Jogador("Lana"));
        ctrlTabuleiro.addJogador(new Jogador("Ravi"));
        return ctrlTabuleiro;
    }
}

