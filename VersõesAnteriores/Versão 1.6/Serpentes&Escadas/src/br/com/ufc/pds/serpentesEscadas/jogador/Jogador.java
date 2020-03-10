
package br.com.ufc.pds.serpentesEscadas.jogador;

import br.com.ufc.pds.serpentesEscadas.casa.CasaNormal;
import br.com.ufc.pds.serpentesEscadas.casa.iCasa;
import br.com.ufc.pds.serpentesEscadas.viewe.Posicao;

public class Jogador implements iJogador{ 
    
    private String nome = "";
    
    private Posicao posicaoNoTabuleiro = null;
    private iCasa casaAtual = null;
    
    
    public Jogador(){
    }
    
    public Jogador(String nome, Posicao posicaoNoTabuleiro){
        this.nome = nome;
        this.posicaoNoTabuleiro = posicaoNoTabuleiro;
        this.casaAtual = new CasaNormal(0);
    }
    
    public Jogador(String nome){
        this.nome = nome;
        this.casaAtual = new CasaNormal(0);
    }
     
     ///////////////////////////
    // Metodo return casaAtual//
    ////////////////////////////
    
    @Override
    public int getIndiceCasaAtual(){
        return casaAtual.getNumCasa();
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
    public void setCasaAtual(iCasa c){
        casaAtual = c;
    }
    
    @Override
    public iCasa getCasaAtual(){
        return casaAtual;
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

