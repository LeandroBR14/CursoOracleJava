package JFOPratica4.Problema1;

public class ComputeMethods {
    public double fToC(double degreesF) {
        double degreesC = (degreesF - 32) * 5 / 9;
        return degreesC;
    }

    public double hipotenusa(int a, int b) {
        double c = Math.sqrt(a * a + b * b);
        return c;
    }

    public int dado() {
        int randomNumber = (int) (Math.random() * 6) + 1;
        return randomNumber;
    }
}