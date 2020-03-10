
package br.com.ufc.pds.serpentesEscadas.tabuleiro;

public interface iTabuleiro extends iObeservavelTabuleiro{
    
    public void setCasa(String nome, int indice);
    public void setCasa(String nome, int indice, int destino);
    public void addJogador(String nome);
    public String getNomeJogadorAtual();
    public void setNumCasaJogadorAtual(int numCasa);
    public int getNumCasaDestino(int indiceCasa);
    public int getNumCasaJogadorAtual();
    public void nextJogador();
    public boolean getCaiuNaRand();
    
}
