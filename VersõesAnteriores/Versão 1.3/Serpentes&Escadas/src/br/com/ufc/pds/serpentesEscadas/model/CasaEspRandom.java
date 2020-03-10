
package br.com.ufc.pds.serpentesEscadas.model;

import java.util.Random;

public class CasaEspRandom extends CasaEspecial implements iCasaRandom{
    
    public CasaEspRandom(){
        super();
    }
    
    public CasaEspRandom(Posicao p){
        super(p);
    }
    public CasaEspRandom(Posicao p, int num){
        super( p,  num);
    }
    
    public CasaEspRandom(int numCasa){
        super(numCasa);
    }
    
    @Override
    public int getDestino(){
        return (new Random().nextInt(2) == 0)? 
            getDestinoReves():
            getDestinoSorte();
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
