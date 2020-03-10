package br.com.ufc.pds.serpentesEscadas.model;

import br.com.ufc.pds.serpentesEscadas.model.controller.TabuleiroController;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TabuleiroController ctrlTabuleiro = new TabuleiroController();
        
        // 7 RANDOM
        ctrlTabuleiro.setCasaRandom(3);
        ctrlTabuleiro.setCasaRandom(20);
        ctrlTabuleiro.setCasaRandom(25);
        ctrlTabuleiro.setCasaRandom(51);
        ctrlTabuleiro.setCasaRandom(71);
        ctrlTabuleiro.setCasaRandom(79);
        ctrlTabuleiro.setCasaRandom(85);
        // 8 ESCADAS
        ctrlTabuleiro.setCasaEscada(2, 36);
        ctrlTabuleiro.setCasaEscada(5, 15);
        ctrlTabuleiro.setCasaEscada(13, 31);
        ctrlTabuleiro.setCasaEscada(26, 54);
        ctrlTabuleiro.setCasaEscada(38, 42);
        ctrlTabuleiro.setCasaEscada(40, 84);
        ctrlTabuleiro.setCasaEscada(68, 86);
        ctrlTabuleiro.setCasaEscada(88, 90);
        // 7 COBRAS
        ctrlTabuleiro.setCasaCobra(14, 8);
        ctrlTabuleiro.setCasaCobra(41, 16);
        ctrlTabuleiro.setCasaCobra(48, 11);
        ctrlTabuleiro.setCasaCobra(56, 45);
        ctrlTabuleiro.setCasaCobra(74, 46);
        ctrlTabuleiro.setCasaCobra(87, 35);
        ctrlTabuleiro.setCasaCobra(96, 64);
        
        
        ctrlTabuleiro.addJogador(new Jogador("Pedro"));
        ctrlTabuleiro.addJogador(new Jogador("Lana"));
        ctrlTabuleiro.addJogador(new Jogador("Ravi"));
   
        
        while(ctrlTabuleiro.fazJogada())
            new Scanner(System.in).nextLine();
    
/*        do{
            Jogador jogador = ctrlTabuleiro.getJogadorAtual();
            System.out.println(jogador.getNome());
            
            System.out.println(ctrlTabuleiro.getJogadorAtual());
        }while(ctrlTabuleiro.fazJogada());
 */       
    }   
}
