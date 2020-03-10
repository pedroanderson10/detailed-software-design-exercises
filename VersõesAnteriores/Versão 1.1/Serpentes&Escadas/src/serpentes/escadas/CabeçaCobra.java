
package serpentes.escadas;

public class CabeçaCobra extends CasaGoTo {
  
    public CabeçaCobra(){
        super();
    }
    
    public CabeçaCobra(Posicao p){
        super(p);
    }
    
    public CabeçaCobra(Posicao p, int casaDestino){
        super(p, casaDestino);
    }
    
    public CabeçaCobra(Posicao p, int numCasa, int casaDestino){
        super( p,  numCasa, casaDestino);
    }
    
    @Override
    public  int getDestino(){
        return super.getCasaDestino();
    }
    
}
