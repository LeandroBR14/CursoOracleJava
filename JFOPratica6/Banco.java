package JFOPratica6;

import java.util.Scanner;

public class Banco {
    public static void main(String[] args) {
        int pinValido = 1234;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o PIN: ");
        int pin = teclado.nextInt();
        while (pin != pinValido) {
            System.out.println("PIN inválido");
            System.out.print("Digite o PIN: ");
            pin = teclado.nextInt();
        }
        System.out.println("O PIN correto foi inserido, agora você tem acesso à conta.");
        teclado.close();
    }
    
}
