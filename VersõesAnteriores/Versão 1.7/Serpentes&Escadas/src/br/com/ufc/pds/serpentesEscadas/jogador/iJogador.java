/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ufc.pds.serpentesEscadas.jogador;

import br.com.ufc.pds.serpentesEscadas.viewe.Posicao;


/**
 *
 * @author paulo
 */
public interface iJogador {
    
    public void setNumCasa(int numCasa);
    public int getNumCasa();
    
    public String getNome();
    public void setNome(String nome);
    
    public Posicao getPosicao();
    public void setPosicao(Posicao posicao);
    
}
