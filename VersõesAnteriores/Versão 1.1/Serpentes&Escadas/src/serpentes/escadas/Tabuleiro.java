
package serpentes.escadas;

import java.util.ArrayList;

public class Tabuleiro {
    
    private ArrayList<Casa> listCasa = null;
    private ArrayList<Jogador> listJogador = null;
    
    private Integer indiceJogadorAtual = null;
    private Dado dado = null;
    
    public Tabuleiro(){
        listCasa = new ArrayList<Casa>();
        listJogador = new ArrayList<Jogador>();
        dado = new Dado();
        indiceJogadorAtual = 0;
    }
    
    public Tabuleiro(ArrayList<Casa> lc, ArrayList<Jogador> lj, Dado d,
            int indiceJogador){
        this.listCasa = lc;
        this.listJogador = lj;
        this.indiceJogadorAtual = indiceJogador;
        this.dado = d;
    }
    
    public void fazJogada(){
        int numDado = dado.getValorDado();
        
        Jogador j = listJogador.get(indiceJogadorAtual);
        int numCasa = j.getIndiceCasaAtual();
        
        Casa c = listCasa.get(numCasa+numDado);
       
        int numDes = c.getDestino();
        
        if(numDes != c.getNumCasa())
           c = listCasa.get(numDes);
        
        j.setCasaAtual(c); 
        nextJogador();
            
    }
    
    public void nextJogador(){
        if(indiceJogadorAtual== 3)
            indiceJogadorAtual = 0;
        else
            indiceJogadorAtual++;
    }
    
    ///////////////////////////////////////////////////
    // metodos aterativos: arraylist: Casa e Jogaodr //
    ///////////////////////////////////////////////////
    
    public void addJogador(Jogador jogador){
        listJogador.add(jogador);
    }
    
    public Jogador getJogador(int indice){
        return listJogador.get(indice);
    }
    
    public void addCasa(Casa casa){
        listCasa.add(casa);
    }
    
    public Casa getCasa(int indice){
        return listCasa.get(indice);
    }
    
    //////////////////////////////
    // metodos padrao get e set //
    //////////////////////////////
    
    public void setIndiceJogadorAtual(int indiceJogador){
        indiceJogadorAtual = indiceJogador;
    }
    
    public int getIndiceJogadorAtual(){
        return indiceJogadorAtual;
    }
    
    public void setListCasa(ArrayList<Casa> listCasa){
        this.listCasa = listCasa;
    }
    
    public ArrayList<Casa> getListCasa(){
        return listCasa;
    }
    
    public void setListJogador(ArrayList<Jogador> listJogador){
        this.listJogador = listJogador;
    }
    
    public ArrayList<Jogador> getListJogador(){
        return listJogador;
    }
    
}
