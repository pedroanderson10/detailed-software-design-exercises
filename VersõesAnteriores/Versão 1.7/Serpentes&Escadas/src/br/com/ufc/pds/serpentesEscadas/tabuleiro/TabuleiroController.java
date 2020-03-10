
package br.com.ufc.pds.serpentesEscadas.tabuleiro;

import java.util.Scanner;

public class TabuleiroController implements iTabuleiroController {
 
    private iTabuleiro tabuleiro = null;
    private static TabuleiroController instance = null;
    
    private TabuleiroController(){
        tabuleiro = Tabuleiro.getInstance();
    }
    
    public static TabuleiroController getInstance(){
        if(instance == null)
            instance = new TabuleiroController();
        
        return instance;
    }
    
    // set iCasas Especiais
    
    @Override
    public void setCasa(String nome, int indice){
        tabuleiro.setCasa(nome, indice); 
    }
    
    @Override
    public void setCasa(String nome, int indice, int destino){
        tabuleiro.setCasa(nome, indice, destino);
    }
    
    @Override
    public void addJogador(String nome){
        tabuleiro.addJogador(nome);
    }
    
    private int getNumCasaDestino(int numCasa){
        return tabuleiro.getNumCasaDestino(numCasa);
    }
    
/////////////////////////////
// Métodos da jogabilidade//
////////////////////////////    

    private int jogarDado(){
        return Dado.getInstance().getValorDado();
    }
    
    private void caiuNaRandom() {
        if(tabuleiro.getCaiuNaRand())
            System.out.println(tabuleiro.getNomeJogadorAtual()+" caiu na sorte reves");
    }
    
    private boolean setCasaDestino(int destinoPrimario){
        
        if(destinoPrimario > 98){
            tabuleiro.notifyObserver();
            System.out.println("O jogador(a) "+tabuleiro.getNomeJogadorAtual()+" ganhou");
            return false;
        }
        
        //salva o numero da casa do possivel novo destino
        int destinoSecundario = getNumCasaDestino(destinoPrimario);
        caiuNaRandom();
        /* Atencao!!!
            No caso de casa ser NORMAL, ao chamar getNumCasaDestino, ela retorna 
                seu proprio numero.
            No caso de casa ser ESPECIAL, ao chamar getNumCasaDestino, ela 
                retorna o numero da proximo casa de destino.
        */
        
        while(destinoPrimario != destinoSecundario ){
            destinoPrimario = destinoSecundario;
            destinoSecundario = getNumCasaDestino(destinoSecundario);
            System.out.println("Novo destino: "+(1+destinoPrimario));
        }
        
        tabuleiro.setNumCasaJogadorAtual(destinoPrimario);
        return true;
    }
    
    private boolean rodada(){
        System.out.println(tabuleiro.getNomeJogadorAtual());
         
        int numeroCasaDestino = jogarDado();
        System.out.println("Valor do dado: "+ numeroCasaDestino);
        System.out.println("iCasa atual: "+(tabuleiro.getNumCasaJogadorAtual()+1));        
        
        numeroCasaDestino += tabuleiro.getNumCasaJogadorAtual();
        System.out.println("iCasa destino: "+(numeroCasaDestino+1));
        
        return setCasaDestino(numeroCasaDestino);
    }
    
    @Override
    public boolean nextRodada(){
        if(!rodada())
            return false;
        new Scanner(System.in).nextLine();
        tabuleiro.nextJogador();
        return true;
    }
    
    @Override
    public void addObserver(iObservadorTabuleiro obs) {
        tabuleiro.addObserver(obs);
    }

    @Override
    public void removeObserver() {
        tabuleiro.removeObserver();
    }
    
}
