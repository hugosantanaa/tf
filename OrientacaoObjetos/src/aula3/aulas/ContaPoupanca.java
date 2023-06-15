package aula3.aulas;

public class ContaPoupanca extends Conta{

	public ContaPoupanca(Cliente cliente, long numeroConta, long agencia, double saldo) {
		super(cliente, numeroConta, agencia, saldo);
		
	}

	@Override
	public void consultar() {
		System.out.println("Cliente: "+this.cliente.getNomeTitular());
		System.out.println("Numero Conta: "+this.numeroConta);
		System.out.println("Agência: "+this.agencia);
		System.out.println("Data de abertura "+this.dataAbertura);
		System.out.println("Saldo Conta Poupança: R$ "+this.saldo);
		
	}

}
