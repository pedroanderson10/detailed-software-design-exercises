
package br.com.ufc.pds.serpentesEscadas.casa;

import br.com.ufc.pds.serpentesEscadas.viewe.Posicao;
import java.util.Random;

public class CasaEspRandom extends CasaEspecial implements iObservavelCasa{
    iObservadorCasa obs;
    iEstrategia sorteReves;
    
    public CasaEspRandom(){
        super();
    }
    
    public CasaEspRandom(Posicao p){
        super(p);
    }
    public CasaEspRandom(Posicao p, int num, iObservadorCasa obs){
        super( p,  num);
        this.obs = obs;
    }
    
    public CasaEspRandom(int numCasa, iObservadorCasa obs){
        super(numCasa);
        this.obs = obs;
    }
    
    @Override
    public int getDestino(){
        notifyObserver();
        return randomSorteReves().getDestinoRandom(super.getNumCasa());
    }
    
    private iEstrategia randomSorteReves(){
        return (new Random().nextInt(2) == 0)? 
            new CasaEspRandomRaves():
            new CasaEspRandomSorte();
    }

    @Override
    public void addObserver(iObservadorCasa obs) {
        this.obs = obs;
    }

    @Override
    public void removeObserver() {
        this.obs = null;
    }

    @Override
    public void notifyObserver() {
        this.obs.caiuNaRandom();
    }
    
}
