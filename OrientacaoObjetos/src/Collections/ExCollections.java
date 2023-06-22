package Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import TryCatch.Usuario;

public class ExCollections {
	
	public static void main(String[] args) {
		
//		List<String> lista = new ArrayList<String>();
//		lista.add("Neymar Jr");
//		lista.add("Rafael");
//		lista.add("Larissa");
//		lista.add("Pedro");
//		lista.add("Diego");
//		lista.add("Hugao");
//		lista.add("Felipe");
//		
//		for(String listao:lista) {
//			System.out.println(listao);
//		}
		
		List<Usuario> list = new ArrayList<Usuario>();
		Usuario bruna = new Usuario ("Bruna Marquezine", "1234");
		Usuario neymar = new Usuario ("Neymar Junior", "nj10");
		Usuario rafael = new Usuario ("Rafael", "nj10");
		Usuario bianca = new Usuario ("Bianca", "nj10");
		
		list.add(bruna);
		list.add(neymar);
		list.add(rafael);
		list.add(bianca);
		
		for(Usuario listao:list) {
			System.out.println(listao.getNome());
		}
		
		
	}

	
}
