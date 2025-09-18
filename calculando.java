package interfac;

import interfac.Atividade_3.Calculos;

public class calculando implements Calculos {
	@Override
	public double somar(double a, double b) {
		return a + b;
	}

	@Override
	public double sub(double a, double b) {
		return a - b;
	}

	@Override
	public double mult(double a, double b) {
		return a * b;
	}

	@Override
	public double div(int a, int b) {
		if (b == 0) {
			System.out.println("Erro: Divisão por zero não é permitida.");
			return Double.NaN;
		}
		return (double) a / b;
	}

	@Override
	public double exp(int base, int expoente) {
		return Math.pow(base, expoente);
	}
}
