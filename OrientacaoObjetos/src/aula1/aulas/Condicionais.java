package aula1.aulas;

public class Condicionais {

	public static void main(String[] args) {

		int ouro = 1000;
		int prata = 7000;
		int bronze = 5000;

		/*if (ouro > prata) {
			if (ouro > bronze) {
				System.out.println("Ouro é o mais pesado");
			} else {
				System.out.println("Bronze é mais pesado");
			}

		} else if (prata > bronze) {
			System.out.println("Prata é o mais pesado");
		} else
			System.out.println("Bronze é o mais pesado");
*/
		
		if (ouro > prata && ouro > bronze) {
			System.out.println("Ouro é maior");
		}else if (prata > bronze) {
			System.out.println("Prata é o maior");
		}else {
			System.out.println("Bronze é o maior");
		}
	
	}

}
