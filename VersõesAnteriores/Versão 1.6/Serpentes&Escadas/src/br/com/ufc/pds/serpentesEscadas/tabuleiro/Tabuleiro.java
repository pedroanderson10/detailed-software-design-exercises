
package br.com.ufc.pds.serpentesEscadas.tabuleiro;

import br.com.ufc.pds.serpentesEscadas.casa.CasaController;
import br.com.ufc.pds.serpentesEscadas.casa.iCasaController;
import br.com.ufc.pds.serpentesEscadas.jogador.JogadorController;
import br.com.ufc.pds.serpentesEscadas.jogador.iJogadorController;

public class Tabuleiro implements iTabuleiro{
    
    private iCasaController ctrlCasa = null;
    private iJogadorController ctrlJogador = null;
    private static Tabuleiro instance = null;
    
    private Tabuleiro(){
        ctrlCasa = new CasaController();
        ctrlJogador = new JogadorController();
        //this.dado = new Dado();
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
    public iCasaController getCasaController(){
        return ctrlCasa;
    }
    
    @Override
    public void setCasaController(iCasaController c){
        ctrlCasa = c;
    }
    
    @Override
    public iJogadorController getJogadorController(){
        return ctrlJogador;
    }
    
    @Override
    public void setJogadorController(iJogadorController j){
        ctrlJogador = j;
    }
    
   /* @Override
    public Dado getDado(){
        return dado;
    }
        */
}
