package TryCatch;

public class EstruturaForGenerica { // FOREACH

	public static void main(String[] args) {

		int[] numeros = new int[10];

		for (int i=0; i < numeros.length; i++) {
			numeros[i] = i*2; //o "i" esta atribuindo dados para o meu vetor
		}

		for (int numero : numeros) {
			System.out.println(numero + "\t");
		}
	}

}
