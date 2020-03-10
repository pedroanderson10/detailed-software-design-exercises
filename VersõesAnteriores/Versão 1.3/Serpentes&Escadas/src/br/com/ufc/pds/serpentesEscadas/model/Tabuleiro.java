
package br.com.ufc.pds.serpentesEscadas.model;

import br.com.ufc.pds.serpentesEscadas.model.controller.CasaController;
import br.com.ufc.pds.serpentesEscadas.model.controller.JogadorController;

public class Tabuleiro {
    
    private CasaController ctrlCasa = null;
    private JogadorController ctrlJogador = null;
    
    private Dado dado = null;
    
    public Tabuleiro(){
        ctrlCasa = new CasaController();
        ctrlJogador = new JogadorController();
        this.dado = new Dado();
    }
    
    public CasaController getCasaController(){
        return ctrlCasa;
    }
    
    public void setCasaController(CasaController c){
        ctrlCasa = c;
    }
    
    public JogadorController getJogadorController(){
        return ctrlJogador;
    }
    
    public void setJogadorController(JogadorController j){
        ctrlJogador = j;
    }
    
    public Dado getDado(){
        return dado;
    }
    
    
    
}
