package br.com.treinaweb.javaoo.main;

import br.com.treinaweb.javaoo.classes.Carro;

public class Main {
	public static void main(String[] args) {
		try {
			//Veiculo corsa = new Veiculo();
			//Carro corsa = new Carro();
			//corsa.setNome("Corsa");
			//corsa.setMarca("GM");
			Carro corsa = new Carro("Corsa", "GM");
			corsa.setChassi("1ASSDe");
			System.out.println("Quantidade de rodas do veículo "+corsa.getNome()+": "+corsa.getQtdRodas()); 
			//corsa.setQtdRodas(4);
			
			corsa.ligar();
			
			System.out.println("Tanque do "+corsa.getNome()+" antes de abastecer: "+corsa.getQtdCombustivel());
			corsa.abastecer(10);
			System.out.println("Tanque do "+corsa.getNome()+" depois de abastecer: "+corsa.getQtdCombustivel());
			
			corsa.desligar();
			
			Carro celta = new Carro();
			celta.getQtdRodas();
			
		} catch (Exception e) {
			System.out.println("Ocorreu um erro: "+ e.getMessage());
		}
		
		
		
		
	}

}
