package serpentes.escadas;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Tabuleiro tabuleiro = new Tabuleiro();
        
        tabuleiro.setListCasaNormal();
        // 7 RANDOM
        tabuleiro.setCasaRandom(3);
        tabuleiro.setCasaRandom(20);
        tabuleiro.setCasaRandom(25);
        tabuleiro.setCasaRandom(51);
        tabuleiro.setCasaRandom(71);
        tabuleiro.setCasaRandom(79);
        tabuleiro.setCasaRandom(85);
        // 8 ESCADAS
        tabuleiro.setCasaEscada(2, 36);
        tabuleiro.setCasaEscada(5, 15);
        tabuleiro.setCasaEscada(13, 31);
        tabuleiro.setCasaEscada(26, 54);
        tabuleiro.setCasaEscada(38, 42);
        tabuleiro.setCasaEscada(40, 84);
        tabuleiro.setCasaEscada(68, 86);
        tabuleiro.setCasaEscada(88, 90);
        // 7 COBRAS
        tabuleiro.setCasaCobra(14, 8);
        tabuleiro.setCasaCobra(41, 16);
        tabuleiro.setCasaCobra(48, 11);
        tabuleiro.setCasaCobra(56, 45);
        tabuleiro.setCasaCobra(74, 46);
        tabuleiro.setCasaCobra(87, 35);
        tabuleiro.setCasaCobra(96, 64);
        
        
        tabuleiro.addJogador(new Jogador("Pedro"));
        tabuleiro.addJogador(new Jogador("Lana"));
        tabuleiro.addJogador(new Jogador("Ravi"));
   
        
        while(tabuleiro.fazJogada())
            new Scanner(System.in).nextLine();
    
/*        do{
            Jogador jogador = tabuleiro.getJogadorAtual();
            System.out.println(jogador.getNome());
            
            System.out.println(tabuleiro.getJogadorAtual());
        }while(tabuleiro.fazJogada());
 */       
    }   
}
