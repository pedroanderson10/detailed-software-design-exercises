
package br.com.ufc.pds.serpentesEscadas.casa;

import br.com.ufc.pds.serpentesEscadas.viewe.Posicao;

public class CasaNormal extends Casa {
    
    public CasaNormal(){
        super();
    }
    
    public CasaNormal(Posicao p){
        super(p);
    }
   
    public CasaNormal(int numCasa){
        super(numCasa);
    }
    public CasaNormal(Posicao p, int num){
        super( p,  num);
    }
    
    @Override
    public int getDestino(){
        return super.getNumCasa();
    }
}
