package br.com.treinaweb.javaoo.excecoes;

 public class ChassiInvalidoException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 8046906767502979484L;

	public ChassiInvalidoException(String chassi, String nome) {
		super(String.format("O chassi [%s] do veículo %s é inválido",chassi,nome));
	}
}
