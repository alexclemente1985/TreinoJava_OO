package br.com.treinaweb.javaoo.classes;

public class Veiculo {
	//fora dos padrões de OO
	//public String nome;
	//public String marca;
	//public String qtdRodas;
	//public String chassi;
	
	private String nome;
	private String marca;
	private int qtdRodas;
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
	public void setQtdRodas(int qtdRodas) {
		this.qtdRodas = qtdRodas;
	}
	public String getChassi() {
		return chassi;
	}
	public void setChassi(String chassi) {
		this.chassi = chassi;
	}
	public float getQtdCombustivel() {
		return qtdCombustivel;
	}
	//Método set abaixo não pode existir senão compromete o encapsulamento
	//public void setQtdCombustivel(float qtdComb) {
	//	this.qtdCombustivel = qtdComb;
	//}
	public void ligar() {
		System.out.println("O veículo ligou!");
	}
	public void desligar() {
		System.out.println("Veículo foi desligado.");
	}
	public float abastecer(float litros) {
		qtdCombustivel += litros;
		return qtdCombustivel;
	}
	

}
