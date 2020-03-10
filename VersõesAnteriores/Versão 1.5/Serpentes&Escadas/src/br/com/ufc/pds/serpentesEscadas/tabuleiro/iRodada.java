
package br.com.ufc.pds.serpentesEscadas.tabuleiro;

public interface iRodada {
    
    public int jogarDado();
    public boolean setCasaDestino(int numeroiCasaDestino);
    public boolean rodada();
    public boolean nextRodada();
    
}
