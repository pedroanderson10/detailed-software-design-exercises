
package serpentes.escadas;

import java.util.ArrayList;

public class Tabuleiro {
    
    private ArrayList<Casa> listCasa = null;
    private ArrayList<Jogador> listJogador = null;
    
    private Integer indiceJogadorAtual = null;
    private Dado dado = null;
    
    public Tabuleiro(){
        this.listCasa = new ArrayList<>();
        this.listJogador = new ArrayList<>();
        this.indiceJogadorAtual = 0;
        this.dado = new Dado();
    }
    
    public Tabuleiro(ArrayList<Casa> listCasa, ArrayList<Jogador> listJogador){
        this.listCasa = listCasa;
        this.listJogador = listJogador;
        this.indiceJogadorAtual = 0;
        this.dado = new Dado();
    }
    
    public boolean fazJogada(){
        int numDado = dado.getValorDado();
            System.out.println("Valor do dado: "+ numDado);
        Jogador jogador = listJogador.get(indiceJogadorAtual);
        int numCasa = jogador.getIndiceCasaAtual();
            System.out.println(jogador.getNome());
            System.out.println("Casa atual: "+(jogador.getCasaAtual().getNumCasa()+1));
        
        int numDes = numCasa+numDado;
            
        if(numDes > 98){
            System.out.println("O jogador(a) "+jogador.getNome()+" ganhou");
            return false;
        }
        // Primeiro destino     
        Casa casa = listCasa.get(20/*numCasa+numDado*/);
        System.out.println("Casa destino: "+(casa.getNumCasa()+1));
            
        // Confure se existe um segundo destino
        numDes = casa.getDestino();
        System.out.println("Teste numDes> "+(numDes+1));
        while(numDes != casa.getNumCasa()){
           casa = listCasa.get(numDes);
           numDes = casa.getDestino();
            System.out.println("Novo destino: "+(1+casa.getDestino()));
        }
            System.out.println("Casa destino final: "+(1+ casa.getNumCasa()));
        jogador.setCasaAtual(casa); 
            System.out.println("Casa destino final jogador: "+(1+ jogador.getCasaAtual().getNumCasa()));
        nextJogador();
        return true;
    }
    
    public void setListCasaNormal(){
        for(int i=0; i<100 ;i++)
            addCasa(new CasaNormal(i));
    }   
    
    public void nextJogador(){
        if(indiceJogadorAtual == listJogador.size()-1)
            indiceJogadorAtual = 0;
        else
            indiceJogadorAtual++;
    }
    
    ///////////////////////////////////////////////////
    // metodos aterativos: arraylist: Casa e Jogaodr //
    ///////////////////////////////////////////////////
    
    public boolean addJogador(Jogador jogador){
        if(listJogador.size() == 4)
            return false;
        listJogador.add(jogador);
        return true;
    }
    
    public Jogador getJogador(int indice){
        return listJogador.get(indice);
    }
    
    public Jogador getJogadorAtual(){
        return listJogador.get(indiceJogadorAtual);
    }
    
    public void setCasaIndice(Casa casa,int indice){
        listCasa.set(indice, casa);
    }

    public void setCasaCobra(int indice, int destino){
        listCasa.set(indice, new CasaCobra(indice, destino));
    }
    
    public void setCasaEscada(int indice, int destino){
        listCasa.set(indice, new CasaEscada(indice, destino));
    }
    
    public void setCasaRandom(int indice){
        listCasa.set(indice, new CasaRandom(indice));
    }
    
    public boolean addCasa(Casa casa){
        if(listCasa.size() == 100) 
           return false;
        listCasa.add(casa);
        return true;
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
