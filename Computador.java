package POO;

public class Computador {

	String marca;
	int memoriaRAM;
	int armazenamento;
	boolean ligado;

	public void ligar() {
		ligado = true;
		System.out.println("Computador ligado.");
	}

	public void desligar() {
		ligado = false;
		System.out.println("Computador desligado.");
	}

	public void reiniciar() {
		System.out.println("Computador reiniciando...");
	}
}
