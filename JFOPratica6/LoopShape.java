package JFOPratica6;

import java.util.Scanner;

public class LoopShape {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite a largura do retângulo: ");
        int largura = teclado.nextInt();
        System.out.print("Digite a altura do retângulo: ");
        int altura = teclado.nextInt();
        createRectangle(largura, altura);

        System.out.print("Digite o tamanho da perna do triângulo: ");
        int perna = teclado.nextInt();
        createTriangle(perna);
        teclado.close();
    }

    private static void createTriangle(int perna) {
        if (perna <= 1) {
            System.out.println("A perna deve ser maior que 1");
            return;
        } else {
            for (int i = 0; i <= perna; i++) {
                for (int j = 0; j < i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }

    }

    private static void createRectangle(int largura, int altura) {
        if (largura <= 1 || altura <= 1) {
            System.out.println("A largura e a altura devem ser maiores que 1");
            return;
        } else {
            for (int i = 0; i < altura; i++) {
                for (int j = 0; j < largura; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }

    }

}
