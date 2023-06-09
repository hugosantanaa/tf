	package projetoBanco;

import java.util.Date;

public abstract class Conta { //impede criar uma instancia

	// ATRIBUTOS
	protected Cliente cliente; 	//composição
	protected final long numeroConta;
	protected long agencia;
	private String senhaConta;
	protected Date dataAbertura;
	protected double saldo;
	private static long contador;
	

	//CONSTRUTOR
	public Conta(Cliente cliente, long numeroConta, long agencia, double saldo) {
	
		this.cliente = cliente;
		this.numeroConta = numeroConta;
		this.agencia = agencia;
		this.senhaConta = senhaConta;
		this.dataAbertura = new Date(System.currentTimeMillis()); //pega a data do sistema operacional
		this.saldo = saldo;
		System.out.println("Data de abertura " +this.dataAbertura);
		System.out.println("conta criada.");
		contador++;
	}

	// sacar
	public boolean sacar (double valor) throws SaldoInsuficiente {
		if(valor >0) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
			}else {
		throw new SaldoInsuficiente("Saldo insuficiente para saque");
		}
		}
		return false;
		
	}

	// depositar
	public void depositar(double valor) {
		this.saldo += valor;
	}
	
	// consultarSaldo
	public abstract void consultar();
		

	// transferir
	public void transferir(Conta conta, double valor) throws SaldoInsuficiente {
		boolean teste = this.sacar(valor);
		if(teste==true) {
			conta.depositar(valor);			
		}else {
			throw new SaldoInsuficiente("Saldo insuficiente para realizar transferencia");
		}
				
	}
	public static void exibirContador() {
		System.out.println("Contas "+contador);
	}
	
	
	
	
}
