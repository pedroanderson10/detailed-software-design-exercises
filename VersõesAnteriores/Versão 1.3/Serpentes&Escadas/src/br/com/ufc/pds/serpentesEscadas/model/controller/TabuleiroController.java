
package br.com.ufc.pds.serpentesEscadas.model.controller;

import br.com.ufc.pds.serpentesEscadas.model.Casa;
import br.com.ufc.pds.serpentesEscadas.model.Jogador;
import br.com.ufc.pds.serpentesEscadas.model.Tabuleiro;

public class TabuleiroController {
 
    private Tabuleiro tabuleiro = null;
    
    public TabuleiroController(){
        tabuleiro = new Tabuleiro();
        tabuleiro.getCasaController().setListCasaNormal();
    }
    
    // set Casas Especiais
    
    public void setCasaCobra(int indice, int destino){
        tabuleiro.getCasaController().setCasaCobra(indice, destino);
    }
    public void setCasaEscada(int indice, int destino){
        tabuleiro.getCasaController().setCasaEscada( indice, destino);
    }
    public void setCasaRandom(int indice){
        tabuleiro.getCasaController().setCasaRandom(indice);
    }
        
    // add set get Casa
    
    public void addCasa(Casa casa){
        tabuleiro.getCasaController().addCasa(casa);
    }
    
    public Casa getCasa(int indice){
        return tabuleiro.getCasaController().getCasa(indice);
    }
    
    // add set get Jogador
    
    public void addJogador(Jogador jogador){
        tabuleiro.getJogadorController().addJogador(jogador);
    }
    
    public Jogador getJogador(int indice){
        return tabuleiro.getJogadorController().getJogador(indice);
    }
    
    public void setCasaJogadorAtual(Casa casa){
        tabuleiro.getJogadorController().setCasaJogadorAtual(casa);
    }
    
  /*  public void setJogadorAtual(Jogador jogador){
        tabuleiro.getJogadorController().setJogadorAtual(jogador);
    }*/
    
    public Jogador getJogadorAtual(){
        return tabuleiro.getJogadorController().getJogadorAtual();
    }
    
    private int jogarDado(){
        return tabuleiro.getDado().getValorDado();
    }
    
    public boolean fazJogada(){
        int numeroCasaDestino = jogarDado();
        System.out.println("Valor do dado: "+ numeroCasaDestino);
        
        System.out.println(getJogadorAtual().getNome());
        System.out.println("Casa atual: "+(getJogadorAtual().getIndiceCasaAtual()+1));
        
        // Primeiro destino     
        numeroCasaDestino += getJogadorAtual().getIndiceCasaAtual();
        
        if(numeroCasaDestino > 98){
            System.out.println("O jogador(a) "+getJogadorAtual().getNome()+" ganhou");
            return false;
        }
        
        System.out.println("Casa destino: "+(getCasa(numeroCasaDestino).getNumCasa()+1));
        
        //numeroCasaDestino = getCasa(numeroCasaDestino).getDestino();
        //System.out.println("Teste numDes> "+(numDes+1));
        Casa casa = getCasa(numeroCasaDestino);
        numeroCasaDestino = casa.getDestino();
        //System.out.println("Novo destino antes while: "+(1+casaDestino.getNumCasa()));
        // Confure se existe um segundo destino
        while(numeroCasaDestino != casa.getNumCasa() ){
            casa = getCasa(numeroCasaDestino);
            numeroCasaDestino = casa.getDestino();
            System.out.println("Novo destino: "+(1+numeroCasaDestino));
        }
        System.out.println("Casa destino final: "+(1+ numeroCasaDestino));
        setCasaJogadorAtual(casa);
        //System.out.println("Casa destino final jogador: "+(1+ jogador.getCasaAtual().getNumCasa()));
        tabuleiro.getJogadorController().nextJogador();
        return true;
    }
    
}
