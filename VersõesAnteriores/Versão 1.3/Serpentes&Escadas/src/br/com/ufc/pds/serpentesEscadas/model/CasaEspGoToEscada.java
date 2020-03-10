
package br.com.ufc.pds.serpentesEscadas.model;

public class CasaEspGoToEscada extends CasaEspGoTo {
    
    public CasaEspGoToEscada(){
        super();
    }
    
    public CasaEspGoToEscada(Posicao p){
        super(p);
    }
    
    public CasaEspGoToEscada(Posicao p, int casaDestino){
        super(p, casaDestino);
    }
    
    public CasaEspGoToEscada(Posicao p, int numCasa, int casaDestino){
        super( p,  numCasa, casaDestino);
    }
    
    public CasaEspGoToEscada(int numCasa, int casaDestino){
        super(numCasa, casaDestino);
    }
    
    
    @Override
    public int getDestino(){
        return super.getCasaDestino();
    }
    
}
