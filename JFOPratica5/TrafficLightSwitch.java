package JFOPratica5;

import java.util.Scanner;

public class TrafficLightSwitch {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite a cor atual do semáforo (1 vermelho) (2 verde) (3 amarelo): ");
        int corAtual = teclado.nextInt();
        switch (corAtual) {
            case 1:
                System.out.println("A próxima cor do semáforo é verde");
                break;
            case 2:
                System.out.println("A próxima cor do semáforo é amarelo");
                break;
            case 3:
                System.out.println("A próxima cor do semáforo é vermelho");
                break;
            default:
                System.out.println("Cor inválida");
                break;
        }
        teclado.close();
    }

}
