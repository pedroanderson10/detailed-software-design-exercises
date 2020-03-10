/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ufc.pds.serpentesEscadas.jogador;

import br.com.ufc.pds.serpentesEscadas.casa.iCasa;

/**
 *
 * @author paulo
 */
public interface iJogadorController {
    public void addJogador(iJogador iJogador);
    public iJogador getJogador(int indice);
    public void setCasaJogadorAtual(iCasa casa);
    public iJogador getJogadorAtual();
    public void nextJogador();
}
