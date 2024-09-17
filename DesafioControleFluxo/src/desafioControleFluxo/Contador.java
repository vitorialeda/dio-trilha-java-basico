package desafioControleFluxo;

import java.util.Scanner;

public class Contador {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o primeiro parametro");
		int paramentroUm = sc.nextInt();
		System.out.println("Digite o segundo parametro");
		int parametroDois = sc.nextInt();

		try {
			contar(paramentroUm, parametroDois);

		} catch (ParametrosInvalidosException exception) {
			System.out.println("O segundo parâmetro deve ser maior que o primeiro");
		}
		sc.close();
	}

	static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
		if (parametroUm >= parametroDois)
			throw new ParametrosInvalidosException();

		int contagem = parametroDois - parametroUm;
		for (int i = 1; i <= contagem; i++) {
			System.out.println("Imprimindo o numero " + i);
		}

	}

}
