package interfac;

import interfac.Atividade_2.Computador;

public class gamer implements Computador {
	@Override
	public void ligar() {
		System.out.println("Computador Gamer ligando... Preparando para a batalha!");
	}

	@Override
	public void reiniciar() {
		System.out.println("Computador Gamer reiniciando...");
	}

	@Override
	public void desligar() {
		System.out.println("Computador Gamer desligando. Jogo encerrado.");
	}

	@Override
	public void carregandoSistema() {
		System.out.println("Sistema operacional gamer carregando com alta performance.");
	}
}

class Home implements Computador {
	@Override
	public void ligar() {
		System.out.println("Computador Home ligando... Bem-vindo de volta.");
	}

	@Override
	public void reiniciar() {
		System.out.println("Computador Home reiniciando...");
	}

	@Override
	public void desligar() {
		System.out.println("Computador Home desligando. Até a próxima.");
	}

	@Override
	public void carregandoSistema() {
		System.out.println("Sistema operacional doméstico carregando.");

	}

}
