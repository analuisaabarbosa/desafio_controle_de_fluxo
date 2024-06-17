package contador;
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {

        Scanner terminal = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int primeiroParametro = terminal.nextInt();

        System.out.println("Digite o segundo número: ");
        int segundoParametro = terminal.nextInt();

        try {
            if (primeiroParametro >= segundoParametro) {
                throw new ParametrosInvalidosException("O segundo número deve ser menor que o primeiro.");
            }
            contar(primeiroParametro, segundoParametro);
        } catch (ParametrosInvalidosException exception) {
            System.out.println(exception.getMessage());
        }finally {
            terminal.close();
        }

    }

    static void contar(int primeiroParametro, int segundoParametro) throws ParametrosInvalidosException{

        int contagem = segundoParametro - primeiroParametro;
        for(int i = 1; i <= contagem; i++){
            System.out.println("Imprimindo números: " + i);
        };
    }
}
