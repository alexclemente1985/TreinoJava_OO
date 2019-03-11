package br.com.treinaweb.javaoo.classes;

import br.com.treinaweb.javaoo.excecoes.AceleracaoVeiculoLigadoException;
import br.com.treinaweb.javaoo.excecoes.FrenagemVeiculoException;
import br.com.treinaweb.javaoo.excecoes.VelocidadeNulaNegException;


public final class Moto extends Veiculo {
	public Moto() {
		this.qtdRodas = 2;
	}
	public Moto(String nome, String marca) {
		this.qtdRodas = 2;
		this.setNome(nome);
		this.setMarca(marca);
	}
	@Override
	public void acelerar() throws AceleracaoVeiculoLigadoException{
		if (this.ligado) {
			this.velocidade += 2;
		}else {
			throw new AceleracaoVeiculoLigadoException(this.nome);
		}
	}
	@Override
	public void frear() throws FrenagemVeiculoException,VelocidadeNulaNegException{//Exception{
		if (this.velocidade > 0 && this.ligado) {
			this.velocidade -= 2;
			if (this.velocidade < 0) {
				this.velocidade = 0;
			}
		}else if (!this.ligado){
			throw new FrenagemVeiculoException(this.nome);
		}else if (this.velocidade <= 0) {
			throw new VelocidadeNulaNegException(this.nome);
		}
	}
	@Override
	public void preparar() {
		System.out.println("Usar capacete antes de partir!");
	}
	
}
