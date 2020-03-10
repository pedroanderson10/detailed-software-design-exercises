
package br.com.ufc.pds.serpentesEscadas.jogador;

import br.com.ufc.pds.serpentesEscadas.casa.Casa;
import br.com.ufc.pds.serpentesEscadas.casa.CasaNormal;
import br.com.ufc.pds.serpentesEscadas.viewe.Posicao;

public class Jogador { 
    
    private String nome = "";
    
    private Posicao posicaoNoTabuleiro = null;
    private Casa casaAtual = null;
    
    
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
    
    public int getIndiceCasaAtual(){
        return casaAtual.getNumCasa();
    }
    
     //////////////////////
    // Metodos Get e Set//
    //////////////////////
    
    public void setPosicao(Posicao p){
        this.posicaoNoTabuleiro = p;
    }
    
    public Posicao getPosicao(){
        return posicaoNoTabuleiro;
    }
    
    public void setCasaAtual(Casa c){
        casaAtual = c;
    }
    
    public Casa getCasaAtual(){
        return casaAtual;
    }
    
    public String getNome(){
        return nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
}   

