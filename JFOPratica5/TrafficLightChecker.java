package JFOPratica5;

import java.util.Scanner;

public class TrafficLightChecker {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite a cor atual do semáforo (1 vermelho) (2 verde) (3 amarelo): ");
        Double corAtual = teclado.nextDouble();
        if (corAtual == 1) {
            System.out.println("A próxima cor do semáforo é verde");
        } else if (corAtual == 2) {
            System.out.println("A próxima cor do semáforo é amarelo");
        } else if (corAtual == 3) {
            System.out.println("A próxima cor do semáforo é vermelho");
        } else {
            System.out.println("Cor inválida");
        }
        teclado.close();
    }
}
