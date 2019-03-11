package br.com.treinaweb.javaoo.main;

import br.com.treinaweb.javaoo.classes.Carro;
import br.com.treinaweb.javaoo.classes.Moto;
//import br.com.treinaweb.javaoo.classes.Veiculo;
import br.com.treinaweb.javaoo.excecoes.*;

public class Main {
	public static void main(String[] args) {//throws FrenagemVeiculoException, VelocidadeNulaNegException {
		try {
			//Veiculo corsa = new Veiculo();
			//Carro corsa = new Carro();
			//corsa.setNome("Corsa");
			//corsa.setMarca("GM");
			//Veiculo corsa = new Carro("Corsa", "GM");
			//Veiculo corsa = new Moto(); //polimorfismmo
			Carro corsa = new Carro("Corsa","GM");
			corsa.setChassi("1ASSD");
			System.out.println("Quantidade de rodas do veículo "+corsa.getNome()+": "+corsa.getQtdRodas()); 
			//corsa.setQtdRodas(4);
			System.out.println(String.format("Veículo %s está ligado? %b",corsa.getNome(),corsa.isLigado()));
			
			corsa.ligar();
			System.out.println(String.format("Veículo %s está ligado? %b", corsa.getNome(),corsa.isLigado()));
			
			//System.out.println("Tanque do "+corsa.getNome()+" antes de abastecer: "+corsa.getQtdCombustivel());
			//corsa.abastecer(10);
			//System.out.println("Tanque do "+corsa.getNome()+" depois de abastecer: "+corsa.getQtdCombustivel());
			
			//((Carro)corsa).setQtdPortas(4); //Uso de cast em objeto
			corsa.setQtdPortas(4);
			System.out.println(String.format("Quantidade de portas do veículo %s: %d",corsa.getNome(),corsa.getQtdPortas()));
			
			System.out.println("Velocidade atual do veículo "+corsa.getNome()+": "+corsa.getVelocidade()+"Km/h");
			corsa.acelerar();
			System.out.println("Velocidade atual do veículo "+corsa.getNome()+": "+corsa.getVelocidade()+"Km/h");
			corsa.frear();
			System.out.println("Velocidade atual do veículo "+corsa.getNome()+" após frenagem: "+corsa.getVelocidade()+"Km/h");
			//corsa.frear();
			corsa.desligar();
			
			//corsa.frear();
			System.out.println("Tanque do "+corsa.getNome()+" antes de abastecer: "+corsa.getQtdCombustivel());
			corsa.abastecer(10);
			System.out.println("Tanque do "+corsa.getNome()+" depois de abastecer: "+corsa.getQtdCombustivel());
			
			
			Moto fazer = new Moto();
			fazer.setNome("Fazer");
			fazer.abastecer(10);
			System.out.println("Quantidade de combustível da "+fazer.getNome()+": "+fazer.getQtdCombustivel());
			
			fazer.setChassi("ADSFF");
			fazer.ligar();
			fazer.acelerar();
			System.out.println("Velocidade atual do veículo "+fazer.getNome()+": "+fazer.getVelocidade()+"Km/h");
			fazer.frear();
			System.out.println("Velocidade atual do veículo "+fazer.getNome()+": "+fazer.getVelocidade()+"Km/h");
			fazer.frear();
			
			
		}catch (AbastecimentoVeiculoLigadoException e) {
			System.out.println("Abastecimento não permitido: "+ e.getMessage());
		}catch (ChassiInvalidoException e) {
			System.out.println("Erro no valor do chassi: "+ e.getMessage());
		}catch (AceleracaoVeiculoLigadoException e) {
			System.out.println("Impossível acelerar: "+e.getMessage());
		}catch (Exception e) {
			System.out.println("Ocorreu um erro: "+ e.getMessage());
		}
		
		
		
		
	}

}
