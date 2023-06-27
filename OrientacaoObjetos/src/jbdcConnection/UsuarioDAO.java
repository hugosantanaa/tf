package jbdcConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class UsuarioDAO {

	private Connection conexao;

	public UsuarioDAO() {
		this.conexao = new ConnectionFactory().conectar();
	}

	// OPERAÇÕES DE CRUD (CREATE, READ, UPDATE E DELETE).

	// INSERT
	public void insert(Usuario usuario) {// inserir o que vai ser gravado no banco.
		String sql = "Insert into usuario (id, nome, senha, dataCadastro) values (?,?,?,?)";
		
		try {
			PreparedStatement stmt = conexao.prepareStatement(sql); //vinculando conexão com o sql
			stmt.setLong(1,usuario.getId());
			stmt.setString(2, usuario.getNome());
			stmt.setString(3, usuario.getSenha());
			stmt.setDate(4, usuario.getDataCadastro());
			stmt.execute();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		
		
	}

	// SELECTALL -
	public List<Usuario> selectAll() {

		return null;
	}

	// UPDATEBYID
	public Usuario selectById(long id) {

		return null;
	}
	
	//UPDATE
	public void update(Usuario usuario) {
		
	}
	
	
	// DELETE
	public void delete(long id) {
		
	}
}
