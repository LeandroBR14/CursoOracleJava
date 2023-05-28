package JFOPratica4;
import java.util.Scanner;
public class Problema1{
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Qual a temperatura em Fahrenheit?");
        double tempF = teclado.nextDouble();

        double tempC = 5 * ((tempF-32) / 9);

        System.out.println("A temperatura em graus Celsius é de : " +tempC);
        teclado.close();
    }
}

