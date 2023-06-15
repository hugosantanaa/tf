package aula3.aulas;

import java.text.ParseException;

public class TestaConta {

	public static void main(String[] args) throws ParseException {

		// tipos de investimento
		CDB cdb = new CDB();
		LCI lci = new LCI();
		LCA lca = new LCA();

		// criando cliente
		Cliente hugo = new Cliente("Hugo", "Corrente", "1234567890", "87654321", "Rua X, 123", "02/11/1998");
		Cliente mariana = new Cliente("Mariana", "Corrente", "1234567890", "98765432", "Rua X, 123", "13/08/2000");

		// criando conta corrente
		ContaCorrente contaHugo = new ContaCorrente(hugo, 1234, 123456, 0);
		ContaCorrente contaMariana = new ContaCorrente(mariana, 1235, 123457, 0);

		// SIMULAÇÕES
		contaHugo.depositar(10000);
		contaMariana.depositar(20000);

		contaHugo.consultar();
		contaMariana.consultar();

		contaHugo.sacar(5000);
		contaMariana.sacar(10000);

		contaHugo.consultar();
		contaMariana.consultar();

		contaHugo.investimento(lca, 1000);
		contaMariana.investimento(lca, 2000);

		contaHugo.consultar();
		contaMariana.consultar();

		Conta.exibirContador();
		
		System.out.println(hugo.getNomeTitular());

	}

}
