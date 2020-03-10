
package serpentes.escadas;

import java.util.Random;

public class CasaRandom extends CasasEspeciais implements iCasaRandom{
    
    public CasaRandom(){
        super();
    }
    
    public CasaRandom(Posicao p){
        super(p);
    }
    public CasaRandom(Posicao p, int num){
        super( p,  num);
    }
    
    public CasaRandom(int numCasa){
        super(numCasa);
    }
    
    @Override
    public int getDestino(){
        int des =  (new Random().nextInt(2) == 0)? 
            getDestinoReves():
            getDestinoSorte();
        System.out.println("Destino "+(des+1));
        return des;
    }
    
    @Override
    public int getDestinoSorte(){
        return super.getNumCasa()+ 1 + new Random().nextInt(3);
    }
    
    @Override
    public int getDestinoReves(){
        return super.getNumCasa() - (1+new Random().nextInt(3));
    }

}
