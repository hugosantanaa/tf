package aula1.exercicios;

import javax.swing.JOptionPane;

public class Exercicio2 {

	public static void main(String[] args) {
		
		int idade = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite sua idade"));
		
		if(idade < 16) {
			JOptionPane.showMessageDialog(null,"Você não pode votar, consequentemente não podera embarcar");
		}else if (idade >= 16 && idade <18 || idade >=75) {
			JOptionPane.showMessageDialog(null, "Você tem a permissão de votar, entretando não é obrigatório");
		}else {
			JOptionPane.showMessageDialog(null,"Seu voto é obrigatório!");
		}

	}

}
