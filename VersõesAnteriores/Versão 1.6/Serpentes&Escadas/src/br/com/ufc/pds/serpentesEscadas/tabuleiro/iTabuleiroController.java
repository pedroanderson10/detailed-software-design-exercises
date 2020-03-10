
package br.com.ufc.pds.serpentesEscadas.tabuleiro;

import br.com.ufc.pds.serpentesEscadas.casa.FabricaCasa;
import br.com.ufc.pds.serpentesEscadas.casa.iCasaController;
import br.com.ufc.pds.serpentesEscadas.casa.iFabricaCasa;
import br.com.ufc.pds.serpentesEscadas.jogador.iJogadorController;

public interface iTabuleiroController extends iRodada, iCasaController, 
        iJogadorController {
    iFabricaCasa fabricaCasa = new FabricaCasa();
}
