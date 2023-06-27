package jbdcConnection;

public class teste {

	public static void main(String[] args) {
		
		UsuarioDAO dao = new UsuarioDAO();
		
		Usuario hugo = new Usuario(1, "Hugo" , "123ABC");
		Usuario	mariana = new Usuario(2, "Mariana" , "123ABC");
		
		dao.insert(mariana);

	}

}
