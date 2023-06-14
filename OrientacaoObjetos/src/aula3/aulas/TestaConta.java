package aula3.aulas;

public class TestaConta {

	public static void main(String[] args) {
		
		
		CDB cdb = new CDB();
		LCI lci = new LCI();
		LCA lca = new LCA();
		
		Cliente hugo = new Cliente("Hugo", "123456789", "1234567890", "Rua X, 123", null);
		Cliente mariana = new Cliente("Mariana", "123456789", "1234567890", "Rua X, 123", null);
		
		ContaCorrente contaHugo = new ContaCorrente(hugo, 1, 0);
		ContaCorrente contaMariana = new ContaCorrente(mariana, 2, 0);
		
		//SIMULAÇÕES
		contaHugo.depositar(10000);
		contaMariana.depositar(20000);
		
		contaHugo.consultar();
		contaMariana.consultar();
		
		contaHugo.sacar(5000);
		contaMariana.sacar(10000);
		
		contaHugo.consultar();
		contaMariana.consultar();
		
		contaHugo.investimento(lca,1000);
		contaMariana.investimento (lca,2000);
		
		contaHugo.consultar();
		contaMariana.consultar();
		
		Conta.exibirContador();
		
	}

}
