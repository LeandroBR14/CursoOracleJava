package JFOPratica4.Problema2;

import java.util.Scanner;

public class Nome {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nomeCompleto = teclado.nextLine();
        
        int espaco = nomeCompleto.lastIndexOf(' ');
        String ultimoNome = nomeCompleto.substring(espaco + 1);
        String inicialPrimeiroNome = nomeCompleto.substring(0, 1);

        System.out.println("Seu nome é: " + ultimoNome + ", " + inicialPrimeiroNome + ".");

        teclado.close();
    }
}
