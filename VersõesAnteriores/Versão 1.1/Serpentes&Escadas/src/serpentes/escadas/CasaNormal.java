
package serpentes.escadas;

public class CasaNormal extends Casa {
    
    public CasaNormal(){
        super();
    }
    
    public CasaNormal(Posicao p){
        super(p);
    }
    public CasaNormal(Posicao p, int num){
        super( p,  num);
    }
    
    public  void goToCasa(){
        super.setNumCasa(2);
    }
    
    public int getDestino(){
        return super.getNumCasa();
    }
}
