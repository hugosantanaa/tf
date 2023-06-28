package br.com.fiap.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.fiap.connection.ConnectionFactory;
import br.com.fiap.model.Usuario;

public class UsuarioDAO {

	private Connection conexao;

	public UsuarioDAO() {
		this.conexao = new ConnectionFactory().conectar();
	}

	// OPERAÇÕES DE CRUD (CREATE, READ, UPDATE E DELETE).

	// INSERT
	public void insert(Usuario usuario) {// inserir o que vai ser gravado no banco.
		String sql = "Insert into usuario (nome, senha, dataCadastro) values (?,?,?)";
		
		try {
			PreparedStatement stmt = conexao.prepareStatement(sql); //vinculando conexão com o sql
			
			stmt.setString(1, usuario.getNome());
			stmt.setString(2, usuario.getSenha());
			stmt.setDate(3, usuario.getDataCadastro());
			stmt.execute();
			//fechando
			stmt.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		
		
	}

	// SELECTALL -
	public List<Usuario> selectAll() {
		List<Usuario> usuarios = new ArrayList<Usuario>();
		String sql = "select * from usuario order by nome";
		try {
			PreparedStatement stmt = conexao.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();

		
		while (rs.next()) { //enquanto tiver dados na tabela (proximo registro)
			Usuario usuario = new Usuario();
			usuario.setId(rs.getLong("id"));
			usuario.setNome(rs.getString("nome"));
			usuario.setSenha(rs.getString("senha"));
			usuario.setDataCadastro(rs.getDate("dataCadastro"));		
			usuarios.add(usuario); //cada objeto usuario adicionado a lista de usuarios
			
		}
		rs.close();
		stmt.close();
		}catch (SQLException e) {
			e.printStackTrace();
		}
		return usuarios;

	}

	// UPDATEBYID
	public Usuario selectById(long id) {
		Usuario usuario = null;
		String sql =  "select * from usuario where id=?";
		try {
			PreparedStatement stmt = conexao.prepareStatement(sql);
			stmt.setLong(1, id);
			ResultSet rs = stmt.executeQuery();
			
		while (rs.next()) { //enquanto tiver dados na tabela (proximo registro)
			usuario = new Usuario();
			usuario.setId(rs.getLong("id"));
			usuario.setNome(rs.getString("nome"));
			usuario.setSenha(rs.getString("senha"));
			usuario.setDataCadastro(rs.getDate("dataCadastro"));		
			
		}
		rs.close();
		stmt.close();
		}catch (SQLException e) {
			e.printStackTrace();
		}
		return usuario;
		
		
	}
	
	//UPDATE
	public void update(Usuario usuario) {
		String sql = "update usuario set nome=?, senha=? where id=?";
		
		try {
			PreparedStatement stmt = conexao.prepareStatement(sql);
			stmt.setString(1, usuario.getNome());
			stmt.setString(2, usuario.getSenha());
			stmt.setLong(3, usuario.getId());
			stmt.execute();
			stmt.close();

		}catch (SQLException e){
			e.printStackTrace();
		}
		
	}
	
	
	// DELETE
		public void delete(long id) {
			String sql = "delete from USUARIO where (id = ?)";
			
			try {
				PreparedStatement stmt = conexao.prepareStatement(sql);
				stmt.setLong(1, id);
				stmt.execute();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

