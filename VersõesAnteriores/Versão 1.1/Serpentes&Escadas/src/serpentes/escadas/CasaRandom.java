
package serpentes.escadas;

import java.util.Random;

public abstract class CasaRandom extends CasasEspeciais {
  
    public CasaRandom(){
        super();
    }
    
    public CasaRandom(Posicao p){
        super(p);
    }
    public CasaRandom(Posicao p, int num){
        super( p,  num);
    }
    
    @Override
    public int getDestino(){
        CasaRandom casa = escolheSorteReves();
        return casa.getDestinoRandom();
    }
    
    public CasaRandom escolheSorteReves(){
        return (new Random().nextInt(1) == 0)? 
            new CasaRevés():
            new CasaSorte();
    }
    
    public abstract int getDestinoRandom();
}
