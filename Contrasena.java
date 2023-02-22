package contrasena;

import java.util.Objects;
import java.util.Scanner;

public class Contrasena {
    Scanner sc = new Scanner(System.in);
    private String contrasena = "1234";
    String password;
    public void verificar(){
        byte i = 1;
        while (i <= 3){
            System.out.println("A continuacion ingresa tu contrasena, intento " + i);
            password = sc.nextLine();
            if (Objects.equals(contrasena, password)){
                System.out.println("Contrasena correcta");
                break;
            }else {
                System.out.println("Contrasena incorrecta");
            }
            i++;
        }
    }
}
