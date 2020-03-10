
package serpentes.escadas;

public abstract class CasaGoTo extends CasasEspeciais{
    private int casaDestino;
    
    public CasaGoTo(){
        super();
    }
    
    public CasaGoTo(Posicao p){
        super(p);
    }
    
    public CasaGoTo(Posicao p, int casaDestino){
        super(p);
        this.casaDestino = casaDestino;
    }
    
    public CasaGoTo(Posicao p, int numCasa, int casaDestino){
        super( p,  numCasa);
        this.casaDestino = casaDestino;
    }
    
    
    public void setCasaDestino(int destino){
        this.casaDestino = destino;
    }
    
    public int getCasaDestino(){
        return this.casaDestino;
    }
}
