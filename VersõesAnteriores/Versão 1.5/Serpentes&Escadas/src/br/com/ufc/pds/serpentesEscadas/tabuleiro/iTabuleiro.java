
package br.com.ufc.pds.serpentesEscadas.tabuleiro;

import br.com.ufc.pds.serpentesEscadas.casa.iCasaController;
import br.com.ufc.pds.serpentesEscadas.jogador.iJogadorController;

public interface iTabuleiro {
     public iCasaController getCasaController();
     public void setCasaController(iCasaController c);
     public iJogadorController getJogadorController();
     public void setJogadorController(iJogadorController j);
     public Dado getDado();

}
