import java.text.SimpleDateFormat;
import java.util.Date;
 
public class ContaCorrente extends Conta implements OperaçõesBásicas, OperaçõesEspeciais{
	double taxaServico = 4;
	
	@Override
	public void depositar(double valor) {
		this.saldo += valor;
	}

	@Override
	public void sacar(double valor) {
		this.saldo -= valor + taxaServico;
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