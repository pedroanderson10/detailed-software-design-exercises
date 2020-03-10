package br.com.ufc.pds.serpentesEscadas.casa;

import br.com.ufc.pds.serpentesEscadas.viewe.Posicao;

public abstract class Casa implements iCasa{
   
    private Posicao posicao;
    private int numCasa;
    
    public Casa(){
        numCasa = 0;
    }

    public Casa(Posicao p){
        numCasa = 0;
        posicao = p;
    }
  
    public Casa(int numCasa){
        this.numCasa = numCasa;
    }
    
    public Casa(Posicao p, int num){
        numCasa = num;
        posicao = p;
    }    
    
     //////////////////////
    // Metodos Get e Set//
    //////////////////////
    
    public void setPosicao(Posicao p){
        posicao = p;
    }
    
    public Posicao getPosicao(){
        return posicao;
    }
    
    public int getNumCasa(){
        return numCasa;
    }
 
    public void setNumCasa(int numCasa){
        this.numCasa = numCasa;
    }
    
}
