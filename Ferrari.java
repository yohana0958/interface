package interfac;

import interfac.Atividade1.Veiculo;

public class Ferrari implements Veiculo {

	@Override
	public void ligar() {
		System.out.println("A Ferrari está ligando. Vrum, vrum!");
	}

	@Override
	public void desligar() {
		System.out.println("A Ferrari está desligando.");
	}

	@Override
	public void manobrar() {
		System.out.println("A Ferrari está manobrando com precisão.");
	}

	@Override
	public void engatar() {
		System.out.println("A Ferrari engatou a marcha.");
	}

	@Override
	public void acelerar() {
		System.out.println("A Ferrari está acelerando! Que velocidade!");
	}

	@Override
	public void frear() {
		System.out.println("A Ferrari está freando suavemente.");
	}

}
