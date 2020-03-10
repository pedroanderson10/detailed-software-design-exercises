
package br.com.ufc.pds.serpentesEscadas.casa;

import java.util.ArrayList;

public class CasaController implements iCasaController{
    
    private ArrayList<iCasa> listCasa = null;
    
    public CasaController(){
        listCasa = new ArrayList<>();
    }
    
    ///////////////////////////////////////
    //Metodos de set CasaEspecial na list//
    ///////////////////////////////////////
    
    @Override
    public void setCasaEscada(int indice, int destino){
        listCasa.set(indice, new CasaEspGoToEscada(indice, destino));
    }
    
    @Override
    public void setCasaRandom(int indice){
        listCasa.set(indice, new CasaEspRandom(indice));
    }
    
    @Override
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
    
    @Override
    public iCasa getCasa(int indice){
        return listCasa.get(indice);
    }
    
    public ArrayList<iCasa> getListICasa(){
        return listCasa;
    }
    
    public void setListICasa(ArrayList<iCasa> listCasa){
        this.listCasa = listCasa;
    }
    
    
    ///////////////////////////////
    //Metodos de set Casa na list//
    ///////////////////////////////
    
    @Override
    public void addCasa(iCasa casa){
        listCasa.add(casa);
    }
    
    @Override
    public void setListCasaNormal(){
        while(canAddCasa())
            listCasa.add(new CasaNormal(listCasa.size()));
    }
    
    private boolean canAddCasa(){
        return (listCasa.size() < 100);
    }

}
