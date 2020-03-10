
package br.com.ufc.pds.serpentesEscadas.casa;

import java.util.ArrayList;

public class CasaController implements iCasaController{
    
    private ArrayList<iCasa> listCasa = null;
    private iFabricaCasa fabricaCasa = null;
    
    public CasaController(){
        fabricaCasa = new FabricaCasa();
        listCasa = fabricaCasa.criaTodasNormal();
    }
    
    ///////////////////////////////////////
    //Metodos de set CasaEspecial na list//
    ///////////////////////////////////////

    @Override
    public void setCasa(TipoCasa tipoCasa,int indice, int destino){
        listCasa.set(indice, fabricaCasa.criaCasa(tipoCasa, indice, destino));
    }
    
    @Override
    public void setCasa(TipoCasa tipoCasa,int indice){
        listCasa.set(indice, fabricaCasa.criaCasa(tipoCasa, indice));
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
    
    public ArrayList<iCasa> getListCasa(){
        return listCasa;
    }
    
    @Override
    public void setListCasa(ArrayList<iCasa> listCasa){
        this.listCasa = listCasa;
    }
    
    
    ///////////////////////////////
    //Metodos de set Casa na list//
    ///////////////////////////////
    
    @Override
    public void addCasa(iCasa casa){
        listCasa.add(casa);
    }

}
