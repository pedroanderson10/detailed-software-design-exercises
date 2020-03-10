
package serpentes.escadas;

public class CasaCobra extends CasaGoTo {
  
    public CasaCobra(){
        super();
    }
    
    public CasaCobra(Posicao p){
        super(p);
    }
    
    public CasaCobra(Posicao p, int casaDestino){
        super(p, casaDestino);
    }
    
    public CasaCobra(Posicao p, int numCasa, int casaDestino){
        super( p,  numCasa, casaDestino);
    }
    
     public CasaCobra(int numCasa, int casaDestino){
        super(numCasa, casaDestino);
    }
    
    @Override
    public  int getDestino(){
        return super.getCasaDestino();
    }
    
}
