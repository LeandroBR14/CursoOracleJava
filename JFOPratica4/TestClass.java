package JFOPratica4;

public class TestClass {
    public static void main(String[] args) {
        ComputeMethods compute = new ComputeMethods();
        
        double fahrenheit = 100.0;
        double celsius = compute.fToC(fahrenheit);
        System.out.println("Fahrenheit: " + fahrenheit);
        System.out.println("Celsius: " + celsius);
        
        int sideA = 3;
        int sideB = 4;
        double hipotenusa = compute.hipotenusa(sideA, sideB);
        System.out.println("Lado A: " + sideA);
        System.out.println("Lado B: " + sideB);
        System.out.println("Hipotenusa: " + hipotenusa);
        
        int dadoRolado = compute.dado();
        System.out.println("Dado rolado: " + dadoRolado);
    }
}
