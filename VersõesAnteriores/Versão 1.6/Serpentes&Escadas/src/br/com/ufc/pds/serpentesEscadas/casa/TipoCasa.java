/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ufc.pds.serpentesEscadas.casa;

/**
 *
 * @author paulo
 */
public enum TipoCasa {
        NORMAL("normal"), COBRA("cobra"), ESCADA("escada"), RANDOM("random");
    
    private final String tipo;

    private TipoCasa(String tipo) {
        this.tipo = tipo;
    }
    
    public String getTipo(){
        return tipo;
    }
}
