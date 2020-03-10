
package br.com.ufc.pds.serpentesEscadas.tabuleiro;

import br.com.ufc.pds.serpentesEscadas.casa.Casa;
import br.com.ufc.pds.serpentesEscadas.jogador.Jogador;

public class TabuleiroController {
 
    private Tabuleiro tabuleiro = null;
    
    public TabuleiroController(){
        tabuleiro = new Tabuleiro();
        tabuleiro.getCasaController().setListCasaNormal();
    }
    
    // set Casas Especiais
    
    public void setCasaCobra(int indice, int destino){
        tabuleiro.getCasaController().setCasaCobra(indice, destino);
    }
    public void setCasaEscada(int indice, int destino){
        tabuleiro.getCasaController().setCasaEscada( indice, destino);
    }
    public void setCasaRandom(int indice){
        tabuleiro.getCasaController().setCasaRandom(indice);
    }
        
    // add set get Casa
    
    public void addCasa(Casa casa){
        tabuleiro.getCasaController().addCasa(casa);
    }
    
    public Casa getCasa(int indice){
        return tabuleiro.getCasaController().getCasa(indice);
    }
    
    // add set get Jogador
    
    public void addJogador(Jogador jogador){
        tabuleiro.getJogadorController().addJogador(jogador);
    }
    
    public Jogador getJogador(int indice){
        return tabuleiro.getJogadorController().getJogador(indice);
    }
    
    public void setCasaJogadorAtual(Casa casa){
        tabuleiro.getJogadorController().setCasaJogadorAtual(casa);
    }
    
    /*  public void setJogadorAtual(Jogador jogador){
        tabuleiro.getJogadorController().setJogadorAtual(jogador);
    }*/
    
    public Jogador getJogadorAtual(){
        return tabuleiro.getJogadorController().getJogadorAtual();
    }
    
    
    // Métodos da jogabilidade
    
    
    private int jogarDado(){
        return tabuleiro.getDado().getValorDado();
    }
    
    private boolean setCasaDestino(int numeroCasaDestino){
        if(numeroCasaDestino > 98){
            System.out.println("O jogador(a) "+getJogadorAtual().getNome()+" ganhou");
            return false;
        }
        
        //salva a casa de destino
        Casa casa = getCasa(numeroCasaDestino);
        numeroCasaDestino = casa.getDestino();
        //salva o numero da casa do possivel novo destino
        
        /* Atencao!!!
            No caso de casa ser NORMAL, ao chamar getDestino, ela retorna seu 
                proprio numero.
            No caso de casa ser ESPECIAL, ao chamar getDestino, ela retorna o 
                numero da proximo casa de destino.
        */
        System.out.println("Casa destino: "+(casa.getNumCasa()+1));
         
        while(numeroCasaDestino != casa.getNumCasa() ){
            casa = getCasa(numeroCasaDestino);
            numeroCasaDestino = casa.getDestino();
            System.out.println("Novo destino: "+(1+numeroCasaDestino));
        }
        System.out.println("Casa destino final: "+(1+ numeroCasaDestino));
        setCasaJogadorAtual(casa);
        
        return true;
    }
    
    public boolean rodada(){
        int numeroCasaDestino = jogarDado();
        System.out.println("Valor do dado: "+ numeroCasaDestino);
        
        System.out.println(getJogadorAtual().getNome());
        System.out.println("Casa atual: "+(getJogadorAtual().getIndiceCasaAtual()+1));        
        
        numeroCasaDestino += getJogadorAtual().getIndiceCasaAtual();
        
        return setCasaDestino(numeroCasaDestino);
    }
    
    public boolean nextRodada(){
        if(!rodada())
            return false;
        
        tabuleiro.getJogadorController().nextJogador();
        return true;
    }
    
}
