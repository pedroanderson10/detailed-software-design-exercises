
package serpentes.escadas;

public class CasaEscada extends CasaGoTo {
    
    public CasaEscada(){
        super();
    }
    
    public CasaEscada(Posicao p){
        super(p);
    }
    
    public CasaEscada(Posicao p, int casaDestino){
        super(p, casaDestino);
    }
    
    public CasaEscada(Posicao p, int numCasa, int casaDestino){
        super( p,  numCasa, casaDestino);
    }
    
    public CasaEscada(int numCasa, int casaDestino){
        super(numCasa, casaDestino);
    }
    
    
    @Override
    public int getDestino(){
        return super.getCasaDestino();
    }
    
    
    
}
