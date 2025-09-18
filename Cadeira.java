package POO;

public class Cadeira {

	String modelo;
	String cor;
	boolean temRodinhas;
	boolean temAjusteAltura;

	public void girar() {
		System.out.println("A cadeira está girando.");
	}

	public void ajustarAltura() {
		System.out.println("Altura ajustada.");
	}

	public void travarRodinhas() {
		System.out.println("Rodinhas travadas.");
	}
}
