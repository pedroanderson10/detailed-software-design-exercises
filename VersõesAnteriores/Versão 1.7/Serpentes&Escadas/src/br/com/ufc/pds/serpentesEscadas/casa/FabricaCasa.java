
package br.com.ufc.pds.serpentesEscadas.casa;

import br.com.ufc.pds.serpentesEscadas.viewe.Posicao;

public class FabricaCasa implements iFabricaCasa{

    @Override
    public iCasa criaCasa(String nome, Posicao p, int indice, int destino,
            iObservadorCasa obs) {
        switch(nome){
            case "normal":
                return new CasaNormal(p, indice);
            case "random":
                return new CasaEspRandom(p, indice, obs);
            case "cobra":
                return new CasaEspGoToCobra(p, indice, destino);
            case "escada":
                return new CasaEspGoToEscada(p, indice, destino);
            default:
                return null;
        }
    }
    
    @Override
    public iCasa criaCasa(String nome, Posicao p, int indice) {
        return criaCasa(nome, p, indice, 0, null);
    }
    
    @Override
    public iCasa criaCasa(String nome, int indice) {
        return criaCasa(nome, null, indice);
    }
    
    @Override
    public iCasa criaCasa(String nome, int indice, iObservadorCasa obs) {
        return criaCasa(nome, null, indice,0 ,obs);
    }
    
    @Override
    public iCasa criaCasa(String nome, int indice, int destino) {
        return criaCasa(nome, null, indice, destino, null);
    }
    
}
