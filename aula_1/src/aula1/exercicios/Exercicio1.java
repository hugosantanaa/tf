package aula1.exercicios;

import javax.swing.JOptionPane;

public class Exercicio1 {

	public static void main(String[] args) {
		
		double investi = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor do investimento"));
		
		if(investi > 1000) {
			JOptionPane.showMessageDialog(null, "O valor de doação sera de 15%, totalizando R$"+(investi*=0.15));
		}else {
			JOptionPane.showMessageDialog(null, "O valor de doação sera de 5%, totalizando R$"+(investi*=0.05));
		}
		
		
	
	}

}
