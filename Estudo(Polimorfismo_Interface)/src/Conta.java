abstract class Conta {
     
    protected double saldo;
    protected String nome;
    
	public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }

	abstract public double getSaldo();
	abstract public String getNome();

}