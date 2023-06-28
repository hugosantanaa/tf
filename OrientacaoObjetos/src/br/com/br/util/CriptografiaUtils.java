package br.com.br.util;

import java.math.BigInteger;
import java.security.MessageDigest;

public class CriptografiaUtils {
	
	public static String criptografar(String senha) throws Exception {
		//OBTÊM A INSTâNCIA DE UM ALGORITMO
		MessageDigest md = MessageDigest.getInstance("MD5");
		//PASSA OD DADOS A SEREM CRIPTOGRAFADOS E ESTÍPULA ENCONDING PADRÃO
		md.update(senha.getBytes("ISO-8859-1"));
		//GERA A CHAVE CRIPTOGRAFADA EM ARRAY BYTES PARA POSTERIOR HASHING
		BigInteger hash = new BigInteger(1, md.digest());
		//RETORNA A CHAVE CRIPTOGRAFADA
		return hash.toString(16);
		
	}
	
	
	
}
