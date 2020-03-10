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
public interface iFabricaCasa {
    public iCasa criaCasa(TipoCasa tipoCasa, Posicao p, int indice, int destino);
    public iCasa criaCasa(TipoCasa tipoCasa, Posicao p, int indice);
    public iCasa criaCasa(TipoCasa tipoCasa, int indice, int destino);
    public iCasa criaCasa(TipoCasa tipoCasa, int indice);
      
    public ArrayList<iCasa> criaTodasNormal();
}
