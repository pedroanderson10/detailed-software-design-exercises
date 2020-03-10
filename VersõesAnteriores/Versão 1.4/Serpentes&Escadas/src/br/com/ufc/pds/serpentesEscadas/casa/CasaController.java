
package br.com.ufc.pds.serpentesEscadas.casa;

import br.com.ufc.pds.serpentesEscadas.casa.Casa;
import br.com.ufc.pds.serpentesEscadas.casa.CasaEspGoToCobra;
import br.com.ufc.pds.serpentesEscadas.casa.CasaEspGoToEscada;
import br.com.ufc.pds.serpentesEscadas.casa.CasaNormal;
import br.com.ufc.pds.serpentesEscadas.casa.CasaEspRandom;
import java.util.ArrayList;

public class CasaController {
    /*
    private Casa casa = null;
    private CasaNormal casaNormal = null;
    private CasaEspRandom casaRandom = null;
    private CasaEspGoToCobra casaGoToCobra = null;
    private CasaEspGoToEscada casaGoToEscada = null;*/
    private ArrayList<Casa> listCasa = null;
    
    public CasaController(){
      /*  casaNormal = new CasaNormal();
        casaRandom = new CasaEspRandom();
        casaGoToCobra = new CasaEspGoToCobra();
        casaGoToEscada = new CasaEspGoToEscada();*/
        listCasa = new ArrayList<>();
    }
    
    ///////////////////////////////////////
    //Metodos de set CasaEspecial na list//
    ///////////////////////////////////////
    
    public void setCasaEscada(int indice, int destino){
        listCasa.set(indice, new CasaEspGoToEscada(indice, destino));
    }
    
    public void setCasaRandom(int indice){
        listCasa.set(indice, new CasaEspRandom(indice));
    }
    
    public void setCasaCobra(int indice, int destino){
        listCasa.set(indice, new CasaEspGoToCobra(indice, destino));
    }
    
    public void setCasaIndice(Casa casa, int indice){
        listCasa.set(indice, casa);
    }
    
    //////////////////////
    // Metodos Get e Set//
    //////////////////////
    
    public int getNumCasa(int indice){
        return listCasa.get(indice).getNumCasa();
    }
    
    public int getDestino(int indice){
        return listCasa.get(indice).getDestino();
    }
    
    public Casa getCasa(int indice){
        return listCasa.get(indice);
    }
    
    public ArrayList<Casa> getListCasa(){
        return listCasa;
    }
    
    public void setListCasa(ArrayList<Casa> listCasa){
        this.listCasa = listCasa;
    }
    
    
    ///////////////////////////////
    //Metodos de set Casa na list//
    ///////////////////////////////
    
    public void addCasa(Casa casa){
        listCasa.add(casa);
    }
    
    public void setListCasaNormal(){
        while(canAddCasa())
            listCasa.add(new CasaNormal(listCasa.size()));
    }
    
    private boolean canAddCasa(){
        return (listCasa.size() < 100);
    }
    
}
