/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ufc.pds.serpentesEscadas.jogador;

/**
 *
 * @author paulo
 */
public interface iJogadorController {
    public void addJogador(String nome);
    
    public String getNomeJogadorAtual();
    
    public void setNumCasaJogadorAtual(int numCasa);
    public int getNumCasaJogadorAtual();
    
    public void nextJogador();
}
