package interfac;

public class Principal_veiculo {
	public static void main(String[] args) {
		System.out.println("--- Teste do Exercício 1 ---");

		Ferrari carro1 = new Ferrari();
		System.out.println("--- Carro 1 ---");
		carro1.ligar();
		carro1.acelerar();
		carro1.desligar();

		System.out.println();

		Ferrari carro2 = new Ferrari();
		System.out.println("--- Carro 2 ---");
		carro2.ligar();
		carro2.engatar();
		carro2.manobrar();
		carro2.frear();
	}
}
