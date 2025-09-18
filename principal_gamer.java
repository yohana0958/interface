package interfac;

public class principal_gamer {
	public static void main(String[] args) {
		gamer pcGamer = new gamer();
		Home pcHome = new Home();

		pcGamer.ligar();
		pcGamer.carregandoSistema();
		pcGamer.reiniciar();
		pcGamer.desligar();

		System.out.println("-----");

		pcHome.ligar();
		pcHome.carregandoSistema();
		pcHome.reiniciar();
		pcHome.desligar();

	}
}