public class TestaConta {

	public static void main(String[] args) {
		ContaPoupan�a cp = new ContaPoupan�a();
        cp.setSaldo(1000);
        cp.setNome("Lana");
        cp.depositar(500);
        cp.sacar(200);
        cp.gerarExtrato(cp);
        
	}
}
