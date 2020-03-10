public class TestaConta {

	public static void main(String[] args) {
		ContaPoupança cp = new ContaPoupança();
        cp.setSaldo(1000);
        cp.setNome("Lana");
        cp.depositar(500);
        cp.sacar(200);
        cp.gerarExtrato(cp);
        
	}
}
