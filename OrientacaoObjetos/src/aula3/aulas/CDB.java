package aula3.aulas;

public class CDB implements Produto {

	@Override
	public double investir(double valor) {
		
		return valor * 1.1375;
	}

}
