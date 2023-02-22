package calculadora;

import org.w3c.dom.ls.LSOutput;

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
            double division = (double) num1 / (double) num2;
            int modulo = num1 % num2;
            System.out.println("La division de: " + num1 + " / " + num2 + " es: " + division );
            System.out.println("El modulo de: " + num1 + " % " + num2 + " es: " + modulo );
        }catch (Exception e){
            System.out.println("Division entre 0");
        }
    }
    public void numeMayor(int num1, int num2){
        if (num1 > num2){
            System.out.println("el numero: " + num1 + " es mayor");
        } else if (num1 == num2) {
            System.out.println("Los numeros son iguales");
        }else {
            System.out.println("el numero: " + num2 + " es mayor");
        }
    }

    public void divisible(int numero){
        String resultado = ((numero % 2 ) == 0)? "es divisible":"No es divisible";
        System.out.println(resultado);
    }
}
