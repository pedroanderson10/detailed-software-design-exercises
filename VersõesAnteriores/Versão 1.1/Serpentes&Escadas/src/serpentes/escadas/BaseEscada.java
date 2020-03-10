
package serpentes.escadas;

public class BaseEscada extends CasaGoTo {
    
    public BaseEscada(){
        super();
    }
    
    public BaseEscada(Posicao p){
        super(p);
    }
    
    public BaseEscada(Posicao p, int casaDestino){
        super(p, casaDestino);
    }
    
    public BaseEscada(Posicao p, int numCasa, int casaDestino){
        super( p,  numCasa, casaDestino);
    }
    
    
    @Override
    public int getDestino(){
        return super.getCasaDestino();
    }
    
    
    
}
