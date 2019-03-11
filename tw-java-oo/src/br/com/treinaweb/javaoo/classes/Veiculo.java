package br.com.treinaweb.javaoo.classes;

import br.com.treinaweb.javaoo.excecoes.ChassiInvalidoException;
import br.com.treinaweb.javaoo.excecoes.AbastecimentoVeiculoLigadoException;
import br.com.treinaweb.javaoo.excecoes.AceleracaoVeiculoLigadoException;
import br.com.treinaweb.javaoo.excecoes.FrenagemVeiculoException;
import br.com.treinaweb.javaoo.excecoes.VelocidadeNulaNegException;

public abstract class Veiculo {
	//fora dos padrões de OO
	//public String nome;
	//public String marca;
	//public String qtdRodas;
	//public String chassi;
	
	protected String nome;
	private String marca;
	protected int qtdRodas;
	private String chassi;
	private float qtdCombustivel;
	protected boolean ligado;
	protected float velocidade;
	
	public Veiculo() {
		this.ligado = false;
		this.velocidade = 0;
	}
	
	public boolean isLigado() {
		return ligado;
	}
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
	public void setChassi(String chassi) throws ChassiInvalidoException{ //método void pode lançar exceções
		if (chassi.length() == 5) {
			this.chassi = chassi;
		}else {
			
			throw new ChassiInvalidoException(chassi,this.nome);
			//throw new ChassiInvalidoException("Chassi informado é inválido.");
		}
	}
	public float getQtdCombustivel() {
		return qtdCombustivel;
	}
	
	public float getVelocidade() {
		return velocidade;
	}
	
	//Método set abaixo não pode existir senão compromete o encapsulamento
	//public void setQtdCombustivel(float qtdComb) {
	//	this.qtdCombustivel = qtdComb;
	//}
	public final void ligar() {
		this.ligado = true;
		this.velocidade = 0;
		System.out.println(this.nome+" ligou!");
	}
	public final void desligar() {
		this.ligado = false;
		this.velocidade = 0;
		System.out.println(this.nome+" foi desligado.");
	}
	public final void abastecer(float litros) throws AbastecimentoVeiculoLigadoException {
		if (this.ligado) {
			throw new AbastecimentoVeiculoLigadoException(this.nome);
		}else {
			qtdCombustivel += litros;
			
		}
		
		
	}
	
	public void acelerar() throws AceleracaoVeiculoLigadoException{
		if (this.ligado) {
			this.velocidade += 10;
		}else {
			throw new AceleracaoVeiculoLigadoException(this.nome);
		}
	}
	public void frear() throws FrenagemVeiculoException,VelocidadeNulaNegException{//Exception{
		if (this.velocidade > 0 && this.ligado) {
			this.velocidade -= 10;
			if (this.velocidade < 0) {
				this.velocidade = 0;
			}
		}else if (!this.ligado){
			throw new FrenagemVeiculoException(this.nome);
		}else if (this.velocidade <= 0) {
			throw new VelocidadeNulaNegException(this.nome);
		}
	}
	
	public abstract void preparar();
	

}
