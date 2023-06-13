package aula2.aulas;

public class TestaConta {

	public static void main(String[] args) {
		
		Cliente hugo = new Cliente("Hugo", "123456789", "123456789", "Rua X, 123", null);
		Cliente mariana = new Cliente("Mariana", "123456789", "123456789", "Rua X, 123", null);
		
		Conta contaHugo = new Conta(hugo, 1, 1, "teste", 0);
		Conta contaMariana = new Conta(mariana, 2,1, "teste", 0 );
		
		//SIMULAÇÕES
		contaHugo.depositar(10000);
		contaMariana.depositar(20000);
		
		contaHugo.consultar();
		contaMariana.consultar();
		
		contaHugo.sacar(5000);
		contaMariana.sacar(10000);
		
		contaHugo.consultar();
		contaMariana.consultar();
		
		contaHugo.transferir(contaMariana, 1000);
		
		contaHugo.consultar();
		contaMariana.consultar();
		
		contaMariana.transferir(contaHugo, 1100);
		
		contaHugo.consultar();
		contaMariana.consultar();
		
		
		
	}

}
