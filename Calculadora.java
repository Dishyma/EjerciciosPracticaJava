package calculadora;

public class Calculadora {
    public Calculadora() {
    }
    public void calcular(int num1, int num2){
        int suma = num1 + num2;
        int resta = num1 - num2;
        int multiplicaion = num1 * num2;
        System.out.println("La suma de: " + num1 + " + " + num2 + " es: " + suma );
        System.out.println("La resta de: " + num1 + " - " + num2 + " es: " + resta );
        System.out.println("La multiplicacion de: " + num1 + " + " + num2 + " es: " + multiplicaion );
        try {
            int division = num1 / num2;
            int modulo = num1 % num2;
            System.out.println("La division de: " + num1 + " / " + num2 + " es: " + division );
            System.out.println("El modulo de: " + num1 + " % " + num2 + " es: " + modulo );
        }catch (Exception e){
            System.out.println("Division entre 0");
        }
    }
    public void numeMayor(int num1, int num2){
        
    }
}
