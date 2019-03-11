package br.com.treinaweb.javaoo.classes;

import br.com.treinaweb.javaoo.excecoes.ChassiInvalidoException;

public class Carro extends Veiculo{
	private int qtdPortas;
	
	public Carro() {
		this.qtdRodas = 4;
	}
	public Carro(String nome, String marca) {
		this.qtdRodas = 4;
		this.setNome(nome);
		this.setMarca(marca);
				
	}
	public Carro(String nome, String marca, String chassi) throws Exception {
		
		  this.qtdRodas = 4;
		  this.setNome(nome);
		  this.setMarca(marca);
		  if (chassi.length() == 5) {
		     this.setChassi(chassi);
		  }else {
			  throw new ChassiInvalidoException(chassi,nome);
		  }
		
	}
	public int getQtdPortas() {
		return qtdPortas;
	}
	public void setQtdPortas(int qtdPortas) {
		this.qtdPortas = qtdPortas;
	}
	@Override
	public void preparar() {
		System.out.println("Colocar o cinto de segurança!");
	}
	
}
