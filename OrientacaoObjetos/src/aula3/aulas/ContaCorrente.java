package aula3.aulas;

public class ContaCorrente extends Conta {
	
	public ContaCorrente(Cliente cliente, long numeroConta, double saldo) {
		super(cliente, numeroConta, saldo);
		// TODO Auto-generated constructor stub
	}

	private double saldoInvestimento;

	@Override
	public void consultar() {
		double saldoTotal = this.saldo + this.saldoInvestimento;
		System.out.println("Cliente "+this.cliente.getNomeTitular());
		System.out.println("Data de abertura "+this.dataAbertura);
		System.out.println("Saldo Conta Corrente: R$ "+this.saldo);
		System.out.println("Saldo Investimento: R$ "+this.saldoInvestimento);
		System.out.println("Saldo Total : R$ "+saldoTotal + "\n");
	}
	
	//design pattern STRATEGY
	public void investimento(Produto produto, double valor) {
		boolean teste = this.sacar(valor);
		if(teste=true) {
		this.saldoInvestimento += produto.investir(valor);
	}
	
	
	}
}
