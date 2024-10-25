
public class Main {

	public static void main(String[] args) {
		Cliente yuri = new Cliente();
		yuri.setNome("Yuri");
		
		Conta cc = new ContaCorrente(yuri);
		Conta poupanca = new ContaPoupanca(yuri);

		cc.depositar(100);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}
