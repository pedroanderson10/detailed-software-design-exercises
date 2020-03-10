package Forca;

public class Jogo {
	private String[] array;
	private int num_erros;
	
	public Jogo() {
		super();
		this.num_erros = 7;
	}
	
	public String[] getArray() {
		return array;
	}
	public void setArray(String[] array) {
		this.array = array;
	}
	
	public int getNum_erros() {
		return num_erros;
	}
	public void setNum_erros(int num_erros) {
		this.num_erros = num_erros;
	}

//------------------------------------- M�todos--------------------------------------------------------------
	
	public void preencher_array(int tamanho) {
		String[] array = new String[tamanho];
		for(int i=0 ; i<array.length ; i++) array[i] = "_";
		setArray(array);
	}
	
	public void printar_array() {
		for(int i=0 ; i<getArray().length ; i++) System.out.print(" " + getArray()[i]);
	}
	
	public void compara(String letra, String palavra) {
		for(int i = 0; i < palavra.length(); i++) {
			int ocorre = palavra.indexOf(letra, i);
			/*o metodo indexOf retorna o indice da primeira ocorrencia de ‘ocorrencia’ dentro de palavra, procurando dentro 
			 * de palavra a partir do indice i, e retorna -1 caso nao encontre ocorrencias.
			*/
			if(ocorre < 0) {
				setNum_erros(num_erros - 1); //Vc errou
				return;
			}
			this.array[ocorre] = letra; //Vc acertou
		}
		
	}
	
	public boolean conferir() {
		for(int i=0 ; i<array.length ; i++) 
			if(array[i] == "_") return true;
		return false;
	}
	
	public boolean deu_forca() {
		if(getNum_erros() == 0) {
			System.out.println("ENFORCADO!!");
			return true;
		}
		else return false;
	}
	
}
