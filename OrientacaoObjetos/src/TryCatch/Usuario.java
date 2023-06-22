package TryCatch;

import java.util.Date;

public class Usuario {
	
	private int id;
	private String nome, email, telefone, senha;
	private Date dataCadastro;
	
	
//	construtor
	public Usuario(String nome, String senha) {
	this.nome = nome;
	this.senha = senha;
	this.dataCadastro = new Date (System.currentTimeMillis());
}





	public int getId() {
		return id;
	}





	public void setId(int id) {
		this.id = id;
	}





	public String getNome() {
		return nome;
	}





	public void setNome(String nome) {
		this.nome = nome;
	}





	public String getEmail() {
		return email;
	}





	public void setEmail(String email) {
		this.email = email;
	}





	public String getTelefone() {
		return telefone;
	}





	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}





	public String getSenha() {
		return senha;
	}





	public void setSenha(String senha) {
		this.senha = senha;
	}





	public Date getDataCadastro() {
		return dataCadastro;
	}





	public void setDataCadastro(Date dataCadastro) {
		this.dataCadastro = dataCadastro;
	}





	public static void main(String[] args) {
		
		Usuario usuarios[] = new Usuario [2];
		usuarios [0] = new Usuario ("Bruna Marquezine", "1234");
		usuarios[1] = new Usuario ("Neymar Junior", "nj10");
		
		for (Usuario usuario : usuarios) {
			System.out.println("NOME : " + usuario.getNome());
			System.out.println("SENHA : " + usuario.getSenha());
			System.out.println("DATA DE CADASTRO : " + usuario.getDataCadastro());
			System.out.println("-------------------------------------");
		}
	}
	

}
