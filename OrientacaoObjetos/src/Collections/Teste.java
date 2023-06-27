package Collections;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;



public class Teste {
	public static void main(String[] args) {
		// OBJETOS TIPOS USUARIO
		Usuario rafael = new Usuario(1 ,"Rafael", "R123");
		Usuario joao = new Usuario(2, "Joao", "123");
		Usuario pedro = new Usuario(3, "Pedro", "P123");
		Usuario alice = new Usuario(4, "Alice", "A123");
		Usuario gabrielly = new Usuario(5, "Gabrielly", "G123");

		// COLLECTION (LISTA USUARIOS)
		List<Usuario> listaUsuarios = new ArrayList<Usuario>();
		
		//ADICIONANDO OBJETOS USER A LISTA DE USUARIO
		listaUsuarios.add(gabrielly);
		listaUsuarios.add(rafael);
		listaUsuarios.add(pedro);
		listaUsuarios.add(alice);
		listaUsuarios.add(joao);
		
		for(Usuario usuario: listaUsuarios) {
			System.out.println("Nome " + usuario.getNome() + " -- Id: " + usuario.getId());
		}
		
		Collections.sort(listaUsuarios);
		
		System.out.println("----");
		
		//ITERANDO A LISTA ORDENADA
		for (Usuario usuario : listaUsuarios) {
			System.out.println("Id: " + usuario.getId() + " -- " + "Nome: " + usuario.getNome());
		}
		

	}
}
