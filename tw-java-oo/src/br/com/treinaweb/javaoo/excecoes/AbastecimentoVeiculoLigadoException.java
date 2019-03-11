package br.com.treinaweb.javaoo.excecoes;

public class AbastecimentoVeiculoLigadoException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1994601292136899329L;
	public AbastecimentoVeiculoLigadoException(String nome) {
		super(String.format("Veículo %s está ligado e não pode ser abastecido.",nome));
	}
}
