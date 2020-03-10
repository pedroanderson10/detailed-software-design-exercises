
package br.com.ufc.pds.serpentesEscadas.jogador;

import br.com.ufc.pds.serpentesEscadas.viewe.Posicao;
import java.util.ArrayList;


public class JogadorController implements iJogadorController{
    
    private ArrayList<iJogador> listJogador = null;
    private Integer indiceJogadorAtual = null;

    
    public JogadorController(){
        listJogador = new ArrayList<>();
        indiceJogadorAtual = 0;
    }
    
    @Override
    public void addJogador(String nome){
        if(canAddJogador())
            listJogador.add(new Jogador(nome));
    }
    
    ////////////////////////////////////////////////
    // Metodos get e set do jogador atual da lista//
    ////////////////////////////////////////////////
    
    public int getIndiceJogadorAtual(){
        return indiceJogadorAtual;
    }
    
    public void setIndiceJogadorAtual(int indiceJogador){
        indiceJogadorAtual = indiceJogador;
    } 
    
    private iJogador getJogadorAtual(){
        return listJogador.get(indiceJogadorAtual);
    }
    
    @Override
    public String getNomeJogadorAtual(){
        return getJogadorAtual().getNome();
    }
    
    @Override
    public void setNumCasaJogadorAtual(int numCasa){
        getJogadorAtual().setNumCasa(numCasa);
    }
    
    @Override
    public int getNumCasaJogadorAtual(){
        return getJogadorAtual().getNumCasa();
    }
    
    public Posicao getPosicaoJogadorAtual(int indice){
        return getJogadorAtual().getPosicao();
    }
    
    public void setPosicaoJogadorAtual(int indice, Posicao posicao){
        getJogadorAtual().setPosicao(posicao);
    }
    
    ///////////////////////////////////////
    // Metodos get e set jogador da lista//
    ///////////////////////////////////////
    
    private boolean canAddJogador(){
        return (listJogador.size() < 4);
    }
    
    @Override
    public void nextJogador(){
        if(indiceJogadorAtual == listJogador.size()-1)
            indiceJogadorAtual = 0;
        else
            indiceJogadorAtual++;
    }
}
