package br.com.treinaweb.javaoo.excecoes;

public class VelocidadeNulaNegException extends Exception{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 8459783163739916384L;

	public VelocidadeNulaNegException(String nome) {
		super(String.format("Veículo %s já se encontra parado!", nome));
	}

}
