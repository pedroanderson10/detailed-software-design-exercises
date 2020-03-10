
package br.com.ufc.pds.serpentesEscadas.viewe;

import br.com.ufc.pds.serpentesEscadas.tabuleiro.iTabuleiroController;

public class ConfigJogo implements iConfigJogo {
    @Override
    public iTabuleiroController definirCasas(iTabuleiroController ctrlTabuleiro){
        // 7 RANDOM
        ctrlTabuleiro.setCasa("random", 3);
        ctrlTabuleiro.setCasa("random", 20);
        ctrlTabuleiro.setCasa("random", 25);
        ctrlTabuleiro.setCasa("random", 51);
        ctrlTabuleiro.setCasa("random", 71);
        ctrlTabuleiro.setCasa("random", 79);
        ctrlTabuleiro.setCasa("random", 85);
        // 8 ESCADAS
        ctrlTabuleiro.setCasa("escada", 2, 36);
        ctrlTabuleiro.setCasa("escada", 5, 15);
        ctrlTabuleiro.setCasa("escada", 13, 31);
        ctrlTabuleiro.setCasa("escada", 26, 54);
        ctrlTabuleiro.setCasa("escada", 38, 42);
        ctrlTabuleiro.setCasa("escada", 40, 84);
        ctrlTabuleiro.setCasa("escada", 68, 86);
        ctrlTabuleiro.setCasa("escada", 88, 90);
        // 7 COBRAS
        ctrlTabuleiro.setCasa("cobra", 14, 8);
        ctrlTabuleiro.setCasa("cobra", 41, 16);
        ctrlTabuleiro.setCasa("cobra", 48, 11);
        ctrlTabuleiro.setCasa("cobra", 56, 45);
        ctrlTabuleiro.setCasa("cobra", 74, 46);
        ctrlTabuleiro.setCasa("cobra", 87, 35);
        ctrlTabuleiro.setCasa("cobra", 96, 64);
        
        return ctrlTabuleiro;
    }
    
    @Override
    public iTabuleiroController definirJogadores(iTabuleiroController ctrlTabuleiro){
        ctrlTabuleiro.addJogador("Pedro");
        ctrlTabuleiro.addJogador("Lana");
        ctrlTabuleiro.addJogador("Ravi");
        return ctrlTabuleiro;
    }
}

