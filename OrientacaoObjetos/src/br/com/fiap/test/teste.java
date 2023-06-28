package br.com.fiap.test;

import java.util.List;

import br.com.fiap.model.Usuario;
import br.com.fiap.repository.UsuarioDAO;

public class teste {

	public static void main(String[] args) {
		
		UsuarioDAO dao = new UsuarioDAO();
		
		Usuario hugo = new Usuario("Hugo" , "123ABC");
		Usuario	mariana = new Usuario("Mariana" , "123ABC");
		Usuario nj = new Usuario("Neymar Jr" , "NJ10");
		Usuario messi = new Usuario("Lionel Messi" , "MESSI10");
		Usuario alessandra = new Usuario("Alessandra" , "a1234");

		
//		dao.delete(4);
//		dao.insert(alessandra);
//		dao.insert(nj);
//		dao.insert(hugo); GUSTAVO TORRENTE
//		dao.insert(mariana);
//		dao.insert(messi);
////		
//		List<Usuario> lista = dao.selectAll();
//	
//		for(Usuario usuario : lista) {
//			System.out.println("ID: "+usuario.getId());
//			System.out.println("NOME: "+usuario.getNome());
//			System.out.println("SENHA: "+usuario.getSenha());
//			System.out.println("DATA DE CADASTRO: "+usuario.getDataCadastro());
//			System.out.println("-----------------------------");
//		}
		
//		Usuario usuario = dao.selectById(1);
//		System.out.println(usuario.getId());
//		System.out.println(usuario.getNome());
//		System.out.println(usuario.getSenha());
//		System.out.println(usuario.getDataCadastro());
		
		//ALTERANDO NOMES E SENHA PELO ID
		Usuario usuario = dao.selectById(5);
		usuario.setNome("Lionel Messi");
		
		 dao.update(usuario);
		
		
	}

}
