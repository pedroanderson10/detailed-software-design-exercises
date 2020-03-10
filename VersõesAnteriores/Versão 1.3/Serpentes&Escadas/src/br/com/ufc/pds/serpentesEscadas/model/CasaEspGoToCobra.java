
package br.com.ufc.pds.serpentesEscadas.model;

public class CasaEspGoToCobra extends CasaEspGoTo {
  
    public CasaEspGoToCobra(){
        super();
    }
    
    public CasaEspGoToCobra(Posicao p){
        super(p);
    }
    
    public CasaEspGoToCobra(Posicao p, int casaDestino){
        super(p, casaDestino);
    }
    
    public CasaEspGoToCobra(Posicao p, int numCasa, int casaDestino){
        super( p,  numCasa, casaDestino);
    }
    
     public CasaEspGoToCobra(int numCasa, int casaDestino){
        super(numCasa, casaDestino);
    }
    
    @Override
    public  int getDestino(){
        return super.getCasaDestino();
    }
    
}
