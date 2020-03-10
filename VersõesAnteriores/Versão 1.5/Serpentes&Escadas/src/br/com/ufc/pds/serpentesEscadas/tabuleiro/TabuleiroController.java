
package br.com.ufc.pds.serpentesEscadas.tabuleiro;

import br.com.ufc.pds.serpentesEscadas.casa.iCasa;
import br.com.ufc.pds.serpentesEscadas.jogador.iJogador;

public class TabuleiroController implements iTabuleiroController {
 
    private iTabuleiro tabuleiro = null;
    
    public TabuleiroController(){
        tabuleiro = new Tabuleiro();
        tabuleiro.getCasaController().setListCasaNormal();
    }
    
    // set iCasas Especiais
    
    @Override
    public void setCasaCobra(int indice, int destino){
        tabuleiro.getCasaController().setCasaCobra(indice, destino);
    }
    @Override
    public void setCasaEscada(int indice, int destino){
        tabuleiro.getCasaController().setCasaEscada( indice, destino);
    }
    @Override
    public void setCasaRandom(int indice){
        tabuleiro.getCasaController().setCasaRandom(indice);
    }
        
    // add set get iCasa
    
    @Override
    public void addCasa(iCasa casa){
        tabuleiro.getCasaController().addCasa(casa);
    }
    
    @Override
    public iCasa getCasa(int indice){
        return tabuleiro.getCasaController().getCasa(indice);
    }
    
    // add set get Jogador
    
    @Override
    public void addJogador(iJogador jogador){
        tabuleiro.getJogadorController().addJogador(jogador);
    }
    
    @Override
    public iJogador getJogador(int indice){
        return tabuleiro.getJogadorController().getJogador(indice);
    }
    
    @Override
    public void setCasaJogadorAtual(iCasa casa){
        tabuleiro.getJogadorController().setCasaJogadorAtual(casa);
    }
    
    /*  public void setJogadorAtual(Jogador jogador){
        tabuleiro.getJogadorController().setJogadorAtual(jogador);
    }*/
    
    @Override
    public iJogador getJogadorAtual(){
        return tabuleiro.getJogadorController().getJogadorAtual();
    }
    
    
    // Métodos da jogabilidade
    
    
    @Override
    public int jogarDado(){
        return tabuleiro.getDado().getValorDado();
    }
    
    @Override
    public boolean setCasaDestino(int numeroiCasaDestino){
        if(numeroiCasaDestino > 98){
            System.out.println("O jogador(a) "+getJogadorAtual().getNome()+" ganhou");
            return false;
        }
        
        //salva a casa de destino
        iCasa casa = getCasa(numeroiCasaDestino);
        numeroiCasaDestino = casa.getDestino();
        //salva o numero da casa do possivel novo destino
        
        /* Atencao!!!
            No caso de casa ser NORMAL, ao chamar getDestino, ela retorna seu 
                proprio numero.
            No caso de casa ser ESPECIAL, ao chamar getDestino, ela retorna o 
                numero da proximo casa de destino.
        */
        System.out.println("iCasa destino: "+(casa.getNumCasa()+1));
         
        while(numeroiCasaDestino != casa.getNumCasa() ){
            casa = getCasa(numeroiCasaDestino);
            numeroiCasaDestino = casa.getDestino();
            System.out.println("Novo destino: "+(1+numeroiCasaDestino));
        }
        System.out.println("iCasa destino final: "+(1+ numeroiCasaDestino));
        setCasaJogadorAtual(casa);
        
        return true;
    }
    
    @Override
    public boolean rodada(){
        int numeroiCasaDestino = jogarDado();
        System.out.println("Valor do dado: "+ numeroiCasaDestino);
        
        System.out.println(getJogadorAtual().getNome());
        System.out.println("iCasa atual: "+(getJogadorAtual().getIndiceCasaAtual()+1));        
        
        numeroiCasaDestino += getJogadorAtual().getIndiceCasaAtual();
        
        return setCasaDestino(numeroiCasaDestino);
    }
    
    @Override
    public boolean nextRodada(){
        if(!rodada())
            return false;
        
        nextJogador();
        return true;
    }

    @Override
    public void setListCasaNormal() {
        tabuleiro.getCasaController().setListCasaNormal();
    }

    @Override
    public void nextJogador() {
        tabuleiro.getJogadorController().nextJogador();
    }
    
}
