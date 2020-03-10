/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ufc.pds.serpentesEscadas.casa;

import br.com.ufc.pds.serpentesEscadas.viewe.Posicao;
import java.util.ArrayList;

/**
 *
 * @author paulo
 */
public class FabricaCasa implements iFabricaCasa{

    @Override
    public iCasa criaCasa(TipoCasa tipoCasa, Posicao p, int indice, int destino) {
        switch(tipoCasa){
            case NORMAL:
                return new CasaNormal(p, indice);
            case RANDOM:
                return new CasaEspRandom(p, indice);
            case COBRA:
                return new CasaEspGoToCobra(p, indice, destino);
            case ESCADA:
                return new CasaEspGoToEscada(p, indice, destino);
            default:
                return null;
        }
    }
    
    @Override
    public iCasa criaCasa(TipoCasa tipoCasa, Posicao p, int indice) {
        return criaCasa(tipoCasa, p, indice, 0);
    }
    
    @Override
    public iCasa criaCasa(TipoCasa tipoCasa, int indice) {
        return criaCasa(tipoCasa, null, indice);
    }
    
    @Override
    public iCasa criaCasa(TipoCasa tipoCasa, int indice, int destino) {
        return criaCasa(tipoCasa, null, indice, destino);
    }
    
    @Override
    public ArrayList<iCasa> criaTodasNormal() {
        ArrayList<iCasa> listCasa = new ArrayList<>();
        for(int i = 0; i<100 ; i++)
            listCasa.add(criaCasa(TipoCasa.NORMAL, i));
        
        return listCasa;
    }
    
}
