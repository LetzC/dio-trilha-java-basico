
import java.util.Scanner;

public class Contador {
	public static void main(String[] args) {
		Scanner terminal = new Scanner(System.in);

		System.out.println("Digite o primeiro parâmetro");
		int parametroUm = terminal.nextInt();

		System.out.println("Digite o segundo parâmetro");
		int parametroDois = terminal.nextInt();

		try {
			contar(parametroUm, parametroDois);
		} catch (ParametrosInvalidosException exception) {
			System.out.println(exception.getMessage());
		}

	}

	static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
		if (parametroUm < parametroDois) {
			int contagem = parametroDois - parametroUm;

			for (int numero = 1; numero <= contagem; numero++) {
				System.out.println("Imprimindo o número " + numero);
			}
		} else {
			throw new ParametrosInvalidosException();
		}
	}
}