package br.com.ufc.pds.serpentesEscadas.viewe;

import java.io.FileNotFoundException;
import java.io.IOException;


public class Game{

	private static Game instance = null;
	private iConfigJogo config;

	private Game(int winWidth, int winHeight) {
		config = new ConfigJogo();
		ConfigureGame();
	}

	public static Game getInstance() {
		if(instance == null)
			instance = new Game(1234, 698);
		
		return instance;
	}
	
	private void ConfigureGame() { // Configura o config
		config.setSizeWindow(1234, 698);
		config.configureBasic(config);
		config.defineBackground();
		config.definirCasas();
		config.definirJogadores();
		config.defineDado();
		config.configurePanel();
		loop();
	}
	
	public void loop() {
		config.Draw();
		while(true)
			if(config.dadoClicked()) {
				int casaDest = config.getDadoValue();
				
				casaDest += config.getCasaAtual();
				config.setCasaDestino(casaDest);
				
				if(config.confereVencedor())
					System.exit(0);
				
				config.getNomeJogadorAtual();
				config.getCasaDestino();
				config.casaRand();
				config.Draw();
				config.nextJogador();
			}
	}
	
	public void Run() throws FileNotFoundException, IOException { // Quando chamado inicia o jogo
		loop();
	}
}
