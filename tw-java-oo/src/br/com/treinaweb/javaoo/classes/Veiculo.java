package br.com.treinaweb.javaoo.classes;

import br.com.treinaweb.javaoo.excecoes.ChassiInvalidoException;


public class Veiculo {
	//fora dos padrões de OO
	//public String nome;
	//public String marca;
	//public String qtdRodas;
	//public String chassi;
	
	private String nome;
	private String marca;
	protected int qtdRodas;
	private String chassi;
	private float qtdCombustivel;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public int getQtdRodas() {
		return qtdRodas;
	}
	//public void setQtdRodas(int qtdRodas) {
	//	this.qtdRodas = qtdRodas;
	//}
	public String getChassi() {
		return chassi;
	}
	public void setChassi(String chassi) throws Exception{ //método void pode lançar exceções
		if (chassi.length() == 5) {
			this.chassi = chassi;
		}else {
			
			throw new ChassiInvalidoException(chassi);
			//throw new ChassiInvalidoException("Chassi informado é inválido.");
		}
	}
	public float getQtdCombustivel() {
		return qtdCombustivel;
	}
	//Método set abaixo não pode existir senão compromete o encapsulamento
	//public void setQtdCombustivel(float qtdComb) {
	//	this.qtdCombustivel = qtdComb;
	//}
	public void ligar() {
		System.out.println(this.nome+" ligou!");
	}
	public void desligar() {
		System.out.println(this.nome+" foi desligado.");
	}
	public float abastecer(float litros) {
		qtdCombustivel += litros;
		return qtdCombustivel;
	}
	

}
