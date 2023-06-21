package projetoBanco;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

//javabeans
public class Cliente {

	// atributos da classe
	private String nomeTitular, tipoConta, cpfTitular, rgTitular, endTitular;
	private final Date dataNasc; //posso utilizar a variavel "final" em coisas que não mudam
	


	// construtor
	public Cliente(String nomeTitular, String tipoConta, String cpfTitular, String rgTitular, String endTitular, String dataNasc) throws ParseException {
		super();
		this.nomeTitular = nomeTitular;
		this.tipoConta = tipoConta;
		this.cpfTitular = cpfTitular;
		this.rgTitular = rgTitular;
		this.endTitular = endTitular;
		SimpleDateFormat formato = new SimpleDateFormat("dd/mm/yyyy");
		this.dataNasc = formato.parse(dataNasc);
	}

	// getters - ler dados / setters - escrever dados
	public String getNomeTitular() {
		return nomeTitular;
	}

	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}

	public String getTipoConta() {
		return tipoConta;
	}

	public void setTipoConta(String tipoConta) {
		this.tipoConta = tipoConta;
	}

	public String getCpfTitular() {
		return cpfTitular;
	}

	public void setCpfTitular(String cpfTitular) {
		this.cpfTitular = cpfTitular;
	}

	public String getRgTitular() {
		return rgTitular;
	}

	public void setRgTitular(String rgTitular) {
		this.rgTitular = rgTitular;
	}

	public String getEndTitular() {
		return endTitular;
	}

	public void setEndTitular(String endTitular) {
		this.endTitular = endTitular;
	}

}
