package br.com.treinaweb.javaoo.excecoes;

public class AceleracaoVeiculoLigadoException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7311093080712027626L; 
	
	public AceleracaoVeiculoLigadoException(String nome) {
		super(String.format("Veículo %s precisa estar ligado para acelerar!",nome));
	}
}
