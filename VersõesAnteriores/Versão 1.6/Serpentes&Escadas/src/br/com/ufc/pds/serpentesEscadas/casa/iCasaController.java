
package br.com.ufc.pds.serpentesEscadas.casa;

import java.util.ArrayList;

public interface iCasaController extends iSetGetCasa{
    public void setListCasa(ArrayList<iCasa> listCasa);
    public void setCasa(TipoCasa tipoCasa,int indice);
    public void setCasa(TipoCasa tipoCasa,int indice, int destino);
}

