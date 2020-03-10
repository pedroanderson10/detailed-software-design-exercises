
package br.com.ufc.pds.serpentesEscadas.casa;

public class FabricaCasa implements iFabricaCasa{

    @Override
    public iCasa criaCasa(String nome, int x, int y, int indice, int destino,
            iObservadorCasa obs) {
        switch(nome){
            case "normal":
                return new CasaNormal(x,y, indice);
            case "random":
                return new CasaEspRandom(x,y, indice, obs);
            case "cobra":
                return new CasaEspGoToCobra(x,y, indice, destino);
            case "escada":
                return new CasaEspGoToEscada(x,y, indice, destino);
            default:
                return null;
        }
    }
    
    
    @Override
    public iCasa criaCasa(String nome, int x, int y, int indice) {
        return criaCasa(nome, x, y, indice, 0, null);
    }
    
    @Override
    public iCasa criaCasa(String nome, int x, int y, int indice, iObservadorCasa obs) {
        return criaCasa(nome, x,y, indice,0 ,obs);
    }
    
    @Override
    public iCasa criaCasa(String nome, int x, int y, int indice, int destino) {
        return criaCasa(nome, x,y, indice, destino, null);
    }
    
}
