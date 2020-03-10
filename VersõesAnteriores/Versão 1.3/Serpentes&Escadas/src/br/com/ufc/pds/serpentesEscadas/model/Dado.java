
package br.com.ufc.pds.serpentesEscadas.model;

import java.util.Random;

public class Dado {
    
    // gera o numero aleatorio do dado
    public int getValorDado(){
        return new Random().nextInt(6)+1;
    }//randon gera 0~range; somo +1 ao range(0~5) para se tornar (1~6) 
}
