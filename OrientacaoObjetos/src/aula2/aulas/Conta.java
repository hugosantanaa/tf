package aula2.aulas;

import java.util.Date;

public class Conta {

	// ATRIBUTOS
	private int numeroConta, agencia;
	private String senhaConta;
	private Date dataAbertura;
	private double saldo;
	private Cliente cliente; //composição

	//CONSTRUTOR
	public Conta(Cliente cliente, int numeroConta, int agencia,
			 String senhaConta, double saldo) {
	
		this.cliente = cliente;
		this.numeroConta = numeroConta;
		this.agencia = agencia;
		this.senhaConta = senhaConta;
		this.dataAbertura = new Date(System.currentTimeMillis()); //pega a data do sistema operacional
		this.saldo = saldo;
		System.out.println("conta criada.");
		System.out.println("Data de abertura " +this.dataAbertura);
	}

	// sacar
	public boolean sacar(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		}
		return false;
	}

	// depositar
	public void depositar(double valor) {
		this.saldo += valor;
	}
	
	// consultarSaldo
	public void consultar() {
		System.out.println(this.cliente.getNomeTitular() + " - SALDO: "+ this.saldo);
	}

	// transferir
	public void transferir(Conta conta, double valor) {
		boolean teste = this.sacar(valor);
		if(teste==true) {
			conta.depositar(valor);			
		}
		
		
	}
}
