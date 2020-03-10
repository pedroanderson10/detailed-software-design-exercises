
package br.com.ufc.pds.serpentesEscadas.model;

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
