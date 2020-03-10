
package br.com.ufc.pds.serpentesEscadas.jogador;

import br.com.ufc.pds.serpentesEscadas.viewe.Posicao;

public class Jogador implements iJogador{ 
    
    private String nome = "";
    
    private Posicao posicaoNoTabuleiro = null;
    private int numCasa = 0;
    
    
    public Jogador(){
    }
    
    public Jogador(String nome, Posicao posicaoNoTabuleiro){
        this.nome = nome;
        this.posicaoNoTabuleiro = posicaoNoTabuleiro;
        this.numCasa = 0;
    }
    
    public Jogador(String nome){
        this.nome = nome;
        this.numCasa = 0;
    }    
    //////////////////////
    // Metodos Get e Set//
    //////////////////////
    
    @Override
    public void setPosicao(Posicao p){
        this.posicaoNoTabuleiro = p;
    }
    
    @Override
    public Posicao getPosicao(){
        return posicaoNoTabuleiro;
    }
    
    @Override
    public void setNumCasa(int numCasa){
        this.numCasa = numCasa;
    }
    
    @Override
    public int getNumCasa(){
        return numCasa;
    }
    
    
    @Override
    public String getNome(){
        return nome;
    }
    
    @Override
    public void setNome(String nome){
        this.nome = nome;
    }
    
}   

