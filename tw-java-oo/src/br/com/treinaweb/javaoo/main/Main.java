package br.com.treinaweb.javaoo.main;

import br.com.treinaweb.javaoo.classes.Veiculo;

public class Main {
	public static void main(String[] args) {
		Veiculo corsa = new Veiculo();
		//corsa.marca = "GM";
		//corsa.nome = "Corsa";
		//
		corsa.setNome("Corsa");
		corsa.setMarca("GM");
		corsa.setChassi("1ASSD232WER");
		corsa.setQtdRodas(4);
		System.out.println(corsa.getNome());
		corsa.ligar();
		System.out.println("Tanque do Corsa antes de abastecer:");
		System.out.println(corsa.getQtdCombustivel());
		System.out.println("Tanque do Corsa depois de abastecer:");
		corsa.abastecer(10);
		System.out.println(corsa.getQtdCombustivel());
		corsa.desligar();
		
		Veiculo celta = new Veiculo();
		//celta.nome="Celta";
		//celta.marca="GM";
		//
		celta.setNome("Celta");
		celta.setMarca("GM");
		System.out.println(celta.getNome());
		celta.ligar();
		celta.desligar();
		
		
	}

}
