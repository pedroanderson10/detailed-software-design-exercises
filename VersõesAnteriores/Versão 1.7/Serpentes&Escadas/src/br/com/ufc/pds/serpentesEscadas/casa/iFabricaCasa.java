

package br.com.ufc.pds.serpentesEscadas.casa;

import br.com.ufc.pds.serpentesEscadas.viewe.Posicao;

public interface iFabricaCasa {
    public iCasa criaCasa(String nome, Posicao p, int indice, int destino,
        iObservadorCasa obs) ;
    public iCasa criaCasa(String nome, int indice, iObservadorCasa obs);
    public iCasa criaCasa(String nome, Posicao p, int indice);
    public iCasa criaCasa(String nome, int indice, int destino);
    public iCasa criaCasa(String nome, int indice);
}
