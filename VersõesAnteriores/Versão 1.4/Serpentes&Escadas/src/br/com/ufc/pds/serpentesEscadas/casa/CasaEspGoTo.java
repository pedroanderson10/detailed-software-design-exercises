
package br.com.ufc.pds.serpentesEscadas.casa;

import br.com.ufc.pds.serpentesEscadas.viewe.Posicao;

public abstract class CasaEspGoTo extends CasaEspecial{
    private int casaDestino;
    
    public CasaEspGoTo(){
        super();
    }
    
    public CasaEspGoTo(Posicao p){
        super(p);
    }
    
    public CasaEspGoTo(Posicao p, int casaDestino){
        super(p);
        this.casaDestino = casaDestino;
    }
    
    public CasaEspGoTo(Posicao p, int numCasa, int casaDestino){
        super( p,  numCasa);
        this.casaDestino = casaDestino;
    }
    
    public CasaEspGoTo(int numCasa, int casaDestino){
        super(numCasa);
        this.casaDestino = casaDestino;
    }
    
     //////////////////////
    // Metodos Get e Set//
    //////////////////////
    
    public void setCasaDestino(int destino){
        this.casaDestino = destino;
    }
    
    public int getCasaDestino(){
        return this.casaDestino;
    }
}
