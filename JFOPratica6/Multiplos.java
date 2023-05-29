package JFOPratica6;

import java.util.Scanner;

public class Multiplos {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite um número para ver seus múltiplos até 12: ");
        int n = teclado.nextInt();
        for (int i = 1; i <= 12; i++) {
            System.out.println(n + " x " + i + " = " + n * i);
        }
        teclado.close();
    }
    
}
