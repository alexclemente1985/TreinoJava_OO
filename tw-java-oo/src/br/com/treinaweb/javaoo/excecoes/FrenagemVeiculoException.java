package br.com.treinaweb.javaoo.excecoes;

public class FrenagemVeiculoException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = -4149982358721722385L;

	public FrenagemVeiculoException(String nome) {
		super(String.format("Veículo %s precisa estar ligado para freiar.", nome));
	}
}
