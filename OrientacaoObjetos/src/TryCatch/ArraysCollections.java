package TryCatch;

public class ArraysCollections { // vetores

	public static void main(String[] args) {

		int[] x = new int[10];
		lerVetor(x);
		imprimirVetor(x);
	}

	public static void lerVetor(int[] x) {
		for (int i = 0; i < x.length; i++) {
			x[i] = 2 * i; //[i] esta repetindo o tamanho do vetor que nesse caso o vetor é de 10 posições

		}
	}

	public static void imprimirVetor(int[] x) { // o método esta estatico pois não estou trabalhando com orientação a objetos 
		for (int i = 0; i < x.length; i++) { //apenas imprimindo as posições do vetor
			System.out.println(x[i] + "\t");
		}
	}

}
