
package br.com.ufc.pds.serpentesEscadas.jogador;

import br.com.ufc.pds.serpentesEscadas.casa.Casa;
import br.com.ufc.pds.serpentesEscadas.casa.iCasa;
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
    public void addJogador(iJogador iJogador){
        if(canAddJogador())
            listJogador.add(iJogador);
    }
    
   
    @Override
    public iJogador getJogador(int indice){
        return listJogador.get(indice);
    }
   
    public void setListJogador(ArrayList<iJogador> listJogador){
        this.listJogador = listJogador;
    }
    
    public ArrayList<iJogador> getListJogador(){
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
    
    @Override
    public iJogador getJogadorAtual(){
        return listJogador.get(indiceJogadorAtual);
    }
    
    @Override
    public void setCasaJogadorAtual(iCasa casa){
        getJogadorAtual().setCasaAtual(casa);
    }
    
    public iCasa getCasaJogadorAtual(){
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
    
    public iCasa getCasaAtual(int indice){
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
