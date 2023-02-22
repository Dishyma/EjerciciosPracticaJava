package nombre;

import java.util.Scanner;
public class ImpresionNombre {
    public String mostrarNombre(){
        System.out.println("Cual es tu nombre?");
        Scanner sc = new Scanner(System.in);
        String nombre = sc.nextLine();
        return "Tu nombre es: " + nombre;
    }
}
