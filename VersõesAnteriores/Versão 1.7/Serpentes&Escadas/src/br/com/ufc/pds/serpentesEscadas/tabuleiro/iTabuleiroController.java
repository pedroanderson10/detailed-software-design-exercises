
package br.com.ufc.pds.serpentesEscadas.tabuleiro;

public interface iTabuleiroController{
    
    public void setCasa(String nome, int indice);
    
    public void setCasa(String nome, int indice, int destino);
    
    public void addJogador(String nome);
    
    public boolean nextRodada();
    
    public void addObserver(iObservadorTabuleiro obs);

    public void removeObserver();
    
}
