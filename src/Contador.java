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
		
		}catch (Exception exception) {
			System.out.println(exception.getMessage());
		}
		
        terminal.close();
	}
	static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
		if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro!");
        }
		
		int contagem = parametroDois - parametroUm;
		for (int contador = 1; contador <= contagem; contador++) {
            System.out.println("Imprimindo o número " + contador);
        }
    }
}
