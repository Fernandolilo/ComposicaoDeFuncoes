package program;

import java.util.Arrays;
import java.util.function.BiPredicate;
import java.util.function.UnaryOperator;

public class Application {
	public static void main(String [] args) {

		/*
		 * paradigma funciona em java.
		 */
		int [] valores = {1,2,3,4};
		/*Arrays.stream(valores)
			.filter(numero -> numero %2 == 0)
			.map(numero -> numero * 2)
			.forEach(numero -> System.out.println(numero));	*/
		
		
		/*
		 * imperativo
		 */
		
		/*for (int i = 0; i< valores.length; i++) {
			int valor =0;
			if(valores[i]%2 ==0) {
				valor = valores[i] * 2;
				if(valor != 0) {
					System.out.println(valor);
				}
			}
		}*/
		
		/*
		 * funções puras
		 * 
		 */
		
		/*BiPredicate<Integer, Integer> verificarSeMaior =
				(parametro, valorComparacao) -> parametro > valorComparacao;
				System.out.println(verificarSeMaior.test(13, 12));
				System.out.println(verificarSeMaior.test(13, 12));*/
		
		/*
		 * conseito de imutabilidade
		 */
	
	/*	int valor = 20;		
		UnaryOperator<Integer> retornaDobro = v -> v *2;
		System.out.println(retornaDobro.apply(valor));
		System.out.println(valor);*/
	}

}
