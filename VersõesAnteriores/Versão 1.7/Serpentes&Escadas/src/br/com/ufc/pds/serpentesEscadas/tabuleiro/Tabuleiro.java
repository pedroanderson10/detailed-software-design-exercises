
package br.com.ufc.pds.serpentesEscadas.tabuleiro;

import br.com.ufc.pds.serpentesEscadas.casa.CasaController;
import br.com.ufc.pds.serpentesEscadas.casa.iCasaController;
import br.com.ufc.pds.serpentesEscadas.jogador.JogadorController;
import br.com.ufc.pds.serpentesEscadas.jogador.iJogadorController;

public class Tabuleiro implements iTabuleiro{
    
    private iCasaController ctrlCasa = null;
    private iJogadorController ctrlJogador = null;
    private static Tabuleiro instance = null;
    private iObservadorTabuleiro observador = null;
    
    private Tabuleiro(){
        ctrlCasa = new CasaController();
        ctrlJogador = new JogadorController();
    }
    
    public static Tabuleiro getInstance(){
        if(instance == null)
            instance = new Tabuleiro();
        
        return instance;
    }
    
    //////////////////////
    // Metodos Get e Set//
    //////////////////////
    
    @Override
    public void setCasa(String nome, int indice){
        ctrlCasa.setCasa(nome, indice, ctrlCasa ); 
    }
    
    
    @Override
    public void setCasa(String nome, int indice, int destino){
        ctrlCasa.setCasa(nome, indice, destino);
    }
        
    // add set get iCasa

    @Override
    public int getNumCasaDestino(int indice){
        return ctrlCasa.getNumCasaDestino(indice);
    }
    
    // add set get Jogador

    @Override
    public void addJogador(String nome){
        ctrlJogador.addJogador(nome);
    }
    
    @Override
    public String getNomeJogadorAtual(){
        return ctrlJogador.getNomeJogadorAtual();
    }
    
    @Override
    public int getNumCasaJogadorAtual(){
        return ctrlJogador.getNumCasaJogadorAtual();
    }
    
    
    @Override
    public void setNumCasaJogadorAtual(int numCasa){
        ctrlJogador.setNumCasaJogadorAtual(numCasa);
    }
    
    @Override
    public void nextJogador() {
        ctrlJogador.nextJogador();
    }

    @Override
    public boolean getCaiuNaRand() {
        return ctrlCasa.getCaiuNaRand();
    }
    
    
    @Override
    public void addObserver(iObservadorTabuleiro obs) {
        observador = obs;
    }

    @Override
    public void removeObserver() {
        observador = null;
    }

    @Override
    public void notifyObserver() {
        observador.fimDeJogo();
    }
}
