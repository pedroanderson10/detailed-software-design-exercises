
package br.com.ufc.pds.serpentesEscadas.casa;


public interface iCasaController extends iObservadorCasa{
    public void setCasa(String nome,int x, int y,int indice);
    public void setCasa(String nome,int x, int y,int indice, int destino);
    public void setCasa(String nome,int x, int y, int indice, iObservadorCasa obs);
    public iCasa getCasa(int indice);
    public int getNumCasaDestino(int indice);
    public boolean getCaiuNaRand();
}

