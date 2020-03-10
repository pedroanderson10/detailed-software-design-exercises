
package br.com.ufc.pds.serpentesEscadas.casa;

import br.com.ufc.pds.serpentesEscadas.viewe.Posicao;

public abstract class CasaEspecial extends Casa{
    
    public CasaEspecial(){
        super();
    }
    
    public CasaEspecial(Posicao p){
        super(p);
    }
    public CasaEspecial(int numCasa){
        super(numCasa);
    }
    
    public CasaEspecial(Posicao p, int num){
        super( p,  num);
    }
    
}
