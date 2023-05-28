package JFOPratica3;
import java.util.Scanner;
public class Atividade {
    public static void main(String[] args) {

        // Declarar o Scanner
        Scanner teclado = new Scanner(System.in);

        // Aceitar entrada de String
        System.out.print("Digite seu nome: ");
        String string = teclado.nextLine();

        // Aceitar entrada de int
        System.out.print("Digite um número inteiro: ");
        int numeroInteiro = teclado.nextInt();

        // Aceitar entrada de double
        System.out.print("Digite um número decimal: ");
        double numeroDecimal = teclado.nextDouble();

        // Usar entrada em uma pergunta para o usuário
        System.out.println("Olá, " + string + "! O número " + numeroInteiro + " é um bom número?");

        // Fazer cálculos com entrada int
        int resultadoInt = numeroInteiro * 2;
        System.out.println("O dobro do número inteiro é: " + resultadoInt);

        // Fazer cálculos com entrada double
        double resultadoDouble = numeroDecimal / 2;
        System.out.println("A metade do número decimal é: " + resultadoDouble);

        // Aceitar um total de dez entradas
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite um número: ");
            int numero = teclado.nextInt();
            System.out.println("O número digitado foi: " + numero);
        }

        teclado.close();
    }
}
