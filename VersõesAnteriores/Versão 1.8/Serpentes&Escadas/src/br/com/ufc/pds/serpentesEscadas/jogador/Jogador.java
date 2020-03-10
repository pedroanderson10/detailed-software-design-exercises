
package br.com.ufc.pds.serpentesEscadas.jogador;

import JPlay.Sprite;

public class Jogador implements iJogador{ 
    
    private String nome = "";
    private Sprite image = null;
    private int x = 0;
    private int y = 0;
    private int numCasa = 0;
    
    
    public Jogador(){
    }
    
    public Jogador(String img, int x, int y) {
        image = new Sprite(img, 1);

        image.setPosition(x, y);
    }
    
    public Jogador(String nome, String img, int x, int y) {
        image = new Sprite(img, 1);
        image.setPosition(x, y);
        this.nome = nome;
    }
    
    public Jogador(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	public Jogador(String nome){
        this.nome = nome;
        this.numCasa = 0;
    }    
    //////////////////////
    // Metodos Get e Set//
    //////////////////////
    
	
    public Sprite getImage() {
		return image;
	}

	public void setImage(Sprite image) {
		this.image = image;
	}

	
	
	public void setPosicao(int x, int y) {
	    	image.setPosition(x, y);
    }
	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	
	
	@Override
    public int getNumCasa(){
        return numCasa;
    }
    
	@Override
    public void setNumCasa(int numCasa){
        this.numCasa = numCasa;
    }
    
	
    @Override
    public String getNome(){
        return nome;
    }
    
    @Override
    public void setNome(String nome){
        this.nome = nome;
    }
    
    
    public void draw() {
        image.draw();
    }

    
}   

