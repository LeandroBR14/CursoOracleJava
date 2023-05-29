//2.	Calcula o tamanho da hipotenusa de um triângulo dado o comprimento de seus lados.
package JFOPratica4;
import java.util.Scanner;
public class Problema2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o valor do cateto 1: ");
        double cateto1 = teclado.nextDouble();
        System.out.print("Digite o valor do cateto 2: ");
        double cateto2 = teclado.nextDouble();

        double hipotenusa = (cateto1 * cateto1) + (cateto2 * cateto2);
        hipotenusa = Math.sqrt(hipotenusa);

        System.out.println("A hipotenusa é: " + hipotenusa);

        teclado.close();
    }
}