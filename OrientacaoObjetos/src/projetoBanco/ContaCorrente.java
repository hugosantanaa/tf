package projetoBanco;

public class ContaCorrente extends Conta {
	
	public ContaCorrente(Cliente cliente, long numeroConta, long agencia, double saldo) {
		super(cliente, numeroConta, agencia, saldo);
		// TODO Auto-generated constructor stub
	}

	private double saldoInvestimento;

	@Override
	public void consultar() {
		double saldoTotal = this.saldo + this.saldoInvestimento;
		System.out.println("Cliente: "+this.cliente.getNomeTitular());
		System.out.println("Numero Conta: "+this.numeroConta);
		System.out.println("Agência: "+this.agencia);
		System.out.println("Data de abertura "+this.dataAbertura);
		System.out.println("Saldo Conta Corrente: R$ "+this.saldo);
		System.out.println("Saldo Investimento: R$ "+this.saldoInvestimento);
		System.out.println("Saldo Total : R$ "+saldoTotal + "\n");
	}
	
	//design pattern STRATEGY
	public void investimento(Produto produto, double valor) throws SaldoInsuficiente {
		boolean teste = this.sacar(valor);
		if(teste=true) {
		this.saldoInvestimento += produto.investir(valor);
	}else {
		throw new SaldoInsuficiente("Saldo insuficiente para investimento");
	}
	}
	
	
	
}
