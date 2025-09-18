package interfac;


public class principal_calculando {
	
	    public static void main(String[] args) {
	        
	        calculando calculadora = new calculando();

	        System.out.println("--- Teste dos Métodos de Cálculo ---");
	        
	       
	        double resultadoSoma = calculadora.somar(10.5, 5.5);
	        System.out.println("Soma: 10.5 + 5.5 = " + resultadoSoma);

	        double resultadoSubtracao = calculadora.sub(20.0, 7.5);
	        System.out.println("Subtração: 20.0 - 7.5 = " + resultadoSubtracao);
	        
	        double resultadoMultiplicacao = calculadora.mult(4.2, 3.0);
	        System.out.println("Multiplicação: 4.2 * 3.0 = " + resultadoMultiplicacao);
	        
	        double resultadoDivisao = calculadora.div(15, 3);
	        System.out.println("Divisão: 15 / 3 = " + resultadoDivisao);

	        double resultadoExponenciacao = calculadora.exp(2, 5);
	        System.out.println("Exponenciação: 2^5 = " + resultadoExponenciacao);
	    }
	}


