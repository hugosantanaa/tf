package aula1.exercicios;

import javax.swing.JOptionPane;


public class ExFibonacci {

	public static void main(String[] args) {
		
		
		// Solicita o número máximo da sequência
       int maxNumber = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o número máximo da sequência de Fibonacci: "));
        
       
        
        // Exibe a sequência de Fibonacci até o número máximo
        System.out.println("Sequência de Fibonacci até " + maxNumber + ":");
        for (int i = 0; i <= maxNumber; i++) {
            System.out.print(fibonacci(i) + " ");
        }

	}


public static int fibonacci(int n) {
    
    
if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}
