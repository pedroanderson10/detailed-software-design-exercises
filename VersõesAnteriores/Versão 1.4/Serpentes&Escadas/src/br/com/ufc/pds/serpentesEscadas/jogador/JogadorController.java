
package br.com.ufc.pds.serpentesEscadas.jogador;

import br.com.ufc.pds.serpentesEscadas.casa.Casa;
import br.com.ufc.pds.serpentesEscadas.viewe.Posicao;
import java.util.ArrayList;


public class JogadorController {
    
    private ArrayList<Jogador> listJogador = null;
    private Integer indiceJogadorAtual = null;

    
    public JogadorController(){
        listJogador = new ArrayList<>();
        indiceJogadorAtual = 0;
    }
    
    public void addJogador(Jogador jogador){
        if(canAddJogador())
            listJogador.add(jogador);
    }
    
    public Jogador getJogador(int indice){
        return listJogador.get(indice);
    }
   
    public void setListJogador(ArrayList<Jogador> listJogador){
        this.listJogador = listJogador;
    }
    
    public ArrayList<Jogador> getListJogador(){
        return listJogador;
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
    
    public Jogador getJogadorAtual(){
        return listJogador.get(indiceJogadorAtual);
    }
    
    public void setCasaJogadorAtual(Casa casa){
        getJogadorAtual().setCasaAtual(casa);
    }
    
    public Casa getCasaJogadorAtual(){
        return getJogadorAtual().getCasaAtual();
    }
    
    public int getNumCasaJogadorAtual(){
        return getCasaJogadorAtual().getNumCasa();
    }
    
    ///////////////////////////////////////
    // Metodos get e set jogador da lista//
    ///////////////////////////////////////
    
    public String getNome(int indice){
        return listJogador.get(indice).getNome();
    }
    
    public void setNome(int indice, String nome){
        listJogador.get(indice).setNome(nome);
    }
    
    public Casa getCasaAtual(int indice){
        return listJogador.get(indice).getCasaAtual();
    }
    
    public void setCasaAtual(int indice, Casa casa){
        listJogador.get(indice).setCasaAtual(casa);
    }
    
    public Posicao getPosicao(int indice){
        return listJogador.get(indice).getPosicao();
    }
    
    public void setPosicao(int indice, Posicao posicao){
        listJogador.get(indice).setPosicao(posicao);
    }
    
    private boolean canAddJogador(){
        return (listJogador.size() < 4);
    }
    
    public void nextJogador(){
        if(indiceJogadorAtual == listJogador.size()-1)
            indiceJogadorAtual = 0;
        else
            indiceJogadorAtual++;
    }
}
