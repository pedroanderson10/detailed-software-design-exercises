import java.text.SimpleDateFormat;
import java.util.Date;
 
public class ContaPoupança extends Conta implements OperaçõesBásicas, OperaçõesEspeciais{

	@Override
	public void depositar(double valor) {
		this.saldo += valor;
	}

	@Override
	public void sacar(double valor) {
		this.saldo -= valor;
	}
	
	@Override
	public double getSaldo() {
		return this.saldo ;
	}
	
	@Override
    public String getNome() {
    	return this.nome;
    }
	
	@Override
	public void gerarExtrato(Conta conta) {
		GeradorExtratos ex = new GeradorExtratos();
		ex.imprimeExtrato(conta);
	}
	
    @Override
    public void alterarNome(String nome) {
    	this.nome = nome;
    }
	
}