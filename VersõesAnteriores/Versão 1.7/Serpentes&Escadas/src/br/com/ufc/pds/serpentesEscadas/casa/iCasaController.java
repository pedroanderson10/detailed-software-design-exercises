
package br.com.ufc.pds.serpentesEscadas.casa;


public interface iCasaController extends iObservadorCasa{
    public void setCasa(String nome,int indice);
    public void setCasa(String nome,int indice, iObservadorCasa obs);
    public void setCasa(String nome,int indice, int destino);
    public iCasa getCasa(int indice);
    public int getNumCasaDestino(int indice);
    public boolean getCaiuNaRand();
}

