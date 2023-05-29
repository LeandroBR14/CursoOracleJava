package JFOPratica5;

import java.util.Scanner;

public class ColorRange {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o comprimento da onda em nanômetros: ");
        double onda = teclado.nextDouble();
        if (onda >= 480 && onda < 450) {
            System.out.println("A cor é violeta");
        } else if (onda >= 450 && onda < 495) {
            System.out.println("A cor é azul");
        } else if (onda >= 495 && onda < 570) {
            System.out.println("A cor é verde");
        } else if (onda >= 570 && onda < 590) {
            System.out.println("A cor é amarelo");
        } else if (onda >= 590 && onda < 620) {
            System.out.println("A cor é laranja");
        } else if (onda >= 620 && onda < 750) {
            System.out.println("A cor é vermelho");
        } else {
            System.out.println("A cor não está no espectro visível");
        }
        teclado.close();
    }
    
}
